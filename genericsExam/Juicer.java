package genericsExam;

public class Juicer {
    static Juice makeJuice(FruitBox<? extends Fruit> box){
        String tmp = "";
        for(Fruit f:box.getList()) tmp+= f+ " ";
        return new Juice(tmp);
    }
}
