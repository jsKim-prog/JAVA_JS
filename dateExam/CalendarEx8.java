package dateExam;

public class CalendarEx8 {
    public static void main(String[] args){
        //calendar 없이 년, 월 계산
        String date1 = "202508";
        String date2 = "202405";
        
        //년, 월 잘라서 정수변환
        //년*12-> 월로 변환
        int month1 = Integer.parseInt(date1.substring(0,4))*12+Integer.parseInt(date1.substring(4));
        int month2 = Integer.parseInt(date2.substring(0,4))*12+Integer.parseInt(date2.substring(4));
        
        System.out.println(date1+"과"+date2+"의 차이는"+Math.abs(month1-month2)+"개월");
        //202508과202405의 차이는15개월
        
    }
}
