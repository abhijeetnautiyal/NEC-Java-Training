import java.util.Date;

class GeometricObject{
	private String color;
	private boolean filled;
	private Date dateCreated;
	
	public String getColor()
	{
		return color;
	}
	public void setColor(String x)
	{
		
	}
	
	public boolean isFilled()
	{return false;}
	
	public void setFilled(boolean x)
	{
		filled = x;
	}
	
	public Date getDateCreated()
	{
		return dateCreated;
	}
	public String toString()
	{
		return "YES";
	}
	
	public double getArea()
	{
		return 1.0;
	}
	
	public double getPerimeter()
	{
		return 5.0;
	}
	
}

class Circle extends GeometricObject
{
	
	double radius;
	
	Circle(){
		System.out.println("Circle");}
	
	Circle(double r){
		System.out.println("Circle");}
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double radius)
	{
		
	}
	
	public double getDiameter()
	{
		return radius*2;
	}
	
	public double getArea()
	{
		return 3.14*radius*radius;
		
	}
	
	
}

class Rectangle extends GeometricObject
{
	double width;
	double height;
	
	
	public Rectangle() {
		System.out.println("Buliding Rectangle");
	}
	
	public Rectangle(double w, double h) {
		width = w;
		height =h;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public void setWidth(double width)
	{
		this.width = width;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	public double getArea()
	{
		return height*width;
		
	}
	
}

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle

	}

}
