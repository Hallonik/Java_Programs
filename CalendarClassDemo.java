package DemoDateTime;

import java.util.*;

public class CalendarClassDemo {

    public static void main(String [] args){
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2021));
        System.out.println(gc.isLeapYear(2024));
        System.out.println(gc.get(Calendar.DATE));
        System.out.println(gc.get(Calendar.MONTH));
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));


        TimeZone tz = gc.getTimeZone();
        System.out.println(tz);
        System.out.println(tz.getDisplayName());
        System.out.println(tz.getID());

        gc.setTimeZone(TimeZone.getTimeZone("America/LAs_Angeles"));
        TimeZone tz1 = gc.getTimeZone();
        System.out.println(tz1.getID());
        System.out.println(tz1);

    }
    
}
