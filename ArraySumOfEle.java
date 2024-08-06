import java.util.*;

public class ArraySumOfEle {
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
        for(i=0;i<n;i++)
        {
            int a=sum;
            sum = sum + A[i];
            System.out.println(a+ " + "+A[i]+" = "+sum);
        }

        System.out.println("The sum of all the elements of the array is = "+sum);


    }
    
}
