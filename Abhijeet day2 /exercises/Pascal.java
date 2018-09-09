
import java.util.Scanner;

public class Pascal
{
    public static void main(String args[])
	{
	    int rows, i, k, number=1, j;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number of Rows : ");
		rows = sc.nextInt();
		
		for(i=0;i<rows;i++)
		{
			for(k=rows; k>i; k--)
			{
				System.out.print(" ");                                                                     
			}
            number = 1;
			for(j=0;j<=i;j++)
			{
				 System.out.print(number+ " ");
                 number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}