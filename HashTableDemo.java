package CollectionFrameworks;
//it is obsolate class

//this is used in older versions of java it also takes key value pair
//it is not  a generic type class so it will take key & value type as objects

//later this table was made a generic class

import java.util.*;

public class HashTableDemo {

    public static void main(String[] args) {

        Hashtable ht = new Hashtable<>();

        ht.put(1,"A");
        ht.put(2,"C");
        ht.put(3,"G");
        ht.put(4,"I");
        ht.put(5,"B");

        String s = (String)ht.get(5);//typecasting required since elements are stored as objects
        System.out.println(ht);

        Enumeration e = ht.elements();//works as iterator

        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        ht.compute(2,(k,v)->v+"Z");
        System.out.println(ht);

        ht.computeIfAbsent(7,(k)->"Z"+k);
        System.out.println(ht);
        
    }
    
}
