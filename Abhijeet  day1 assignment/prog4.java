import java.util.Scanner;

class Wrap{
	int value;
	Wrap(int x){value = x;}
}

public class swapWrapper {
	
	public static void swap(Wrap a, Wrap b)
	{
		int tmp = a.value;
		a.value = b.value;
		b.value = tmp;
		
	}

	public static void main(String[] args) {
		
		  Wrap a, b;
	       Scanner sc = new Scanner(System.in);
	        
	       System.out.println("Enter value of a (1st no) :");
	       a = new Wrap(sc.nextInt());
	        
	       System.out.println("Enter value of b (2nd no) :");
	       b = new Wrap(sc.nextInt());
	        
	        swap(a,b);
	        System.out.println("New value of a :"+a.value);
	        System.out.println("New value of b :"+b.value);
		
		

	}

}
