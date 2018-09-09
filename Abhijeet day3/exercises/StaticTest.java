import javax.rmi.CORBA.StubDelegate;

public class StaticTest {
int rollno;
static String college = "HBTI";
static void change() {college = "HBTU";}

StaticTest(int r){rollno =r;}

void display() {System.out.println(rollno+" "+college);}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticTest s1 = new StaticTest(111);
		StaticTest s2 = new StaticTest(222);
		
		s1.display();
		
		StaticTest.change();
		
		s1.display();
		s2.display();

	}

}
