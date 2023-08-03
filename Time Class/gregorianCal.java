import java.util.GregorianCalendar;
import java.util.TimeZone;

public class gregorianCal {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();

        System.out.println(cal.isLeapYear(2000));
        System.out.println(cal.isLeapYear(2021));
        
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
    }
}
