import java.time.ZoneId;
import java.time.LocalTime;

public class DateExampl4 {
        public static void main(String[] args) {
            LocalTime t=LocalTime.now(ZoneId.of("Asia/Harbin"));
            System.out.println(t);
            for (String s : ZoneId.getAvailableZoneIds()) {
                System.out.println(s);
            }

        }
    }


