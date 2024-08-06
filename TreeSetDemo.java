package CollectionFrameworks;

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(List.of(10,20,30,40,50,60,70));
        ts.add(25);
        System.out.println(ts.floor(55));
        System.out.println(ts);
    }
    
}
