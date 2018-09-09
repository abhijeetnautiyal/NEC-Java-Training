class A
{
	interface Message{
		void msg();
	}
	
}
public class TestInterface2 implements A.Message {

	public static void main(String[] args) {
		A.Message message= new TestInterface2();
		message.msg();

	}

	@Override
	public void msg() {
		System.out.println("Hello nested interface2 !!!!!");
		
	}

}
