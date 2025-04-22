package dateExam;

import java.util.Calendar;
//달력만들기
public class CalendarEx6 {
    public static void main(String[] args){
        if(args.length !=2){
            System.out.println("Usage : Java CalendarEx6 2025 4");
            return;
        }
        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);

        Calendar sDay = Calendar.getInstance(); //시작일
        Calendar eDay = Calendar.getInstance(); //끝일

        sDay.set(year, month-1, 1);
        /* Ex6
        int START_DAY_OF_WEEK = 0;
        int END_DAY = 0;
        //다음달의 첫날에서 하루 빼면 현재달의 마지막날(12.1-1일=11.30)
        //eDay.set(year, month, 1);
        //eDay.add(Calendar.DATE, -1);

        //첫번째 요일 파악
        START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
        //말일 지정
        END_DAY = eDay.get(Calendar.DATE);

        //출력
        System.out.println("    "+args[0]+"년"+args[1]+"월" );
        System.out.println(" SUN  MON  TUE  WED  THU  FRI  SAT");

        //1일에 따라 공백 출력
        for(int i=1;i<START_DAY_OF_WEEK;i++){
            System.out.print("     ");
        }
        //날짜찍기
        for(int i=1, n=START_DAY_OF_WEEK; i<=END_DAY;i++, n++){
            System.out.print((i<10)? "    "+i:"   "+i);
            if(n%7==0) System.out.println();
        }*/

        //말일 설정
        eDay.set(year, month-1, sDay.getActualMaximum(Calendar.DATE));
        //1일이 속한 주의 일요일로 날짜 설정
        sDay.add(Calendar.DATE, -sDay.get(Calendar.DAY_OF_WEEK)+1);
        //말일이 속한 주 토요일로 날짜설정
        eDay.add(Calendar.DATE, 7-eDay.get(Calendar.DAY_OF_WEEK));

        //출력: sDay~ eDay까지 1씩 증가, 7일치 찍으면 줄바꾸기
        System.out.println("    "+args[0]+"년"+args[1]+"월" );
        System.out.println(" SUN  MON  TUE  WED  THU  FRI  SAT");
        for (int n=1;sDay.before(eDay)||sDay.equals(eDay);sDay.add(Calendar.DATE, 1)){
            int day = sDay.get(Calendar.DATE);
            System.out.print((day<10)?"    "+day:"   "+day);
            if(n++%7==0) System.out.println();
        }
    }
}

//달력 출력(intelliJ : RUN->Edit Configuraions...-> 값입력 -> RUN