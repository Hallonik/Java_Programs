package DemoDateTime;

import java.util.*;
import java.time.*;
import java.time.temporal.*;
import java.time.format.*;

public class DateTimeFormatterDemo {

    public static void main(String[] args) {

        ZonedDateTime  ldt = ZonedDateTime.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy  hh:mm:ss z Z");
        System.out.println(dtf.format(ldt));

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MM-yy  hh.mm.ss z Z");
        System.out.println(dtf1.format(ldt));


        //ChronoField
        LocalDateTime dt = LocalDateTime.now();

        System.out.println(dt.get(ChronoField.DAY_OF_MONTH));
        System.out.println(dt.get(ChronoField.AMPM_OF_DAY));
        System.out.println(dt.get(ChronoField.DAY_OF_YEAR));


        
    }
    
}
