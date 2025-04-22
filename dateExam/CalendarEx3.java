package dateExam;

import java.util.Calendar;

public class CalendarEx3 {
    //시간설정
    public static void main(String[] args) {
        final int[] TIME_UNIT = {3600, 60, 1};
        final String[] TIME_UNIT_NAME = {"시간", "분", "초"};

        Calendar time1 = Calendar.getInstance();
        Calendar time2 = Calendar.getInstance();

        //time1 : 10:20:30  / time2 : 20:30:10
        time1.set(Calendar.HOUR_OF_DAY, 10);
        time1.set(Calendar.MINUTE, 20);
        time1.set(Calendar.SECOND, 30);

        time2.set(Calendar.HOUR_OF_DAY, 20);
        time2.set(Calendar.MINUTE, 30);
        time2.set(Calendar.SECOND, 10);

        //출력
        System.out.println("time1: " + time1.get(Calendar.HOUR_OF_DAY) + "시 " + time1.get(Calendar.MINUTE) + "분 " + time1.get(Calendar.SECOND) + "초");
        System.out.println("time2: " + time2.get(Calendar.HOUR_OF_DAY) + "시 " + time2.get(Calendar.MINUTE) + "분 " + time2.get(Calendar.SECOND) + "초");

        //계산
        long difference = Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis()) / 1000;
        System.out.println("시간차 : " + difference + "초");
        String tmp = "";
        for (int i = 0; i < TIME_UNIT.length; i++) {
            tmp += difference / TIME_UNIT[i] + TIME_UNIT_NAME[i];
            difference %= TIME_UNIT[i];
        }
        System.out.println("시간차변환:"+tmp);
    }
}
//time1: 10시 20분 30초
//time2: 20시 30분 10초
//시간차 : 36580초
//시간차변환:10시간9분40초