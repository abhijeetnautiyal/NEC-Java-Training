interface Printable
{
void print();	
}

interface Showable extends Printable
{
void show();	
}



public Class InterfaceTest implements Printable, Showable {
	public void show() {
		System.out.println("Welcome");
		
	}

	
	public void print() {
		System.out.println("Hello");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceTest obj = new InterfaceTest();
		obj.show();
		obj.print();
		

	}


	
}
