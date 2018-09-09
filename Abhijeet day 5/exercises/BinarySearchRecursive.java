

import java.util.Scanner;


public class BinarySearchRecursive {
    public static int search(int arr[], int l, int r, int x) 
    { 
        if (r>=l) 
        { 
            int mid = l + (r - l)/2; 
  
            if (arr[mid] == x) 
               return mid; 
  
             if (arr[mid] > x) 
               return search(arr, l, mid-1, x); 
  
             return search(arr, mid+1, r, x); 
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
        
        int res = search(arr,0, arr.length,val);
        
        if(res==-1) System.out.println("Element not found");
        else System.out.println("Element found at index "+ res);
        
    }
    
}
