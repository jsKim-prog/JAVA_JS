package genericsExam.ex4;

import java.util.Collections;

public class FruitBoxEx4 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        FruitBox<Grape> grapeBox = new FruitBox<>();

        appleBox.add(new Apple("GreenApple", 300));
        appleBox.add(new Apple("GreenApple", 100));
        appleBox.add(new Apple("GreenApple", 200));

        grapeBox.add(new Grape("GreenGrape", 400));
        grapeBox.add(new Grape("GreenGrape", 300));
        grapeBox.add(new Grape("GreenGrape", 200));

        Collections.sort(appleBox.getList(), new AppleComp());
        Collections.sort(grapeBox.getList(), new GrapeComp());

        System.out.println(appleBox);
        System.out.println(grapeBox);
        System.out.println();

        Collections.sort(appleBox.getList(), new FruitComp());
        Collections.sort(grapeBox.getList(), new FruitComp());
        //sort(정렬할 대상, 정렬방법정의된 Comparator)

        System.out.println(appleBox);
        System.out.println(grapeBox);
    }
}
/*
[GreenApple(300), GreenApple(200), GreenApple(100)]
[GreenGrape(400), GreenGrape(300), GreenGrape(200)]

[GreenApple(100), GreenApple(200), GreenApple(300)]
[GreenGrape(200), GreenGrape(300), GreenGrape(400)]

 */