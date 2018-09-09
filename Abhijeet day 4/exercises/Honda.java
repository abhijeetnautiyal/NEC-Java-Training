final class Bike
{
	final void run()
	{
		System.out.println("Running");
	}
	}

public class Honda extends Bike {
	
	void run() {System.out.println("Runing safely with 100kmph");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Honda  h = new Honda();
		h.run();

	}

}
