package DemoDateTime;

import java.util.*;

public class Demodate {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
        System.out.println((Long.MAX_VALUE));//max milli sec that java can store

        Date d = new Date("3/3/2003");//this is depricated class
        System.out.println(d);

        Date d1 = new Date();//to get current date in milliseconds
        System.out.println(d1.getTime());
        System.out.println(d1.getDate());
        System.out.println(d1.getDay());//sunday=0 -> saturday=6
        System.out.println(d1.getMonth());
        System.out.println(d1.getYear());


        
    }
    
}
