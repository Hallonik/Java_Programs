package CollectionFrameworks;
import java.util.*;

class MyComp implements Comparator<Integer>//defining own comparator
{
    public int compare(Integer i1,Integer i2){
        if(i1>i2) return -1;
        else if (i2>i1) return 1;
        return 0;

    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        int a[] = {2,4,6,8,1,3,5,7,9};
        int b[] = {2,4,6,8,1,3,5,7,9};

        System.out.println(Arrays.compare(a,b)+"\n");

        int c[] = Arrays.copyOf(a,a.length);
        for(int x:c){
        System.out.println(x);
        
        }
        System.out.println();

        Arrays.fill(c,10);
        for(int x:c){
            System.out.println(x);
            
         }
         System.out.println();

         Arrays.sort(a);//comparable interface used
         for(int x:a){
            System.out.println(x);
            
         }
         System.out.println();

         System.out.println(Arrays.binarySearch(a, 5));//returns index
         System.out.println("\n");

         Integer d[]={2,4,6,8,1,3,5,7,9};
         Arrays.sort(d);

         for(int x:d){
            System.out.println(x);
            
         }
         System.out.println();

         Arrays.sort(d,new MyComp());//comparator 

         for(int x:d){
            System.out.println(x);
            
         }
         System.out.println();





    }
    
}
