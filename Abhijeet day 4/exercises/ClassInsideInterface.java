interface Outer1
{
	void show();
	
	class Inner1{
		public void display()
		{
			System.out.println("Hello 1");
		}
		
	}
	
}




public class ClassInsideInterface extends Outer1.Inner1 implements Outer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassInsideInterface t1 = new ClassInsideInterface();
		t1.display();
		t1.show();

	}

	@Override
	public void show() {
		System.out.println("Hello 2 hola");
		
	}

}
