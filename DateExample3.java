//import java.time.LocalTime;
import java.time.ZoneId;

public class DateExample3 {
    public static void main(String[] args) {
        //LocalTime t=LocalTime.now(ZoneId.of(""));
        for (String s : ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }
    }
}
