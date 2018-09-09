


import java.util.Scanner;

public class MatrixMul {
    public static void main(String[] args) {
        int r1,r2,c1,c2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter dimensions of matrix 1: ");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        
        System.out.println("Enter dimensions of matrix 2: ");
        r2 = sc.nextInt();
        c2 = sc.nextInt();
        
        if(c1 != r2)
        {
            System.out.println("Matrix Multiplication cant be performed!!!");
            System.exit(0);
        }
        
        int mat1[][] = new int[r1][c1];
        int mat2[][] = new int[r2][c2];
        
        int i,j,k,tmp;
        
        System.out.println("Enter matrix 1: ");
        
        for(i=0;i<r1;i++)
            {
                for(j=0;j<c1;j++)
                {
                    tmp = sc.nextInt();
                    mat1[i][j] = tmp;
                }
                    
            }
        
        System.out.println("Enter matrix 2: ");
        
        for(i=0;i<r2;i++)
            {
                for(j=0;j<c2;j++)
                {
                    tmp = sc.nextInt();
                    mat2[i][j] = tmp;
                }
                    
            }
        
        int product[][] = new int[r1][c2];
        
        for(i=0;i<r1;i++)
            {
                for(j=0;j<c2;j++)
                {
                    for(k=0;k<c1;k++)
                    {
                        product[i][j] += (mat1[i][k]*mat2[k][j]);
                    }
                }
                    
            }
        
        System.out.println("Product of the 2 martices is :");
        for(i=0;i<r1;i++)
            {
                for(j=0;j<c2;j++)
                {
                    System.out.print(product[i][j]+" ");
                }
                System.out.println();
                    
            }
        
        
        
        
        
        
        
    }
    
    
    
}
