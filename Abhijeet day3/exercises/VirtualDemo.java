class Employee
{
	private String name, address;
	private int number;
	public Employee(String name, String address, int number)
	{
		System.out.println("Constructing an Employee");
		
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	public void mailCheck() 
	{
		System.out.println("Mailing check to "+this.name+" "+this.address);
		
	}
	
	public String toString() { return name+" "+address+" "+number; }
	
	public String getName() {return name;}
	
	public String getAddress() {return address;}
	
	public void setAddress(String newAddress) {address = newAddress;}
	
	public int getNumber() {return number;}
	
	
}

class Salary extends Employee{
	private double salary;
	public Salary(String name, String address, int number, double salary)
	{
		super(name, address, number); setSalary(salary);
	}
	
	public void mailCheck()
	{
		System.out.println("Within Mail check of salary class");
		System.out.println("Mailing check to "+getName()+" with salary "+salary);
		
	}
	
	public double getSalary() {return salary;}
	
	public void setSalary(double newSalary)
	{
		if(newSalary >= 0.0) salary = newSalary;
	}


public double computePay()
{
	System.out.println("Computing salary pay for "+ getName());
	return salary/52;
	
}


}






// virtual method invocation
public class VirtualDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary s = new Salary("Arun", "Ayodhya, UP",1,56000);
		Employee e = new Salary("Aman", "Ayodhya, UP",2,60000);
		
		System.out.println("Mail check of Salary  : ");
		s.mailCheck();
		
		System.out.println("Mail check of Employee: ");
		e.mailCheck();

	}

}
