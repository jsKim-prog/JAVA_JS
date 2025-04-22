package formatExam;

import java.time.temporal.*;
import java.time.LocalDate;

import static java.time.DayOfWeek.*;
import static java.time.temporal.TemporalAdjusters.*;

public class LocalDateTimeEx3 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date = today.with(new DayAfterTomorrow());

        p("today", today);
        p("DayAfterTomorrow", date);
        p("다음달의 첫날", today.with(firstDayOfNextMonth())); //다음달의 첫날
        p("이달의 첫날", today.with(firstDayOfMonth()));//이달의 첫날
        p("이달의 마지막날", today.with(lastDayOfMonth())); //이달의 마지막날
        p("이달의 첫번째 토요일", today.with(firstInMonth(SATURDAY)));//이달의 첫번째 토요일
        p("이달의 마지막 토요일", today.with(lastInMonth(SATURDAY)));//이달의 마지막 토요일
        p("지난주 토요일", today.with(previous(SATURDAY)));//지난주 토요일
        p("지난주 토요일(오늘 포함)", today.with(previousOrSame(SATURDAY)));//지난주 토요일(오늘 포함)
        p("다음주 토요일", today.with(next(SATURDAY)));
        p("다음주 토요일(오늘 포함)", today.with(nextOrSame(SATURDAY)));
        p("이달의 4번째 토요일", today.with(dayOfWeekInMonth(4, SATURDAY)));

    }

    //출력용 메서드
    static void p(String str, Object obj){
        System.out.println(str+":"+obj);
    }
}
/*
today:2025-04-12
DayAfterTomorrow:2025-04-14
다음달의 첫날:2025-05-01
이달의 첫날:2025-04-01
이달의 마지막날:2025-04-30
이달의 첫번째 토요일:2025-04-05
이달의 마지막 토요일:2025-04-26
지난주 토요일:2025-04-05
지난주 토요일(오늘 포함):2025-04-12
다음주 토요일:2025-04-19
다음주 토요일(오늘 포함):2025-04-12
이달의 4번째 토요일:2025-04-26
 */