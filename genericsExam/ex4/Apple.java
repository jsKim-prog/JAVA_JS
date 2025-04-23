package genericsExam.ex4;


import java.util.Comparator;

public class Apple extends Fruit {
    Apple(String name, int weight){
        super(name, weight);
    }
}

class AppleComp implements Comparator<Apple>{

    @Override
    public int compare(Apple t1, Apple t2) {
        return t2.weight-t1.weight;
    }
}