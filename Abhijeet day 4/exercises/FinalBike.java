public class FinalBike
{
	final int speedlimit = 90;
	void run()
	{
		speedlimit = 400;
	}
	
	public static void main(String[] args) {
		FinalBike obj new FinalBike();
		obj.run();
	}
	
}
