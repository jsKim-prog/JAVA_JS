package enumsExam;

public class EnumEx3 {
    public static void main(String[] args) {
        System.out.println("Bus fare="+Transportation.BUS.fare(100));
        System.out.println("Train fare="+Transportation.TRAIN.fare(100));
        System.out.println("Ship fare="+Transportation.SHIP.fare(100));
        System.out.println("Airplane fare="+Transportation.AIRPLANE.fare(100));
    }
}
/*
Bus fare=10000
Train fare=15000
Ship fare=10000
Airplane fare=30000
 */