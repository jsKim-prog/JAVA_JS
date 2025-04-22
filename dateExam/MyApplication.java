package dateExam;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyApplication {
    public static void main(String[] args){
        //Calendar는 추상클래스
        Calendar cal1 = new GregorianCalendar(); //태국에서는 BuddhistCalendar()로 바꿔주어야 함
        Calendar cal = Calendar.getInstance(); //태국 이외 지역에서 자동으로 GregorianCalendar() 반환
    }
}
