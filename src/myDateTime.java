import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class myDateTime {

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());


        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);


        System.out.println(date1);
        date1 = date1.plusYears(4);  //The date and time classes are immutable
        System.out.println(date1);
        System.out.println(date1.toEpochDay());
    }


}
