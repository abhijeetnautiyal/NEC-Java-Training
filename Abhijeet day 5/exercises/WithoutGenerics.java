
import java.util.*; 
  
class WithoutGenerics
{ 
    public static void main(String[] args) 
    { 
        
        ArrayList al = new ArrayList(); 
  
        al.add("Sachin"); 
        al.add("Rahul"); 
        al.add(10);
  
        String s1 = (String)al.get(0); 
        String s2 = (String)al.get(1); 
  
        
        String s3 = (String)al.get(2); 
    } 
}