package enumsExam;

public class EnumEx2 {
    public static void main(String[] args) {
        for(Direction d: Direction.values()){
            System.out.printf("%s=%d%n", d.name(), d.getValue());
        }

        Direction d1 = Direction.EAST;
        Direction d2 = Direction.of(1);

        System.out.printf("d1=%s, %d%n", d1.name(), d1.getValue());
        System.out.printf("d2=%s, %d%n", d2.name(), d2.getValue());
        System.out.println("EAST.rotate(1)="+Direction.EAST.rotate(1));
        System.out.println("EAST.rotate(2)="+Direction.EAST.rotate(2));
        System.out.println("EAST.rotate(-1)="+Direction.EAST.rotate(-1));
        System.out.println("EAST.rotate(-2)="+Direction.EAST.rotate(-2));
    }
}
/*
EAST=1
SOUTH=2
WEST=3
NORTH=4
d1=EAST, 1
d2=EAST, 1
EAST.rotate(1)=SOUTHV
EAST.rotate(2)=WEST<
EAST.rotate(-1)=NORTH^
EAST.rotate(-2)=WEST<
 */