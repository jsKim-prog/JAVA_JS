package formatExam;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeEx1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); //오늘 날짜
        LocalTime now = LocalTime.now(); //현재 시각

        LocalDate birthDate = LocalDate.of(1999, 12, 31);
        LocalTime birthTime = LocalTime.of(23, 59, 59);

        System.out.println("today= "+today);
        System.out.println("now= "+now);
        System.out.println("birthDate= "+birthDate);
        System.out.println("birthTime= "+birthTime);
        System.out.println("birthDate withYear= "+birthDate.withYear(2000));
        System.out.println("birthDate plusDays= "+birthDate.plusDays(1));
        System.out.println("birthDate plus= "+birthDate.plus(1, ChronoUnit.DAYS));
        System.out.println("birthTime truncatedTo= "+birthTime.truncatedTo(ChronoUnit.HOURS));
        System.out.println("range: CLOCK_HOUR_OF_DAY= "+ ChronoField.CLOCK_HOUR_OF_DAY.range());
        System.out.println("range:HOUR_OF_DAY= "+ChronoField.HOUR_OF_DAY.range());


    }
}
/*
today= 2025-04-12
now= 16:09:40.814172
birthDate= 1999-12-31
birthTime= 23:59:59
birthDate withYear= 2000-12-31
birthDate plusDays= 2000-01-01
birthDate plus= 2000-01-01
birthTime truncatedTo= 23:00
range: CLOCK_HOUR_OF_DAY= 1 - 24
range:HOUR_OF_DAY= 0 - 23
 */