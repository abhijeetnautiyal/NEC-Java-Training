
import java.util.Arrays;
import java.util.Collection;



class GenereicCount{

    public static <T> int count(Collection<T> x, TestInterface<T> y)
    {
        int cnt =0;
        for(T element: x) if(y.test(element)) ++cnt;
        return cnt;
    }
    
}

interface TestInterface<T> {
    public boolean test(T obj);

}



class OddTest implements TestInterface<Integer>
{

    @Override
    public boolean test(Integer obj) {
        if(obj%2 ==0) return false;
        else return true;
    }
    
}

class PalindromeTest implements TestInterface<String>
{

    @Override
    public boolean test(String s) {
        return (s.equals(new StringBuilder(s).reverse().toString())); 
        
    }
    
}
        


public class GenereicCountTest {
    public static void main(String args[])
    {
        Collection<Integer> c1 = Arrays.asList(1,2,3,4,7,9,11,13);
        int cnt1 = GenereicCount.count(c1, new OddTest());
        System.out.println("No of odd element = "+cnt1);
        
        Collection<String> c2 = Arrays.asList("hello", "pop", "sip", "mom", "diaid");
        int cnt2 = GenereicCount.count(c2, new PalindromeTest());
        System.out.println("No Palindromes = "+cnt2);
        
        
    }
    
}
