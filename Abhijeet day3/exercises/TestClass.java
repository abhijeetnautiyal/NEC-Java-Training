
final class ImmutableStudent {
	
	private final int id;
	private final String name;
	private final Age age;
	
	public ImmutableStudent(int id, String name, Age age)
	{
		this.name = name;
		this.id = id;
		Age clone = new Age();
		
		//deepcopy
		clone.setDay(age.getDay());
		clone.setMonth(age.getMonth());
		clone.setYear(age.getYear());
		
		this.age = clone;
	}
	
	public int getId() {return id;}
	public String getName() {return name;}
	public Age getAge() 
	{
		Age clone = new Age();
		
		//deepcopy
		clone.setDay(age.getDay());
		clone.setMonth(age.getMonth());
		clone.setYear(age.getYear());
		return clone;
		}

	
}

public class TestClass{
	public static void main(String[] args) {
		Age age = new Age();
		
		age.setDay(1);
		age.setMonth(1);
		age.setYear(1996);
		ImmutableStudent student = new ImmutableStudent(1, "Arun", age);
		System.out.println("Arun age before modification :"+student.getAge().getYear());
		//ImmutableStudent student = new ImmutableStudent(1, "Amar", 34);
		//System.out.println("ID   : "+student.getId()+"  Name: "+student.getName());
		age.setYear(1997);
		System.out.println("Arun age after modification  :"+student.getAge().getYear());
		student.getAge().setYear(1995);
		System.out.println("Arun age after modification  :"+student.getAge().getYear());
		
	}
	
}
