import java.util.Scanner;

public class ReverseCopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the no. of elements in the array (Array size defined = 20) : ");
        int n=sc.nextInt();
        System.out.println("enter the values in Array A :");
        int A []=new int[20],i,sum=0;
        for( i=0;i<n;i++)
        {
            A[i] =sc.nextInt();
        }
        int B[]=new int[20];
        int j=0;
        for(i=n-1;i>=0;i--)
        B[j++]=A[i];
        System.out.print("A[] : ");
        for( i=0;i<n;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
        System.out.print("B[] : ");
        for( i=0;i<n;i++)
        {
            System.out.print(B[i]+" ");
        }
    }
    
}
