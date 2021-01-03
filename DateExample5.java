import java.time.LocalDate;
import java.time.LocalDateTime;
//import java.time.Month;

public class DateExample5 {
    public static void main(String[] args) {
        DateExample5 date=new DateExample5();
        date.testLocalDateTime();
    }
    public void testLocalDateTime(){
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println("Current DateTime: :"+ldt);

        LocalDate date1=ldt.toLocalDate();
        System.out.println("date1: " +date1);


    }
}
