class EncapTest
{
	private String id;
	private int age;
	private String name;
	
	public String getId() {return id;}
	public int getAge() {return age;}
	public String getName() {return name;}
	
	public void setId(String x) {id = x;}
	public void setAge(int x) {age = x;}
	public void setName(String x) {name = x;}
	
	}
public class RunEncap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapTest obj = new EncapTest();
		obj.setId("A005");
		obj.setAge(45);
		obj.setName("John");
		
		//print details
		System.out.println("Id   : "+obj.getId());
		System.out.println("Age  : "+obj.getAge());
		System.out.println("Name : "+obj.getName());

	}

}
