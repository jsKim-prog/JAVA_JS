package formatExam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx1 {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
        SimpleDateFormat sdf5, sdf6, sdf7, sdf8, sdf9;

        sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        sdf2 = new SimpleDateFormat("''yy년 MMM dd일 E요일");
        sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");

        sdf5 = new SimpleDateFormat("오늘은 올해의 D번째 날입니다.");
        sdf6 = new SimpleDateFormat("오늘은 이달의 d번째 날입니다.");
        sdf7 = new SimpleDateFormat("오늘은 올해의 w번째 주");
        sdf8 = new SimpleDateFormat("오늘은 이달의 W번째 주");
        sdf9 = new SimpleDateFormat("오늘은 이달의 F번재 E요일");

        System.out.println(sdf1.format(today));
        System.out.println(sdf2.format(today));
        System.out.println(sdf3.format(today));
        System.out.println(sdf4.format(today));
        System.out.println();
        System.out.println(sdf5.format(today));
        System.out.println(sdf6.format(today));
        System.out.println(sdf7.format(today));
        System.out.println(sdf8.format(today));
        System.out.println(sdf9.format(today));


    }
}
/*
* 2025-04-11
'25년 4월 11일 금요일
2025-04-11 17:11:59.551
2025-04-11 05:11:59 오후

오늘은 올해의 101번째 날입니다.
오늘은 이달의 11번째 날입니다.
오늘은 올해의 15번째 주
오늘은 이달의 2번째 주
오늘은 이달의 2번재 금요일
*
* */