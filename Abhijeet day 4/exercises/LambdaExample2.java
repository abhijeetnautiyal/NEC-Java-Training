
public class LambdaExample2 {

	public static void main(String[] args) {
		
		LambdaExample2 obj = new LambdaExample2();
		
		MathOperation addition = (int a, int b)->a+b;
		
		MathOperation subtraction = (a, b)->a-b;
		
		MathOperation multiplication = (int a, int b)->{return a*b;};
		
		MathOperation division = (int a, int b)->a/b;
		
		
		System.out.println("10 + 5 = " + obj.operate(10, 5, addition));
		System.out.println("10 - 5 = " + obj.operate(10, 5, subtraction));
		System.out.println("10 * 5 = " + obj.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + obj.operate(10, 5, division));
		

	}
	interface MathOperation{
		int operation(int a,int b);
	}
	public int operate(int a,int b, MathOperation mathOperation)
	{
		return mathOperation.operation(a, b);
		
	}


}
