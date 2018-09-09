import java.util.Collections;
import java.util.LinkedList;

class TestSum<Z> {
	Z obj1, obj2;
	
	TestSum(Z x, Z y)
	{
		obj1 = x; obj2 =y;
	}
	
	public Z sum(Z x, Z y)
	{
		return x+y;
		
	}
	public void getSum()
	{
		if(obj1 instanceof Integer) System.out.println(((Integer) obj1).intValue()+((Integer) obj2).intValue());
		if(obj1 instanceof String) System.out.println((String)obj1.toString()+(String)obj2.toString());
		if(obj1 instanceof Float) System.out.println((Double)obj1+(Double)obj2);
		
	}
	
	
	
}

public class GenericExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
