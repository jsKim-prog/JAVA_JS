package genericsExam;

public class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<>();
        FruitBox<Grape> grapeBox = new FruitBox<>();
        //FruitBox<Toy> toyBox = new FruitBox<Toy>(); 에러

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        //appleBox.add(new Grape()); 에러, 자손관계 아님
        grapeBox.add(new Grape());

        System.out.println("fruitBox-"+fruitBox);
        System.out.println("appleBox-"+appleBox);
        System.out.println("grapeBox-"+grapeBox);
    }
}
/*
fruitBox-[Fruit, Apple, Grape]
appleBox-[Apple]
grapeBox-[Grape]
 */