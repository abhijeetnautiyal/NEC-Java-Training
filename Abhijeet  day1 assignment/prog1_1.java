


import java.util.Scanner;

public class prog1_1 {
     public static void main(String[] args) {
        
        int a, b, tmp;// using tmp variable
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter value of a (1st no) :");
        a = sc.nextInt();
        
        System.out.println("Enter value of b (2nd no) :");
        b = sc.nextInt();
        
        tmp = a;
        a = b;
        b = tmp;
        
        System.out.println("New value of a :"+a);
        System.out.println("New value of b :"+b);
  
        
        
        
    }
    
    
}
