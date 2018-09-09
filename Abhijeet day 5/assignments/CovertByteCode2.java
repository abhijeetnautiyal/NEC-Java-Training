

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


class Block{
    
    Stack<Object> operand_stack = new Stack<>();
    LinkedList<Object> local_variables = new LinkedList<>();
    LinkedList<Object> constant_pool = new LinkedList<>();
    
    public int line_no;
    private String getSub(String x)
    {HashMap<String,String> hm=new HashMap<String,String>();
    hm.put("int", "iload");
    hm.put("byte", "iload");
    hm.put("char", "iload");
    hm.put("new ", "astore");
    hm.put("func","invokespecial");
    hm.put("double", "dload");
    
    if(x.contains("int")) return hm.get("int");
    if(x.contains("byte")) return hm.get("byte");
    if(x.contains("char")) return hm.get("char");
    if(x.contains("new")) return hm.get("new");
    if(x.contains("(")&& x.contains(")") ) return hm.get("func");
    if(x.contains("double")) return hm.get("double");
    
    return x;
            }
    public Block(String blk){
        
        String lines[] = blk.split("\n");
        LinkedList<String> statements = new LinkedList<>();
        
        for(String line: lines)
        {
            
            if(line.contains(";")) ///if multiple statements in one line
            {
                String tmp[] = line.split(";");
            
                for(String statement: tmp)
                {
                    //System.out.println("Hi");
                    if(!statement.contains("\n"))statements.add(statement);
                }
            }
            else statements.add(line);
            
        }
        
        for(int i=0;i<statements.size();i++) System.out.println(i+" "+ this.getSub(statements.get(i)));
        //for(String s: statements) System.out.println(s);
    }
    
    
    
    
    
}


public class CovertByteCode2 {
    
    Stack<String> bstk = new Stack<>();
    
    
    
    public static void main(String[] args){
        
        String s = "import java.util.Scanner;\n" +
"\n" +
"\n" +
"public class Area {\n" +
"    \n" +
"    public static double circleArea(double r) \n" +
"    {   \n" +
"        double pi = 3.14;\n" +
"\n" +
"        double area = pi * r *r;\n" +
"\n" +
"        return area;\n" +
"    }\n" +
"    \n" +
"    public static void main(String[] args) {\n" +
"        \n" +
"        Scanner sc = new Scanner(System.in);\n" +
"        \n" +
"        double radius, area1;\n" +
"\n" +
"        System.out.println(\"Enter the radius of circle: \");\n" +
"\n" +
"        radius = sc.nextDouble();\n" +
"\n" +
"        area1 = circleArea(radius);\n" +
"\n" +
"        System.out.println(area1);\n" +
"\n" +
"        for(int i =0; i<3; i++)\n" +
"        {\n" +
"            System.out.println(i);\n" +
"        }\n" +
"\n" +
"        \n" +
"        \n" +
"        \n" +
"    }\n" +
"    \n" +
"}";
        
        String lines[] = s.split("\n");
       
        //System.out.println("len = " +lines.length);
        /*
        for(int i =0; i<lines.length; i++)
        {
            if(lines[i].contains("int ")) {lines[i] = "i_store";}
            else if(lines[i].contains("float ")) lines[i] = "f_store";
            else if(lines[i].contains("String ")|| lines[i].contains("new ")) lines[i] = "a_store";
            else if(lines[i].contains(");")) lines[i] = "invoke_special:fn";
            
            //System.out.println(line);
            
        }
        
        for(String x:lines)
        {
            System.out.println(x);
        }
*/
        
  //      System.out.println(lines.length);
  
   
        Stack<Block> stk = new Stack<>();
        
        int cnt =0;
        
        //LinkedList<String> blocks = new LinkedList<>();
        String[] blocks = new String[100];
        
        int ind =0;
        for(int i =0;i<100;i++) blocks[i] = "";
         
        String tmp="";
        for (int i=0;i<lines.length; i++)
        {
            if(lines[i].contains("{")) ind++;
            
            
            
            else if(lines[i].contains("}"))
            {
                ind --;
                
            }
            blocks[ind] += lines[i]+"\n";
         
        }
        
        
        
        //System.out.println(blocks.length);
        for(int i=0; i<blocks.length;i++)
        {
            if(blocks[i]=="") break;
            System.out.println("############################");
            //System.out.println(blocks[i]);
            Block b1 = new Block(blocks[i]);
        }
        
        
        
        
        
        
        
        
        
       
    
    }
    
}
