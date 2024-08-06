package CollectionFrameworks;
//LinkedHashMap and LinkedHashSet are similar cos they maintain
//the order of insertion

//Difference is LinkedhashSet deals with only values
//and not key value pair

/*Difference b/w HashSet and Linkedahash Set is that
in LinkedhashSet elements displayed in order they are inserted
where as in Hash set elements are displayed in sorted order irresspective 
of their insrtion */

import java.util.*;



public class LinkedHashSetDemo {

    public static void main(String[] args) {
        
        LinkedHashSet <String> lhs = new LinkedHashSet<>(10);

        lhs.add("A");
        
        lhs.add("D");
        lhs.add("C");
       
        lhs.add("E");
        lhs.add("B");
        lhs.add("C");

        lhs.forEach((k)->System.out.println(k));

        //HAshSET
        HashSet <String> hs = new HashSet<>(10);

        hs.add("A");
        
        hs.add("D");
        hs.add("C");
       
        hs.add("E");
        hs.add("B");
        hs.add("C");

        System.out.println();
        Iterator<String> itr = hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    
    
    }
    
}
