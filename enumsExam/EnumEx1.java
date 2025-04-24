package enumsExam;

public class EnumEx1 {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST");

        System.out.println("d1="+d1);
        System.out.println("d2="+d2);
        System.out.println("d3="+d3);

        System.out.println("d1==d2 ? "+(d1==d2));
        System.out.println("d1==d3 ? "+(d1==d3));
        System.out.println("d1.equals(d3) ? "+d1.equals(d3));
        //System.out.println("d2 > d3 ? "+ (d2 > d3)); error
        System.out.println("d1.compareTo(d3) ? "+ d1.compareTo(d3));
        System.out.println("d2.compareTo(d2) ? "+ d1.compareTo(d2));

        switch (d1){
            case EAST -> System.out.println("The direction is EAST");
            case SOUTH -> System.out.println("The direction is SOUTH");
            case WEST -> System.out.println("The direction is WEST");
            case NORTH -> System.out.println("The direction is NORTH");
            default -> System.out.println("Invalid direction");
        }
    }
}
/*
d1=EAST
d2=WEST
d3=EAST
d1==d2 ? false
d1==d3 ? true
d1.equals(d3) ? true
d1.compareTo(d3) ? 0
d2.compareTo(d2) ? -2
The direction is EAST
 */