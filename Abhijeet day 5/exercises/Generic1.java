class Test<Z,V>{
	Z obj1;
	V obj2;
	
	Test(Z obj1, V obj2){this.obj1= obj1; this.obj2 = obj2;}
	public void print()
	{
		System.out.println(obj1);
		System.out.println(obj2);
		}
}


public class Generic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test<String, Integer> obj = new Test<String, Integer>("Hi",145);
		obj.print();

	}

}
