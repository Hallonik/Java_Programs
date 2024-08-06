package CollectionFrameworks;

import java.util.*;
import java.util.LinkedHashMap.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        
    
    LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>(5,.75f,true){
      protected boolean removeEldestEntry(Map.Entry e){
        return size()>5;
      }
    };
    lhm.put(1,"A");
    lhm.put(2,"B");
    lhm.put(3,"C");
    lhm.put(4,"D");
    String s = lhm.get(2);
    lhm.put(5,"E");
   lhm.put(6,"F");
  s=lhm.get(1);
   // lhm.put(9,"G");
 // lhm.put(8,"H");

 
   s=lhm.get(5);
  

    System.out.println(lhm);
}

}
