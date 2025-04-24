package enumsExam;

public enum Transportation {
    BUS(100) {
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    },
    TRAIN(150) {
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    },
    SHIP(100) {
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    },
    AIRPLANE(300) {
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };

    protected final int BASIC_FARE; //기본요금, protected로 해야 각 상수에서 접근가능

    Transportation(int basicFare) {
        BASIC_FARE = basicFare;
    }

    //운송요금 반환(거리에 따른 요금 계산)
    abstract int fare(int distance);
}
