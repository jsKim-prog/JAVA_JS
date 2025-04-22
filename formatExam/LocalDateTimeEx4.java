package formatExam;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeEx4 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2024, 1,1);
        LocalDate date2 = LocalDate.of(2025, 12, 31);

        Period pe = Period.between(date1, date2);

        System.out.println("date1="+date1);
        System.out.println("date2="+date2);
        System.out.println("pe="+pe);
        System.out.println("YEAR="+pe.get(ChronoUnit.YEARS));
        System.out.println("MONTH="+pe.get(ChronoUnit.MONTHS));
        System.out.println("DAY="+pe.get(ChronoUnit.DAYS));

        LocalTime time1 = LocalTime.of(0,0,0);
        LocalTime time2 = LocalTime.of(12, 34, 56);

        Duration du = Duration.between(time1, time2);

        System.out.println("time1="+time1);
        System.out.println("time2="+time2);
        System.out.println("du="+du);

        LocalTime tmpTime = LocalTime.of(0, 0).plusSeconds(du.getSeconds());
        System.out.println("HOUR="+tmpTime.getHour());
        System.out.println("MINUTE="+tmpTime.getMinute());
        System.out.println("SECOND="+tmpTime.getSecond());
        System.out.println("NANO="+tmpTime.getNano());

    }
}
/*
date1=2024-01-01
date2=2025-12-31
pe=P1Y11M30D
YEAR=1
MONTH=11
DAY=30
time1=00:00
time2=12:34:56
du=PT12H34M56S
HOUR=12
MINUTE=34
SECOND=56
NANO=0
 */