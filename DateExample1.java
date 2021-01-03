import java.time.LocalDate;
import java.time.Month;
//import java.time.LocalDateTime;

public class DateExample1 {
    public static void main(String[] args) {
        LocalDate d=LocalDate.of(2000, Month.APRIL,12);
        System.out.println(d);
    }
}
