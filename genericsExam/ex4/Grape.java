package genericsExam.ex4;

import java.util.Comparator;

public class Grape extends Fruit{
    Grape(String name, int weight) {
        super(name, weight);
    }
}

class GrapeComp implements Comparator<Grape>{

    @Override
    public int compare(Grape t1, Grape t2) {
        return t2.weight-t1.weight;
    }
}