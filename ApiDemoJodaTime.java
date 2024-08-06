package DemoDateTime;

import java.util.*;
import java.time.*;
import java.time.temporal.*;


public class  ApiDemoJodaTime
{
    public static void main(String[] args)
     {
        Date d = new Date();
        d.setHours(21);
        System.out.println(d);

        LocalDate ld =LocalDate.now();
        System.out.println(ld); 

        LocalDate ld1 =LocalDate.now(Clock.systemDefaultZone());
        System.out.println(ld1); 

        LocalDate ld2 =LocalDate.now(ZoneId.of("America/Argentina/Mendoza"));
        System.out.println(ld2); 

        LocalDate ld3 =LocalDate.of(2003,Month.MARCH,03);
        System.out.println(ld3); 

        LocalDate ld4 =LocalDate.ofEpochDay(1);
        System.out.println(ld4); 

        LocalDate ld5 =LocalDate.parse("2022-05-05");
        LocalDate d1 = ld5.plusMonths(6);
        System.out.println(d1);
        System.out.println(ld5); 

        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        LocalTime t=lt.minusHours(5);
        System.out.println(t);


        LocalDateTime   ldt =LocalDateTime.now();
        System.out.println(ldt);
        

        ZonedDateTime  zdt = ZonedDateTime.now();
        System.out.println(zdt);

        ZonedDateTime  zdt1 = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(zdt1);

        OffsetDateTime osdt = OffsetDateTime.now();
        System.out.println(osdt);


        MonthDay md = MonthDay.now();
        System.out.println(md);

        Period p = Period.of(2,3,15);
        System.out.println(p.addTo(LocalDate.now()));

        Instant i = Instant.now();
        System.out.println(i);








        
    }
    
}
