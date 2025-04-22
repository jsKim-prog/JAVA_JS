package formatExam;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatEx2 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2015, 9, 3); //2015-10-03
        Date day = cal.getTime(); //Calendar를 Date로 변환
        SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
        sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        sdf2 = new SimpleDateFormat("yy-MM-dd E요일");
        sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");

        System.out.println(sdf1.format(day));
        System.out.println(sdf2.format(day));
        System.out.println(sdf3.format(day));
        System.out.println(sdf4.format(day));
        System.out.println("========= Ex3======");

        DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

        try {
            Date d = df.parse("2024년 11월 23일");
            System.out.println(df2.format(d));
        }catch (Exception e){}

    }
}
/*2015-10-03
15-10-03 토요일
2015-10-03 17:22:12.251
2015-10-03 05:22:12 오후
========= Ex3======
2024/11/23
*/