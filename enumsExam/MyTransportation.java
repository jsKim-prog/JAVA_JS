package enumsExam;

abstract class MyTransportation extends MyEnum {
    static final MyTransportation BUS = new MyTransportation("BUS", 100) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };
    static final MyTransportation TRAIN = new MyTransportation("TRAIN", 150) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };
    static final MyTransportation SHIP = new MyTransportation("SHIP", 100) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };
    static final MyTransportation AIRPLANE = new MyTransportation("AIRPLANE", 300) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };


    protected final int BASIC_FARE;

    //추상메서드
    abstract int fare(int distance);

    private MyTransportation(String name, int basicFare) {
        super(name);
        BASIC_FARE = basicFare;
    }

    public String name() {
        return name;
    }

    public String toString() {
        return name;
    }
}
