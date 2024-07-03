package kr.co.mbc.board;

import java.util.Scanner;

import kr.co.mbc.board.accountDTO.Account;
import kr.co.mbc.board.boardDTO.Board;
import kr.co.mbc.board.boardDTO.FreeBoard;
import kr.co.mbc.board.boardDTO.MemberBoard;
import kr.co.mbc.board.service.UserService;
import kr.co.mbc.board.service.BoardService;

public class WebBoardExam {
	public static Scanner scanner = new Scanner(System.in);
	public static Account[] accounts = new Account[100];
	public static Account loginAccount; // 로그인 계정용(세션)
	public static Board board = null;
	public static FreeBoard[] freeboards = new FreeBoard[100];
	public static MemberBoard[] memberboards = new MemberBoard[100];

	static {
		// 계정 초기값
		Account account1 = new Account("aaa", "aaa", "aaa", "aaa@aaa.com");
		accounts[0] = account1;
		Account account2 = new Account("bbb", "bbb", "bbb", "bbb@aaa.com");
		accounts[1] = account2;

		// 게시글 초기값(자유게시판)
		FreeBoard free1 = new FreeBoard();
		free1.setBno(1);
		free1.setIndexNum(1);		
		free1.setTitle("첫번째 게시글입니다.-테스트용");
		free1.setwriter("aaa");
		free1.setRegDate("2024/06/20");
		free1.setContent("첫번째 게시글 내용입니다. 테스트용입니다. ");
		freeboards[0] = free1;

		FreeBoard free2 = new FreeBoard();
		free2.setBno(2);
		free2.setIndexNum(2);
		free2.setTitle("두번째 게시글입니다.-테스트용테스트용");
		free2.setwriter("aaa");
		free2.setRegDate("2024/06/27");
		free2.setContent("두번째 게시글 내용입니다. 테스트용입니다. 테스트용입니다.");
		freeboards[1] = free2;
		
		MemberBoard mem1 = new MemberBoard();
		mem1.setBno(2);
		mem1.setIndexNum(2);
		mem1.setTitle("첫번째 회원게시글입니다.");
		mem1.setwriter("aaa");
		mem1.setRegDate("2024/06/27");
		mem1.setContent("첫번째 게시글 내용입니다. 회원용입니다.테스트용입니다. 테스트용입니다.");
		memberboards[0] = mem1;
	}

	public static void main(String[] args) {
		// 메인메뉴
		Account user = new Account();// guest용 객체 생성
		loginAccount = user; // loginAccount에 연결
		System.out.println("====== NEW Web Board ======");
		boolean run = true;
		while (run) {
			System.out.println("1.회원가입 | 2.로그인 | 3.게시판 | 4.쇼핑 | 5.종료");
			System.out.print(">>>");
			int select = scanner.nextInt();

			switch (select) {
			case 1:
				System.out.println("회원가입을 시작합니다.");
				loginAccount = UserService.createAccount(scanner, accounts, loginAccount);
				break;
			case 2:
				System.out.println("로그인을 시작합니다.");
				loginAccount = UserService.login(scanner, accounts, loginAccount); 
				System.out.println("test :" + loginAccount.getIndexNum() + ". " + loginAccount.getNickName());
				System.out.println("test :사용자 권한:" + loginAccount.getAuthor());
				System.out.println("test :로그인여부:" + loginAccount.isLoginCK());
				UserService.menu(scanner, loginAccount, freeboards, memberboards, accounts);
				break;
			case 3:
				System.out.println("게시판으로 이동합니다.");
				BoardService.menu(scanner, freeboards, loginAccount, accounts, memberboards);
				break;
			case 4:
				System.out.println("(구현중)쇼핑몰로 이동합니다.");
				break;
			case 5:
				System.out.println("시스템을 종료합니다.");
				loginAccount.setLoginCK(false);
				run = false;
				break;
			default:
				System.out.println("입력오류 : 1~5번 값만 입력하세요.");
			}// --switch()
		} // --while()

	}//--main()

	
	
}//-class()
