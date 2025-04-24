package enumsExam;

public class DirectionPrintAllEx {
    public static void main(String[] args) {
        //열거형에 정의된 모든 상수 출력
        Direction[] dArr = Direction.values();
        for (Direction d:dArr){
            System.out.printf("%s = %d%n", d.name(), d.ordinal());
            //ordinal() : 상수의 정의 순서(0부터)
        }
    }
}
/*
EAST = 0
SOUTH = 1
WEST = 2
NORTH = 3
 */