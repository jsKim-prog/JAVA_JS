package enumsExam;

public enum Direction {
    //열거형 상수 선언
    EAST(1, ">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4, "^");

    //멤버변수
    private static final Direction[] DIR_ARR = Direction.values();
    private final int value;
    private final String symbol;

    //생성자
    Direction(int value, String symbol){ //접근제어자 private 묵시적 생략
        this.value = value;
        this.symbol = symbol;
    }
    //메서드
    public int getValue() {return value;}
    public String getSymbol() {return symbol;}

    public static Direction of(int dir){
        if(dir<1 || dir >4){ //value 범위에서 벗어난 값
            throw new IllegalArgumentException("Invalid value: "+dir);
        }
        return DIR_ARR[dir-1];
    }
    //방향을 회전시키는 메서드, num 값만큼 90도씩 시계방향으로 회전
    public Direction rotate(int num){
        num = num % 4;
        //(-)나누기(+) = (-)몫, (-) 나머지 
        if(num<0){
            num += 4; //num이 음수일 때는 반시계방향으로 회전
        }
        return DIR_ARR[(value-1+num)%4];
        //value-1+num : 회전결과의 인덱스 값
        // %4 :  상수의 값 범위가 1~4이므로 4를 넘는 값은 다시 1부터 시작한다.(int의 값 범위 회전 참조)
    }

    public String toString(){
        return name()+getSymbol();
    }
}
