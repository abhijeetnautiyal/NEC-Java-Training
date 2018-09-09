import java.util.Arrays;
import java.util.List;

public class WildCardLowerBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list1 = Arrays.asList(1,2,3);
		printlist(list1);
		
		
		List<Number> list2 = Arrays.asList(1.1, 2.2, 3.3);
		printlist(list2);
		
		
	}
	

	private static void printlist(List<? super Integer> list)
	{
		System.out.println(list);
	}


}
