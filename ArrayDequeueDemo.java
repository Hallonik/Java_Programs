package CollectionFrameworks;

import java.util.*;

public class ArrayDequeueDemo {

    public static void main(String[] args) {

        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(34);
        dq.offerLast(50);

        dq.pollFirst();

        
        System.out.println(dq);
        dq.offerFirst(2);
        dq.offerFirst(4);
        dq.offerFirst(6);
        dq.offerFirst(8);

        dq.forEach((x)->System.out.println(x));

         
        System.out.println(dq);

        
    }
    
}
