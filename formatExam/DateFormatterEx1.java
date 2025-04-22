package formatExam;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatterEx1 {
    public static void main(String[] args) {
        ZonedDateTime zdateTime = ZonedDateTime.now();
        String[] patternArr={
                "yyyy-MM-dd HH:mm:ss",
                "''yy년 MM월 dd일 E요일",
                "yyyy-MM-dd HH:mm:ss.SSS Z VV",
                "yyyy-MM-dd hh:mm:ss a",
                "오늘은 올해의 D번째 날",
                "오늘은 이달의 d번째 날",
                "오늘은 올해의 w번째 주",
                "오늘은 이달의 W번째 주",
                "오늘은 이달의 W번째 E요일"
        };
        for(String p:patternArr){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(p);
            System.out.println(zdateTime.format(formatter));
        }
    }
}
/*
2025-04-12 20:42:39
'25년 04월 12일 토요일
2025-04-12 20:42:39.939 +0900 Asia/Seoul
2025-04-12 08:42:39 오후
오늘은 올해의 102번째 날
오늘은 이달의 12번째 날
오늘은 올해의 15번째 주
오늘은 이달의 2번째 주
오늘은 이달의 2번째 토요일
 */