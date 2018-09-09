class TestSum<T>{
	public T sum(T x, T y)
	{
		if(x instanceof String)
		{
			return (T) ((T) (String)x+(String)y);
		}
		else if(x instanceof Integer)
		{
			return (T) ((Integer)x+(Integer)y);
		}
	}
}
public class GenericMethodSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSum<Integer> i = new TestSum<Integer>();

	}

}
