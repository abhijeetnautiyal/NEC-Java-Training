
package day1.assignments.abhijeet;

import java.util.Scanner;

public class prog1_2 {
    public static void main(String[] args) {
        
        int a, b; // not using tmp variable
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter value of a (1st no) :");
        a = sc.nextInt();
        
        System.out.println("Enter value of b (2nd no) :");
        b = sc.nextInt();
        
        a = a+b;
        b = a-b;
        a = a-b;
        
        System.out.println("New value of a :"+a);
        System.out.println("New value of b :"+b);
  
        
        
        
    }
    
}
