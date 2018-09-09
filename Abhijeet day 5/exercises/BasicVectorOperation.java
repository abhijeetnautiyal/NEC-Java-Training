import java.util.Vector;

import javax.swing.text.html.HTMLDocument.Iterator;

public class BasicVectorOperation {

	public static void main(String[] args) {
		
		Vector<String> vct = new Vector<String>();
		
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		
		System.out.println(vct);
		
		vct.add(2,"random");
		
		System.out.println(vct);
		
		Iterator it = vct.iterator();
		
		
		
		
		
		
		
		

	}

}
