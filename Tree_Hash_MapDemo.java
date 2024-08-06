package CollectionFrameworks;

import java.util.*;
import java.util.Map.*;

public class Tree_Hash_MapDemo {
    public static void main(String[] args) {
        TreeMap <Integer,String> tm = new TreeMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));
        //TreeMAp take log(n) time for all basic operations
        tm.put(5,"E");
        tm.put(6,"F");

        System.out.println(tm.ceilingEntry(5).getValue());

        System.out.println(tm.get(3));

        Entry<Integer,String> e = tm.firstEntry();

        System.out.println(e.getKey()+" "+e.getValue());
        
        System.out.println(tm);

        tm.clear();

        //HAsh Map

        HashMap <Integer,String> hm = new HashMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));
        //it take O(1) time for all basic operations
        hm.put(5,"E");
        hm.put(6,"F");
        
        System.out.println(hm);

        hm.clear();
    }
    
}
