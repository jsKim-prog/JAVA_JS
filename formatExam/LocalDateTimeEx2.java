package formatExam;

import java.time.*;

public class LocalDateTimeEx2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 12, 31);
        LocalTime time = LocalTime.of(12, 34, 56);

        LocalDateTime dt = LocalDateTime.of(date, time);
        ZoneId zoneId = ZoneId.of("Asia/Seoul");
        ZonedDateTime zdt = dt.atZone(zoneId);
        String strZid = zdt.getZone().getId();

        ZonedDateTime seoulTime = ZonedDateTime.now();
        ZoneId nyId = ZoneId.of("America/New_York");
        ZonedDateTime nyTime = ZonedDateTime.now().withZoneSameInstant(nyId);

        //ZonedDateTime -> OffsetDateTime
        OffsetDateTime odt = zdt.toOffsetDateTime();

        System.out.println(dt);
        System.out.println(zoneId);
        System.out.println(strZid);
        System.out.println(zdt);
        System.out.println(seoulTime);
        System.out.println(nyTime);
        System.out.println(odt);

    }
}
/*
2024-12-31T12:34:56
Asia/Seoul
Asia/Seoul
2024-12-31T12:34:56+09:00[Asia/Seoul]
2025-04-12T16:44:22.969706900+09:00[Asia/Seoul]
2025-04-12T03:44:22.972696600-04:00[America/New_York]
2024-12-31T12:34:56+09:00
 */