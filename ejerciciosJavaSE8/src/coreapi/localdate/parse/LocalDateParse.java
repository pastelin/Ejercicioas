
package coreapi.localdate.parse;

import java.time.*;
import java.time.format.DateTimeFormatter;


public class LocalDateParse {

    public static void main(String[] args) {
        
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2014, 6, 20);
        LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
        
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
	LocalDate date = LocalDate.parse("01 02 2015", f);
        
        System.out.println("date = " + date);
        
        String newYorkDateTimePattern = "dd/MM/yyyy";
DateTimeFormatter newYorkDateFormatter = DateTimeFormatter.ofPattern(newYorkDateTimePattern);
LocalDate summerDay = LocalDate.of(2016, 7, 31);
System.out.println(newYorkDateFormatter.format(summerDay));



    }


    
}
