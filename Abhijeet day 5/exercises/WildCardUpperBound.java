import java.util.Arrays;
import java.util.List;

public class WildCardUpperBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list1 = Arrays.asList(1,2,3);
		System.out.println("Total sum is : "+sum(list1));
		
		List<Double> list2 = Arrays.asList(1.1, 2.2, 3.3);
		System.out.println("Total sum is : "+sum(list2));
		
		
	}
	
	private static double sum(List<? extends Number> list)
	{
		double sum =0.0;
		
		for(Number i:list)
		{
			sum += i.doubleValue();
		}
		return sum;
	}

}
