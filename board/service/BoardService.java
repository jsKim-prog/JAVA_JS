package kr.co.mbc.board.service;

import java.util.ArrayList;
import java.util.Scanner;

import kr.co.mbc.board.accountDTO.Account;
import kr.co.mbc.board.boardDTO.FreeBoard;
import kr.co.mbc.board.boardDTO.MemberBoard;

public class BoardService { // 게시판 서비스용
	public static Scanner inputStr = new Scanner(System.in);// 문장 받기용 입력객체
	/* 게시판 메인메뉴 */
	public static void menu(Scanner scanner, FreeBoard[] freeBoards, Account loginAccount, Account[] accounts,
			MemberBoard[] memberBoards) {
		System.out.println("------ MBC아카데미 게시판 -----");
		System.out.println("1.자유게시판 | 2.회원게시판 | 3.닫기");

		boolean run = true;
		while (run) {
			int select = scanner.nextInt();

			switch (select) {
			case 1:
				freebMenu(scanner, freeBoards);
				break;
			case 2:
				System.out.println("2.회원게시판 ");
				if (loginAccount.isLoginCK()) {// 로그인 중이면(loginCK=true)
					memberbMenu(scanner, memberBoards, loginAccount);
				} else {
					System.out.println("회원전용 서비스입니다. 로그인 화면으로 이동합니다.");
					UserService.login(scanner, accounts, loginAccount);
				}
				break;
			case 3:
				System.out.println("종료합니다.");
				run = false;
				break;
			default:
				System.out.println("입력오류 : 1~4번 값만 입력하세요.");
			}// --switch()

		} // --while()
	}// --menu()

	/* 자유게시판메뉴 */
	public static void freebMenu(Scanner scanner, FreeBoard[] freeBoards) {

		boolean run = true;
		while (run) {
			System.out.println("******** 자유게시판 ********");
			Viewer.printBoard(freeBoards);
			System.out.println();
			System.out.println("1.글쓰기 | 2.내용보기| 3. 닫기");

			int select = scanner.nextInt();
			switch (select) {
			case 1:
				write(scanner, freeBoards);				
				break;
			case 2:
				viewMenu(scanner, freeBoards);
				break;
			case 3:
				System.out.println("종료합니다");
				run = false;
				break;
			default:
				System.out.println("입력오류 : 1~3번 값만 입력하세요.");
			}// --switch()
		} // --while()

	} // --freebMenu()

	/* 자유게시판-글쓰기 */
	public static void write(Scanner scanner, FreeBoard[] freeBoards) {
		FreeBoard newContents = new FreeBoard();

		System.out.println("제목을 입력하세요.");
		System.out.print(">>>");
		newContents.setTitle(inputStr.nextLine());
		System.out.println("내용을 입력하세요.");
		System.out.print(">>>");
		newContents.setContent(inputStr.nextLine());
		System.out.println();
		System.out.println("작성자를 입력하시겠습니까?(미입력시 랜덤이름으로 삽입)");
		System.out.print("예:1/아니오:2 >>>");
		int answer = scanner.nextInt(); // int는 고정 스캐너로 받는다.
		if (answer == 1) {
			System.out.println("작성자 명을 입력해 주세요.");
			newContents.setwriter(inputStr.next());
			// 작성자 명을 입력하면 입력값이 넘어가고
		} else {
			newContents.setwriter("oo");
			// 작성자 명 미입력시 고정문자(익명) 전송
		}
		System.out.println("저장하시겠습니까?");
		System.out.print("예:1/아니오:2 >>>");
		answer = scanner.nextInt();
		if (answer == 1) {// 저장시
			newContents.setIndexNum(freeBoards); // 배열로 인덱스 번호생성
			newContents.setRegDate();
			for (int i = 0; i < freeBoards.length; i++) {
				if (freeBoards[i] == null) {
					freeBoards[i] = newContents; // 빈배열에 작성글 넣기
					System.out.println("저장되었습니다.");
					break;
				}
			} // --for
		} else { // 작성취소시
			System.out.println("글쓰기가 취소되었습니다.");
			newContents = null;
		}
	}//--write()
	
	
	/* 자유게시판-상세보기 */
	public static void viewMenu(Scanner scanner, FreeBoard[] freeBoards) {
		FreeBoard findBoard = new FreeBoard();

		boolean run = true;
		while (run) {
			System.out.println("게시물 번호를 입력하세요.>>>");
			int findNum = scanner.nextInt();
			findBoard = Common.findIndex(freeBoards, findNum); // 게시물 번호로 해당 객체 찾아오고
			// 찾은객체 출력
			System.out.println("No. " + findBoard.getBno());
			System.out.println("작성자 : " + findBoard.getwriter());
			System.out.println("작성일 : " + findBoard.getRegDate());
			System.out.println();
			System.out.println("제목 : " + findBoard.getTitle());
			System.out.println("---------------------------");
			System.out.println(findBoard.getContent());
			System.out.println("---------------------------");
			System.out.println("1.추천 | 2.신고 | 3. 닫기");
			int select2 = scanner.nextInt();
			switch (select2) {
			case 1:
				findBoard.setGoodPoint(1); // 추천수에 1누적
				System.out.println(findBoard.getBno() + "글을 추천하셨습니다.");
				break;
			case 2:
				findBoard.setBadPoint(1); // 신고수에 1누적
				System.out.println(findBoard.getBno() + "글을 신고하셨습니다.");
				break;
			case 3:
				System.out.println("종료합니다");
				run = false;
				break;
			default:
				System.out.println("입력오류 : 1~3번 값만 입력하세요.");
			}// -switch(case2)
		} // --while()
	}// --viewMenu()

