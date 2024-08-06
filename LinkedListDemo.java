package CollectionFrameworks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> al1 = new LinkedList<>(List.of(50,60,70,80,90,70));

        LinkedList<Integer> al2 = new LinkedList<>();

        al1.add(10);
        al1.add(0,12);

        al1.addAll(1,al2);

        System.out.println(al1.contains(25));

        System.out.println(al1.get(5));
       

        al1.set(5, 120);
        al1.addFirst(900);
        al1.addLast(500);
      

         al1.forEach(n->show(n));

         System.out.println();


        //al1.clear();

        System.out.println(al1);
    }

    static void show(int n){
        if(n>60)
        System.out.println(n);
    }
    
}
