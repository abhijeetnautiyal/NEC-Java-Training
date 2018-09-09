interface Drawable{
	void draw();
	
	default void msg() {System.out.println("default method");}
}

class Rectangle1 implements Drawable{
	public void draw()
	{
		System.out.println("Drawing rectangle");
	}
}

public class TestInterfaceDefault {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable d = new Rectangle1();
		d.draw();
		d.msg();

	}

}
