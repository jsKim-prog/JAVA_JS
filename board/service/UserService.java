package kr.co.mbc.board.service;

import java.util.Scanner;

import kr.co.mbc.board.Author;
import kr.co.mbc.board.accountDTO.Account;
import kr.co.mbc.board.boardDTO.FreeBoard;
import kr.co.mbc.board.boardDTO.MemberBoard;

public class UserService {// 가입회원서비스
	public static Scanner inputStr = new Scanner(System.in);

	/* 메뉴 */
	public static void menu(Scanner scanner, Account loginAccount, FreeBoard[] freeboards, MemberBoard[] memberboards,
			Account[] accounts) {
		boolean run = true;
		while (run) {
			System.out.println("1.마이페이지 | 2.게시판 | 3.쇼핑 | 4.로그아웃");
			System.out.print(">>>");
			int select = scanner.nextInt();

			switch (select) {
			case 1:
				System.out.println("(구현중)1. 마이페이지");
				break;
			case 2:
				System.out.println("게시판으로 이동합니다.");
				BoardService.menu(scanner, freeboards, loginAccount, accounts, memberboards);
				break;
			case 3:
				System.out.println("(구현중)쇼핑몰로 이동합니다.");
				break;
			case 4:
				System.out.println("시스템을 종료합니다.");
				loginAccount.setLoginCK(false);
				run = false;
				break;
			default:
				System.out.println("입력오류 : 1~4번 값만 입력하세요.");
			}// --switch()
		} // -while()
	}// --menu()

	/* 부메뉴-마이페이지 */
	public static void myPageMenu(Scanner scanner, Account loginAccount) {
		boolean run = true;
		while (run) {
			System.out.println("*********** 마이페이지 *********** ");
			System.out.println("1.회원정보수정 | 2.장바구니 | 3.결제정보관리 | 4.회원탈퇴 | 5.종료");
			System.out.print(">>>");

			int select = scanner.nextInt();

			switch (select) {
			case 1:
				System.out.println("(구현중)1. 회원정보수정");
				break;
			case 2:
				System.out.println("(구현중)2.장바구니");
				break;
			case 3:
				System.out.println("(구현중)3.결제정보관리");
				break;
			case 4:
				System.out.println("(구현중)4.회원탈퇴");
				break;
			case 5:
				System.out.println(" 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("입력오류 : 1~4번 값만 입력하세요.");
			}// --switch()
		} // -while()
	}// --menu()

	/* 메서드-회원가입 */
	public static Account createAccount(Scanner scanner, Account[] accounts, Account loginAccount) {
		boolean runid = true;
		while (runid) {
			System.out.println("사용할 아이디를 입력하세요.");
			System.out.print(">>>");
			String id = scanner.next();
			loginAccount.setId(id, accounts);
			if (loginAccount.isUsability()) {// 사용가능한 id면
				System.out.println(loginAccount.getId() + " 은(는) 사용가능한 ID입니다.");
				runid = false;
			} else {
				System.out.println(loginAccount.getId() + " 은(는) 사용불가능한 ID입니다.");
			}
		} // --while(id)

		System.out.println("사용할 패스워드를 입력하세요.");
		System.out.print(">>>");
		String pw = scanner.next();
		loginAccount.setPw(pw); // **추후구현-pw검증(문자수, 특수문자 등)

		boolean runName = true;
		while (runName) {
			System.out.println("사용할 닉네임을 입력하세요.");
			System.out.print(">>>");
			String nickName = scanner.next();
			loginAccount.setNickName(nickName, accounts);
			if (loginAccount.isUsability()) {// 사용가능한 id면
				System.out.println(loginAccount.getNickName() + " 은(는) 사용가능한 닉네임입니다.");
				runName = false;
			} else {
				System.out.println(loginAccount.getNickName() + " 은(는) 사용불가능한 닉네임입니다.");
			}
		} // --while(nicName)
		Account newAccount = new Account(loginAccount.getId(), loginAccount.getPw(), loginAccount.getNickName(),
				loginAccount.getEmail());
		newAccount.setAuthor(Author.USER);// 권한 넣기
		newAccount.setIndexNum(accounts);// 인덱스 번호 넣기

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {// 비어있으면
				accounts[i] = newAccount; // 작성한거 넣기
				break;
			} // --if()
		} // --for()
		System.out.println(newAccount.getNickName() + "님의 계정이 생성되었습니다.");
		return newAccount;
	}// --createAccount()

	/* 메서드-로그인 */
	public static Account login(Scanner scanner, Account[] accounts, Account loginAccount) {
		System.out.print("ID : ");
		String id = scanner.next();
		System.out.print("PW : ");
		String pw = scanner.next();
		// 새로운 객체에 입력값 삽입
		Account account = new Account(id, pw);// 검색용 객체

		// 배열과 입력값 비교 시작
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				if (accounts[i].getId().equals(account.getId())) {
					System.out.println("ID 검색이 완료되었습니다.");
					if (accounts[i].getPw().equals(account.getPw())) {
						System.out.println("PW 검색이 완료되었습니다.");
						loginAccount = accounts[i];
						loginAccount.setLoginCK(true);
						System.out.println(loginAccount.getNickName() + "님 환영합니다.");
						break;
					} else {
						System.out.println("PW를 확인해 주세요.");
					} // --if(pw비교)
				} else {
					System.out.println("ID를 확인해 주세요.");
				}
			} else {
				System.out.println("해당하는 계정이 없습니다.");
				break;
			} // --if()
		} // --for()
		return loginAccount;

	}// --login()

	/* 메서드-회원정보수정 */
	public static void modify(Scanner scanner, Account[] accounts, Account loginAccount) {
		Account modAccount = new Account(loginAccount.getId(), loginAccount.getPw(), loginAccount.getNickName(),
				loginAccount.getEmail()); // 로그인 정보를 받아 수정용 새객체 생성
		boolean run = true;
		while (run) {
			System.out.println("1.닉네임수정 | 2.패스워드변경 | 3.이메일변겅 | 4.종료");
			System.out.print(">>>");
			int select = scanner.nextInt();
			switch (select) {
			case 1:
				boolean runnickNM = true;
				while (runnickNM) {
					System.out.println("닉네임 : " + loginAccount.getNickName());
					System.out.println("수정할 닉네임을 입력하세요.");
					System.out.print(">>>");
					String nickName = inputStr.next();
					modAccount.setNickName(nickName);

					if (modAccount.isUsability()) {// 사용가능한 닉네임이면
						System.out.println(modAccount.getNickName() + " 은(는) 사용가능한 닉네임입니다.");
						runnickNM = false;
					} else {
						System.out.println(modAccount.getNickName() + " 은(는) 사용불가능한 닉네임입니다.");
					}
				} // --while(nickname)

				break;
			case 2:
				System.out.println("(구현중)2.장바구니");
				break;
			case 3:
				System.out.println("(구현중)3.결제정보관리");
				break;
			case 4:
				System.out.println("(구현중)4.회원탈퇴");
				break;
			case 5:
				System.out.println(" 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("입력오류 : 1~4번 값만 입력하세요.");
			}// --switch()

		} // --whlile

	}

	/* 메서드-회원탈퇴 */
	public static void delete() {

	}

}// --class
