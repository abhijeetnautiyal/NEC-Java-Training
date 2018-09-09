


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;


public class LinearSearch {
    
    public static int search(int arr[], int n, int val)
    {
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == val)
                return i;
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
        
        int res = search(arr, n, val);
        
        if(res==-1) System.out.println("Element not found");
        else System.out.println("Element found at index "+ res);
        
    }
    
}