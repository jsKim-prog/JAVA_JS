package ch10.definedexception;

public class Account {//계좌관리 클래스
	//잔고와 입금액을 파악하여 사용자 예외를 발생 시킨다.
	//잔고가 부족하면 BalanceException을 떠넘긴다.
	
	//필드
	private long balance; //잔고

	
	//기본생성자
	
	//메서드
	public long getBalance() {
		return balance;
	}//잔고 출력메서드

	
	public void deposit(int money) {
		balance += money;
	}//입금메서드(setter 역할) : 잔고에 money 누적
	
	public void withrow(int money) throws BalanceException{ //BalanceException로 예외처리를 떠넘긴다.
		if(balance<money) {//잔고가 출금액보다 적으면
			throw new BalanceException("잔고부족 : "+(money-balance)+" 원 부족");				
		}//메시지를 넣은 생성자로 사용자 정의 예외발생	
		balance-=money; //if 미실행시 잔고에서 money 빼기
		
	}//출금메서드

}
