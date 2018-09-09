


import java.util.Arrays;


public class LambdaSort {
    public static void main(String[] args) {
        
        String s = "The weather is good today";
        String arr[] = s.split(" ");
        Arrays.sort(arr, (x,y)->x.length()-y.length());
        
        for(String word: arr)
        {
            System.out.print(word+" ");
        }
        System.err.println("");
        
    
        
    }
    
}
