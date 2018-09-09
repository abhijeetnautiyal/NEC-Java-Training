interface Showable
{
	void show();
	interface Message{
		void msg();
	}
	
}
public class TestInterface1 implements Showable.Message {

	public static void main(String[] args) {
		Showable.Message message= new TestInterface1();
		message.msg();

	}

	@Override
	public void msg() {
		System.out.println("Hello nested interface !!!!!");
		
	}

}
