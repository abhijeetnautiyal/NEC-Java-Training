

import java.util.Scanner;


public class prime100 {
    
    public static void sieve(int n) 
    {   
        int sum = 0,cnt =0;
        boolean prime[] = new boolean[n+1]; 
        for(int i=0;i<n;i++) 
            prime[i] = true; 
          
        for(int p = 2; p*p <=n; p++) 
        { 
            if(prime[p] == true) 
            {  
                for(int i = p*2; i <= n; i += p) 
                    prime[i] = false; 
            } 
        } 
        
        System.out.println("First 100 primes are:");
         
        for(int i = 2; i <= n; i++) 
        { 
            if(cnt>=100) break;
            if(prime[i] == true) 
            {System.out.print(i + " ");
                sum += i;
                cnt++; }
        }
        //System.out.println("cnt="+cnt);
  
        System.out.println("\n\nSum = "+sum);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //int x = sc.nextInt();
        
        sieve(1000);
        
    }
    
}
