public class CovertByteCode {
    
    public static void main(String[] args){
        
        String s = "public class prog2 {\n" +
"     public static void main(String[] args) {\n" +
"        \n" +
"        int a;\n" +
"        Scanner sc = new Scanner(System.in);\n" +
"        \n" +
"        System.out.println(\"Enter length of the side of hexagon :\");\n" +
"        a = sc.nextInt();\n" +
"        \n" +
"        double tmp = (3.0/2.0)*Math.sqrt(3);\n" +
"        \n" +
"        System.out.println(\"Area of hexagon : \"+ tmp*a*a);\n" +
"  \n" +
"        \n" +
"        \n" +
"        \n" +
"    }\n" +
"    \n" +
"    \n" +
"}";
        
        String lines[] = s.split("\n");
        String res[] = new String[10000];
        int ind = 0;
        for(String x:lines)
        {
            //System.out.println(x);
        }
        //System.out.println("len = " +lines.length);
        
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
       
    
    }
    
}
