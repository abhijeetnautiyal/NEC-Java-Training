import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		
		int count[] = {34,24,346,636,631};
		Set<Integer> set = new HashSet<Integer>();
		
		try
		{
			for(int i=0;i<5;i++)
			{
				set.add(count[i]);
			}
			System.out.println(set);
			
			TreeSet sortedSet = new TreeSet<Integer>(set);
			
			System.out.println("The sorted list is:");
			System.out.println(sortedSet);
			
			System.out.println("1st element: "+(Integer)sortedSet.first());
			System.out.println("last element: "+(Integer)sortedSet.last());
			
			
		}
		catch(Exception e) {}

	}

}
