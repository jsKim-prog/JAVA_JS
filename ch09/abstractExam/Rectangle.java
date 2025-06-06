package ch09.abstractExam;

public class Rectangle extends Shape{//추상->상속 클래스(사각형)

	//필드
	double length; //높이
	double width; //넓이
	
	//생성자 -추상은 new 안되므로 반드시 구현
	//Implicit super constructor Shape() is undefined for default constructor. Must define an explicit constructor
	public Rectangle(String color, double length,double width) {
		super(color);
		System.out.println("Rectangle(자식클래스) 생성자 호출");
		this.length=length;
		this.width=width;
	}

	//메서드 -추상메서드 반드시 구현
	//The type Circle must implement the inherited abstract method Shape.toString()
	@Override
	double area() {
		// 사각형의 면적구하기
		return length*width;
	}

	@Override
	public String toString() {
		// 사각형의 정보 출력
		return super.getColor()+"색 사각형의 면적은"+area();
	}


}
