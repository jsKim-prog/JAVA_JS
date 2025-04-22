package dateExam;

public class CalendarEx9 {
    public static void main(String[] args) {
        System.out.println("2024.5.31:"+getDayOfWeek(2024, 5, 31));
        System.out.println("2022.6.1:"+getDayOfWeek(2022, 6,1));
        System.out.println("2024.5.1 - 2024. 4.28:"+dayDiff(2024, 5, 1, 2024, 4, 28));
        System.out.println("2025. 6.29: "+ convertDateToDay(2025, 6, 29));
        System.out.println("735778:"+convertDayToDate(735778));

//        2024.5.31:5
//        2022.6.1:7
//        2024.5.1 - 2024. 4.28:1
//        2025. 6.29: 739420
//        735778:2015-6-29
    }

    //각 월의 마지막일
    public static int[] endOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    //윤년여부
    public static boolean isLeafYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

    //날짜 차이 계산
    public static int dayDiff(int y1, int m1, int d1, int y2, int m2, int d2) {
        return convertDateToDay(y1, m1, d1)-convertDateToDay(y2, m2, d2);
    }
    //요일계산
    public static int getDayOfWeek(int year, int month, int day){
        //1~7값 반환, 1==일요일
        return convertDateToDay(year, month, day)%7+1;
    }

    //날짜변환: 일단위 숫자-> 날짜
    public static String convertDayToDate(int day) {
        int year = 1;
        int month = 0;

        while (true) {
            int aYear = isLeafYear(year) ? 366 : 365;
            if (day > aYear) {
                day -= aYear;
                year++;
            } else {
                break;
            }
        }
        while (true) {
            int endDay = endOfMonth[month];
            //윤년이고 윤달이 포함되어 있으면 1을 더함
            if (isLeafYear(year) && month == 1) endDay++;
            if (day > endDay) {
                day -= endDay;
                month++;
            } else {
                break;
            }
        }
        return year + "-" + (month + 1) + "-" + day;
    }
    //날짜 수 계산
    public static int convertDateToDay(int year, int month, int day) {
        //윤년의 수
        int numOfLeafYear = 0;
        //전년도까지 윤년의 수
        for (int i = 1; i < year; i++) {
            if (isLeafYear(i)) numOfLeafYear++;
        }
        //전년도까지의 일수(윤년수 = 더해지는 일수)
        int toLastYearDaySum = (year - 1) * 365 + numOfLeafYear;
        //올해의 현재 월 전월까지의 일수
        int thisYearDaySum = 0;
        for (int i = 0; i<month-1;i++) thisYearDaySum+=endOfMonth[1];
        //윤년이고, 2월 포함되어 있으면 1일 증가
        if(month>2 && isLeafYear(year)) thisYearDaySum++;
        //현재월의 날짜 더하기
        thisYearDaySum+=day;
        return toLastYearDaySum+thisYearDaySum;
    }
}
