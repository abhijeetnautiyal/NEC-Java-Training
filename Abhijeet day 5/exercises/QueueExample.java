import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<String> qe = new LinkedList<String>();
		qe.add("b");qe.add("a");qe.add("c");
		qe.add("e");qe.add("d");
		
		Iterator it = qe.iterator();
		System.out.println("Size of queue: "+qe.size());
		
		while(it.hasNext())
		{
			String iteratorValue = (String)it.next();
			
			System.out.println("Queue Next Value:" + iteratorValue);
		}
		
		System.out.println("Queue Peek: "+qe.peek());
		System.out.println("Queue Poll: "+qe.poll());
		System.out.println("Queue Size: "+qe.size());
		

	}

}
