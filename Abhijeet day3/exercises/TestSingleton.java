
class Singleton {

	private static Singleton single_instance = null;
	
	public String s;
	
	//private constructor
	private Singleton() {
		s = "Hello! I am a string of singleton class.";
		
	}
	
	// static func to get object
	public static Singleton getInstance()
	{
		if(single_instance == null)
			single_instance = new Singleton();
		return single_instance;
	}
}

public class TestSingleton
{
	public static void main(String[] args) {
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		
		x.s = (x.s).toUpperCase();
		
		System.out.println("x : "+x.s);
		System.out.println("y : "+y.s);
		System.out.println("z : "+z.s);
		
		System.out.println();
		
		z.s = (z.s).toLowerCase();
		
		System.out.println("x : "+x.s);
		System.out.println("y : "+y.s);
		System.out.println("z : "+z.s);
		
		
		
		
	}
}
