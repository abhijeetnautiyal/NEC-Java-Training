

import java.util.LinkedList;
import java.util.Scanner;


public class BinarySearch {
   public static int search(int arr[], int x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) 
        { 
            int m = l + (r-l)/2; 
  
            
            if (arr[m] == x) 
                return m; 
  
            
            if (arr[m] < x) 
                l = m + 1; 
  
            
            else
                r = m - 1; 
        } 
  
         
        return -1; 
    }
   
   public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter no of elements:");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        int tmp;
        for(int i=0;i<n;i++)
        {
            tmp = sc.nextInt();
            arr[i] = tmp;
        }
        
        System.out.println("Enter element to be searched");
        int val = sc.nextInt();
        
        int res = search(arr,val);
        
        if(res==-1) System.out.println("Element not found");
        else System.out.println("Element found at index "+ res);
        
    }
    
}
