import java.util.Scanner;


public class prog2 {
     public static void main(String[] args) {
        
        int a;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter length of the side of hexagon :");
        a = sc.nextInt();
        
        double tmp = (3.0/2.0)*Math.sqrt(3);
        
        System.out.println("Area of hexagon : "+ tmp*a*a);
  
        
        
        
    }
    
    
}
