
public class VarargsTest {
	
	static void fun(int...a)
	{
		System.out.println("No of arguments: "+a.length);
		
		for(int i:a)
			System.out.print(i+" ");
		
		System.out.println();
		
	}
	static void fun2(String s,int...a)
	{
		System.out.println("No of variable arguments: "+a.length);
		
		System.out.println("String :"+s);
		
		for(int i:a)
			System.out.print(i+" ");
		
		System.out.println();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fun2("gfk",100,200);
		fun2("csPortal",1,2,3,4);
		fun2("for geeks");

	}

}
