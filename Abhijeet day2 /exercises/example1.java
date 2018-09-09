interface A{
	void a();
	void d();
	void c();
}

abstract class B implements A{
	public void c() {System.out.println("I am C");}
}

class M extends B{
	public void a() {System.out.println("I am A");}
	public void d() {System.out.println("I am D");}
}

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new M(); // reference to interface can be made
		//System.out.println(a);
		a.a();
		a.c();
		a.d();
		

	}

}