	/* 회원게시판메뉴 */
	public static void memberbMenu(Scanner scanner, MemberBoard[] memberBoards, Account loginAccount) {

		boolean run = true;
		while (run) {
			System.out.println("******** 회원게시판 ********");
			Viewer.printMBoard(memberBoards);
			System.out.println();
			System.out.println("1.글쓰기 | 2.내용보기| 3.내글보기 | 4.수정 |5. 삭제 | 6.닫기");

			int select = scanner.nextInt();
			switch (select) {
			case 1:
				write(scanner, memberBoards, loginAccount);
				break;
			case 2:
				viewMenu(scanner, memberBoards);
				break;

			case 3:
				myText(scanner, memberBoards, loginAccount);	
				break;				
			case 4:
				modify(scanner, memberBoards, loginAccount);	
				break;
			case 5:
				delete(scanner, memberBoards, loginAccount);				
				break;
			case 6:
				System.out.println("종료합니다");
				run = false;
				break;
			default:
				System.out.println("입력오류 : 1~3번 값만 입력하세요.");
			}// --switch()
		} // --while()

	} // --freebMenu()
	/* 회원게시판-글쓰기 */
	public static void write(Scanner scanner, MemberBoard[] memberBoards, Account loginAccount) {
		MemberBoard newContents = new MemberBoard();

		System.out.println("제목을 입력하세요.");
		System.out.print(">>>");
		newContents.setTitle(inputStr.nextLine());
		System.out.println("내용을 입력하세요.");
		System.out.print(">>>");
		newContents.setContent(inputStr.nextLine());
		System.out.println();

		System.out.println("저장하시겠습니까?");
		System.out.print("예:1/아니오:2 >>>");
		int answer = scanner.nextInt();
		if (answer == 1) {// 저장시
			newContents.setIndexNum(memberBoards); // 배열로 인덱스 번호생성
			newContents.setRegDate();
			newContents.setwriter(newContents.getAccount().getNickName());
			for (int i = 0; i < memberBoards.length; i++) {
				if (memberBoards[i] == null) {
					memberBoards[i] = newContents; // 빈배열에 작성글 넣기
					System.out.println("저장되었습니다.");
					break;
				}
			} // --for
		} else { // 작성취소시
			System.out.println("글쓰기가 취소되었습니다.");
			newContents = null;
		}
	}// --write(회원용)

	/* 회원게시판-상세보기 */
	public static void viewMenu(Scanner scanner, MemberBoard[] memberBoards) {
		MemberBoard findBoard = new MemberBoard();

		boolean run = true;
		while (run) {
			System.out.println("게시물 번호를 입력하세요.>>>");
			int findNum = scanner.nextInt();
			findBoard = Common.findIndex(memberBoards, findNum); // 게시물 번호로 해당 객체 찾아오고
			// 찾은객체 출력
			System.out.println("No. " + findBoard.getBno());
			System.out.println("작성자 : " + findBoard.getwriter());
			System.out.println("작성일 : " + findBoard.getRegDate());
			System.out.println();
			System.out.println("제목 : " + findBoard.getTitle());
			System.out.println("---------------------------");
			System.out.println(findBoard.getContent());
			System.out.println("---------------------------");
			System.out.println("1.추천 | 2.신고 | 3. 닫기");
			System.out.print(">>>");
			int select2 = scanner.nextInt();
			switch (select2) {
			case 1:
				findBoard.setGoodPoint(1); // 추천수에 1누적
				System.out.println(findBoard.getBno() + "글을 추천하셨습니다.");
				break;
			case 2:
				findBoard.setBadPoint(1); // 신고수에 1누적
				System.out.println(findBoard.getBno() + "글을 신고하셨습니다.");
				break;
			case 3:
				System.out.println("종료합니다");
				run = false;
				break;
			default:
				System.out.println("입력오류 : 1~3번 값만 입력하세요.");
			}// -switch(case2)
		} // --while()
	}// --viewMenu()

