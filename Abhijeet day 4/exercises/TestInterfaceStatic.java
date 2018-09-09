interface Drawable1
{
    void draw();
	
	static int cube(int x) {return x*x*x;}
	
	
}

class Rectangle2 implements Drawable1{

	@Override
	public void draw() {
		System.out.println("Drawing rectangle");
	}
	
}



public class TestInterfaceStatic {
	
	public static void main(String[] args) {
		Drawable1 d  = new Rectangle2();
		d.draw();
		System.out.println(Drawable1.cube(3));
	}

}
