package genericsExam.ex4;

import java.util.Comparator;

public class Fruit {
    //Ex4 : 멤버변수, 생성자 추가
    String name;
    int weight;

    Fruit(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    public String toString() {
        return name+"("+weight+")";
    }
}

class FruitComp implements Comparator<Fruit>{

    @Override
    public int compare(Fruit t1, Fruit t2) {
        return t1.weight-t2.weight;
    }
}