	/* 회원게시판-내글보기 */
	public static void myText(Scanner scanner, MemberBoard[] memberBoards, Account loginAccount) {
		//배열에서 작성자이름검색하여 출력
		for (int i = 0; i < memberBoards.length; i++) {
			if (memberBoards[i] != null && memberBoards[i].getwriter().equals(loginAccount.getNickName())) {
				System.out.println("--------------------------------------------");
				System.out.printf("%6s\t%10s\t%5s\t%d\t%s\n", memberBoards[i].getBno(),
						memberBoards[i].getTitle(), memberBoards[i].getwriter(), memberBoards[i].getGoodPoint(),
						memberBoards[i].getRegDate());

			} else {
				System.out.println("게시글이 없습니다.");
				break;
			}
		}//--for()
				
	}//--myText()
	
	/* 회원게시판-수정하기 */
	public static void modify(Scanner scanner, MemberBoard[] memberBoards, Account loginAccount) {
		MemberBoard modBoard = new MemberBoard();
		boolean run=false;
		System.out.println("수정할 게시글의 번호를 입력하세요.");
		System.out.print(">>>");
		int select = scanner.nextInt();
		modBoard = Common.findIndex(memberBoards, select);
		if(modBoard.getwriter().equals(loginAccount.getNickName())) {
			//검색글의 작성자와 회원의 닉네임이 같으면
			//게시글 보이기
		System.out.println("-------------------------");
		System.out.println("No. " + modBoard.getBno());
		System.out.println("작성자 : " + modBoard.getwriter());
		System.out.println("작성일 : " + modBoard.getRegDate());
		System.out.println();
		System.out.println("제목 : " + modBoard.getTitle());
		System.out.println("---------------------------");
		System.out.println(modBoard.getContent());
		System.out.println("---------------------------");	
		run=true;
		}else {
			System.out.println("수정권한이 없습니다.");
			run=false;
		}
		
		while(run) {
			System.out.println("수정할 항목을 선택하세요.");
			System.out.println("1. 제목 | 2. 내용  | 3.종료");
			System.out.print(">>>");
			int select2 = scanner.nextInt();
			switch(select2) {
			case 1:
				System.out.println("수정할 제목을 입력하세요.");
				System.out.print(">>>");
				modBoard.setTitle(inputStr.nextLine());				
				break;
			case 2:
				System.out.println("수정할 내용을 입력하세요.");
				System.out.print(">>>");
				modBoard.setContent(inputStr.nextLine());
				break;
			case 3:
				System.out.println("게시물 수정을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("잘못된 입력입니다. 1~3값만 입력하세요.");
				
				System.out.println("저장하시겠습니까?");
				System.out.print("예:1/아니오:2 >>>");
				int answer = scanner.nextInt();
				if (answer == 1) {// 저장시					
					modBoard.setRegDate();
					for (int i = 0; i < memberBoards.length; i++) {
						if (memberBoards[i] != null && memberBoards[i].getIndexNum()==modBoard.getIndexNum()) {//같은 인덱스 넘버 찾아서
							memberBoards[i] = modBoard; // 빈배열에 작성글 넣기
							System.out.println("저장되었습니다.");
							break;
						}
					} // --for
				} else { // 작성취소시
					System.out.println("수정이 취소되었습니다.");
					modBoard = null;
				}
				break;
			}
		}//--while()
				
	}//--modify()

	/* 회원게시판-삭제하기 */
	public static void delete(Scanner scanner, MemberBoard[] memberBoards, Account loginAccount) {
		MemberBoard delBoard = new MemberBoard();
		boolean run=false;
		System.out.println("삭제할 게시글의 번호를 입력하세요.");
		System.out.print(">>>");
		int select = scanner.nextInt();
		delBoard = Common.findIndex(memberBoards, select);
		if(delBoard.getwriter().equals(loginAccount.getNickName())) {
			//삭제대상에 대한 권한 있으면
			memberBoards[select]=null;
				} else {
					System.out.println("삭제권한이 없습니다.");
			}		
	}//--delete()

}// --class
