
package day.pkg5.assignments;

import java.util.Arrays;
import java.util.List;




public class Day5Assignments {
    
    public static <T extends Comparable> T maxElement(List<T> list, int begin, int end)
    {
        T max = list.get(begin);
        
        for(int i= begin+1; i<end; i++)
        {
            T tmp = list.get(i);
            if(tmp.compareTo(max)>0) max = tmp;
        }
        
        return max;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Integer> list1 = Arrays.asList(1,5,7,6,8);
        
        
        System.out.println(maxElement(list1, 0, 3));
        System.out.println(maxElement(list1, 3, 5));
        
        List<Double> list2 = Arrays.asList(5.6, 7.8, 1.3, 3.14, 1.44);
        
        System.out.println(maxElement(list2, 2, 5));
        System.out.println(maxElement(list2, 1, 5));
        
        
        
        
        
    }
    
}
