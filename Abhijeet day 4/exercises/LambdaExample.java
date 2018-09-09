interface GreetingService
{
	void sayMessage(String message);
}
public class LambdaExample {

	public static void main(String[] args) {
		
		GreetingService g1 = x->System.out.println("Hello "+x);
		// x replaces message param in GreetingServices
		g1.sayMessage("World");

	}

}
