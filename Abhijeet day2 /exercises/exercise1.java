// An abstract class with constructor
abstract class Shape {
    protected String color;
    
    public abstract double getArea();
    public abstract void toStr();
    
}

class Rectangle extends Shape
{
	private int length;
	private int width;
	
	public Rectangle(int l, int b, String color)
	{
		this.length = l;
		this.width = b;
		this.color = color;
	}

	
	public double getArea() {
		
		return length*width;
	}

	
	public void toStr() {
		
		System.out.println("Area of rectangle: "+ this.getArea());
		System.out.println("Color:" +this.color);
		System.out.println();

	}
	
	
}

class Triangle extends Shape
{
	private int base,height;
	public Triangle(int b, int h, String color)
	{
		this.base = b;
		this.height = h;
		this.color = color;
	}

	
	public double getArea() {
		
		return 0.5*base*height;
	}

	
	public void toStr() {
		
		System.out.println("Area of triangle: "+this.getArea());
		System.out.println("Color:" +this.color);
		System.out.println();
	}
	
}
public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle obj1 = new Rectangle(2,4, "Red");
		Triangle obj2 = new Triangle(4, 6, "Blue");
		obj1.toStr();
		obj2.toStr();

	}

}
