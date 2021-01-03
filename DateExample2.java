import java.time.Instant;
import java.time.LocalDateTime;

public class DateExample2 {
    public static void main(String[] args) {
       // LocalTime t=new LocalTime().now(Clock.systemDefaultZone());
        LocalDateTime t=LocalDateTime.now();
        System.out.println(t);
        Instant i=Instant.now();
        System.out.println(i);
    }
}
