package ch10.definedexception;

public class BalanceException extends Exception{
	//사용자 정의 예외 클래스도 필드, 생성자, 메소드 선언들을 포함할 수 있지만 대부분 생성자 선언만을 포함한다.
	//생성자 선언은 2개를 선언하는 것이 일반적
	//하나는 매개 변수가 없는 기본 생성자 - 생성자1
	//다른 하나는 예외 발생 원인(예외 메세지)를 전달하기 위해 String 타입의 매개 변수를 갖는 생성자
	
	//생성자1 - 기본생성자
	public BalanceException() { }
	//생성자2 -메시지 전달용 생성자
	public BalanceException(String message) { //Exception 상속받은 생성자
		super(message); //catch{} 블록의 예외 처리 코드에서 이용하기 위해서 메시지를 받는다.
	}
	
}
