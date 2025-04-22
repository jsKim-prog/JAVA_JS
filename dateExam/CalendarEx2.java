package dateExam;

import java.util.Calendar;

public class CalendarEx2 {
    public static void main(String[] args) {
        //Calendar setter
        //요일 : 1=일요일, 2=월요일
        final String[] DAY_OF_WEEK = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();


        date1.set(2025, Calendar.MARCH, 31);
        System.out.println("date1 : "+ toString(date1) +"/" +DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)-1]);
        System.out.println("date2 : "+ toString(date2) +"/" +DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)-1]);

        //날짜간 차이
        long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000; //초단위로 변환
        System.out.println("date1-date2(초):"+difference+"초");
        System.out.println("date1-date2(일):"+difference/(60*60*24)+"일");

//        date1 : 2025년 3월 31일 /MON
//        date2 : 2025년 4월 9일 /WED
//        date1-date2(초):777600초
//        date1-date2(일):9일
        System.out.println("===============ex4========================");

        //ex4
        Calendar date = Calendar.getInstance();
        date.set(2025, Calendar.APRIL, 10);
        System.out.println("date : "+toString(date));
        date.add(Calendar.DATE, 1);
        System.out.println("date 1일 후:"+toString(date));
        date.add(Calendar.MONTH, -6);
        System.out.println("date 6달 전:"+toString(date));
        date.roll(Calendar.DATE, 31);
        System.out.println("date 31일 후(roll):"+toString(date));
        date.add(Calendar.DATE, 31);
        System.out.println("date 31일 후(add):"+toString(date));
//        date : 2025년 4월 10일
//        date 1일 후:2025년 4월 11일
//        date 6달 전:2024년 10월 11일
//        date 31일 후(roll):2024년 10월 11일 - 지정한 필드(일)만 영향, 월은 바뀌지 않음(단, 말일에 월필드 변경시 일필드 영향)
//        date 31일 후(add):2024년 11월 11일 - 일 필드만 지정했지만, 영향으로 월이 바뀜

        System.out.println("===============ex5========================");
        date.set(2025, Calendar.JANUARY, 31);
        System.out.println("date : "+toString(date));
        date.roll(Calendar.MONTH, 1);
        System.out.println("date-roll-1:"+toString(date));
//        date : 2025년 1월 31일
//        date-roll-1:2025년 2월 28일
        //roll은 지정필드 외 영향이 없지만, 말일은 달라짐


    }

    public static String toString(Calendar date){
        //Month : 0~11
        return date.get(Calendar.YEAR)+"년 "+ (date.get(Calendar.MONTH)+1)+"월 "+ date.get(Calendar.DATE)+"일 ";
    }
}
