package genericsExam;

public class FruitBoxEx1 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Toy> toyBox = new Box<Toy>();
        //Box<Grape> grapeBox = new Box<Apple>(); 타입불일치 에러

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        //appleBox.add(new Toy());

        toyBox.add(new Toy());

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);
    }
}



/*
[Fruit, Apple]
[Apple, Apple]
[Toy]
 */