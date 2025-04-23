package genericsExam;

public class FruitBox<T extends Fruit> extends Box<T>{//Ex3
    //Ex2 : FruitBox<T extends Fruit & Eatable>
    //<T extends Fruit ...> Fruit 자손 타입으로 지정
    //<T extends ... & Eatable> 인터페이스 구현 제약에도 implements가 아니라 extends 사용, &는 연결
    //FruitBox에는 Fruit 자손이면서 Eatable을 구현한 클래스만 대입 가능
}
