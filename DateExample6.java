import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateExample6 {
    public static void main(String[] args) {
        DateExample6 dateex = new DateExample6();
        dateex.testChromoUnits();
    }

        public void testChromoUnits() {
            LocalDate today=LocalDate.now();
            System.out.println("Current date "+today);

            LocalDate nextweek=today.plus(1, ChronoUnit.WEEKS);
            System.out.println("NextWeek "+nextweek);
            LocalDate nextmonth=today.plus(1,ChronoUnit.MONTHS);
            System.out.println("NextMOnth "+nextmonth);
            LocalDate nextyear=today.plus(1,ChronoUnit.YEARS);
            System.out.println("NextYear "+nextyear);
            LocalDate nextdecade=today.plus(1,ChronoUnit.DECADES);
            System.out.println("NextDecade "+nextdecade);

        }
    }

