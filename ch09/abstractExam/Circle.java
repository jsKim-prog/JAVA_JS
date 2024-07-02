package ch09.abstractExam;

public class Circle extends Shape{//추상->상속 클래스(원)

	//필드
	double radius; //반지름
	
	//생성자 -추상은 new 안되므로 반드시 구현
	//Implicit super constructor Shape() is undefined for default constructor. Must define an explicit constructor
	public Circle(String color, double radius) {
		super(color);
		System.out.println("Circle(자식클래스) 생성자 호출");
		this.radius=radius;
	}

	//메서드 -추상메서드 반드시 구현
	//The type Circle must implement the inherited abstract method Shape.toString()
	@Override
	double area() {
		// 원의 둘레구하기
		return radius*radius*3.14;
	}

	@Override
	public String toString() {
		// 원의 정보 출력
		return super.getColor()+"색 원의 면적은"+area();
	}


}
