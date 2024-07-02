package ch09.abstractExam;

public abstract class Shape { //최상위 추상클래스-도형
	//필드
	String color;
	
	//생성자-추상클래스는 new생성 안됨
	public Shape(String color) {
		System.out.println("Shape(추상클래스) 생성자 호출");
		this.color=color;
	}
	
	//메서드
	abstract double area(); //추상메서드
	public abstract String toString();
	
	public String getColor() {
		return color;
	}

}
