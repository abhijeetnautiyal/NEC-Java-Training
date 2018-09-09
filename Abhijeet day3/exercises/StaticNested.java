
public class StaticNested {
	
	static int data = 30;
	static class Inner{
		void msg() {System.out.println("Data is "+data);}
		static void msg2()
		{
			System.out.println("Data is "+data);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticNested.Inner obj = new StaticNested.Inner();
		obj.msg();
		StaticNested.Inner.msg2();
		
		

	}

}
