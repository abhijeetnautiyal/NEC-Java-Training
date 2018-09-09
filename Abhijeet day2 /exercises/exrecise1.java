
public class exrecise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = {{1,3}, {3,4,5}};
		int b[][] = {{1,3,4},{3,4,5}};
		
		
		int i,j;
		
		
		for(i=0; i<a.length; i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				b[i][j] += a[i][j];
			}
		}
		
		//sum print
		for(i=0; i<b.length; i++)
		{
			for(j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		
		

	}

}
