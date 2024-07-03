package ch10.definedexception;

import java.util.Scanner;

public class AccountExam {

	public static void main(String[] args) {
		// 입금, 출금시 잔액부족을 예외처리로 확인
		Scanner scanner = new Scanner(System.in);
		
		Account account = new Account();//계정객체 생성
		int money = 0; //사용자가 입금할 금액 변수
		boolean condition = true;
		while (condition) { //반복 test 위한 while문
			System.out.println("입금액을 입력하세요.");
			System.out.print(">>>");
			money = scanner.nextInt();
			account.deposit(money); //입력값 예금하기
			System.out.println(money + " 원 입금되었습니다.");
			System.out.println("잔고 : " + account.getBalance() + " 원"); //잔액확인
			System.out.println("출금액을 입력하세요.");
			System.out.print(">>>");
			money = scanner.nextInt();
			try {
				account.withrow(money);
				//Unhandled exception type BalanceException
				//BalanceException(사용자정의 예외) 처리되지 않았다고 경고함		
				System.out.println(money + " 원 출금되었습니다.");
				System.out.println("잔고 : " + account.getBalance() + " 원"); //잔액확인
			} catch (BalanceException e) {
				String message = e.getMessage(); //Exception 클래스가 가지고 있는 메소드로 예외코드를 받는다.
				System.out.println(message);
				System.out.println();
				//e.printStackTrace();//예외추적
			} 
		}

	}

}
