package dateExam;

import java.util.Calendar;

public class CalendarEx01 {
    public static void main(String[] args) {
        //Calendar getter
        //기본적으로 현재 날짜와 시간으로 설정(2025-04-09, 수요일)
        Calendar today = Calendar.getInstance();
        System.out.println("이 해의 년도:" + today.get(Calendar.YEAR));
        System.out.println("월(from 0):" + today.get(Calendar.MONTH));
        System.out.println("이 해의 몇째주:" + today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("이 달의 몇째주: " + today.get(Calendar.WEEK_OF_MONTH));

        //DATE == DAY_OF_MONTH
        System.out.println("이 달의 몇일(DATE): " + today.get(Calendar.DATE));
        System.out.println("이 달의 몇일(DAY_OF): " + today.get(Calendar.DAY_OF_MONTH));
        System.out.println("이 해의 몇일: " + today.get(Calendar.DAY_OF_YEAR));
        System.out.println("요일: " + today.get(Calendar.DAY_OF_WEEK));
        System.out.println("이 달의 몇째 요일: " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("이 달의 마지막 날: " + today.getActualMaximum(Calendar.DATE));
        System.out.println("오전(0)/오후(1): " + today.get(Calendar.AM_PM));
        System.out.println("시간(0~11): " + today.get(Calendar.HOUR));
        System.out.println("시간(0~23): " + today.get(Calendar.HOUR_OF_DAY));
        System.out.println("분(0~59): " + today.get(Calendar.MINUTE));
        System.out.println("초(0~59): " + today.get(Calendar.SECOND));
        System.out.println("밀리세컨드(1/1000초, 0~999): " + today.get(Calendar.MILLISECOND));
        System.out.println("TimeZone: " + today.get(Calendar.ZONE_OFFSET));
        System.out.println("TimeZone(-12~+12): " + today.get(Calendar.ZONE_OFFSET) / (60 * 60 * 1000));
        //60*60*1000 : 밀리세컨드 -> 시
//        이 해의 년도:2025
//        월(from 0):3
//        이 해의 몇째주:15
//        이 달의 몇째주: 2
//        이 달의 몇일(DATE): 9
//        이 달의 몇일(DAY_OF): 9
//        이 해의 몇일: 99
//        요일: 4(1=일요일, 4=수요일)
//        이 달의 몇째 요일: 2 -> 두 번째 수요일
//        이 달의 마지막 날: 30
//        오전(0)/오후(1): 1
//        시간(0~11): 7
//        시간(0~23): 19
//        분(0~59): 13
//        초(0~59): 52
//        밀리세컨드(1/1000초, 0~999): 719
//        TimeZone: 32400000
//        TimeZone(-12~+12): 9


    }
}
