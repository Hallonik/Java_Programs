import java.util.*;

public class MatrixMultipliction 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the row and Column for A Matrix : ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("Enter the matrix A : ");
        int A[][] = new int[r1][c1];
        int i,j;
        for(i=0;i<r1;i++){
            for(j=0;j<c1;j++){
                System.out.println("Enter the value for A"+i+j+" : ");
                A[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the row and Column for B Matrix : ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        System.out.println("Enter the matrix B : ");
        int B[][] = new int[r2][c2];
        for(i=0;i<r2;i++){
            for(j=0;j<c2;j++){
                System.out.println("Enter the value for B"+i+j+" : ");
                B[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix A : ");
        for(i=0;i<r1;i++){
            for(j=0;j<c1;j++){
                System.out.print(A[i][j]+"  ");
            }
            System.out.println("");
        }
        System.out.println("Matrix B : ");
        for(i=0;i<r2;i++){
            for(j=0;j<c2;j++){
                System.out.print(B[i][j]+"  ");
            }
            System.out.println("");
        }
        int k;
        int C[][];
        C =new int[r1][c2];
        for(i=0;i<r1;i++){
           for(j=0;j<c2;j++){
               C[i][j]=0;
           }
       if (c1 != r2)
       System.out.println("Multiplication not possible");
       else
       {
        for(i=0;i<r1;i++){
            for(j=0;j<c2;j++)
            {
                for (k=0;k<r2;k++)
                 C[i][j]+=A[i][k]*B[k][j];
            }
        }
       
       System.out.println("Matrix C : ");
       for(i=0;i<r1;i++){
        for(j=0;j<c2;j++){
            System.out.print( C[i][j]+"  ");
        }
        System.out.println("");
        }
      }
    }
    
 
}
}
