import java.util.Scanner;

public class ArrayMaxEle {
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
        int max1 = A[0] ,max2 = A[0];
        for (i=1;i<n;i++)
        {
            if(A[i]>max1)
            { max2 = max1;
            max1 = A[i];
            }
            else if(A[i]>max2)
            max2=A[i];
        
    }
           
        System.out.println("First 2 Max Element of the array is = "+max1 +" "+max2);
    }
    
}
