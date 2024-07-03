package kr.co.mbc.board.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import kr.co.mbc.board.accountDTO.Account;
import kr.co.mbc.board.boardDTO.FreeBoard;
import kr.co.mbc.board.boardDTO.MemberBoard;

public class Common {// 공통메서드
	// 필드

	// 생성자

	/* 메서드-오늘날짜 입력 */
	public static String today() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String today = LocalDate.now().format(formatter);
		return today;
	}// --today()

	/* 메서드-계정 번호 생성 */
	public static int createNum(Account[] accounts) {
		int max = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getIndexNum() > max) {
				max = accounts[i].getIndexNum();
			}
		}
		return max;
	}

	/*
	 * 메서드-게시물 번호 생성 -setter로 이동 public static int createBnum(Board[] boards) { int
	 * max = 0; for (int i = 0; i < boards.length; i++) { if (boards[i] != null &&
	 * boards[i].getIndexNum() > max) { max = boards[i].getIndexNum(); break; } }
	 * return max; }//--createBnum()
	 */

	/* 메서드-bno만들기-문자앞에 0붙이기 */
	public static String addZero(int num) {
		String result = ""; // 0을 붙여 반환할 문자열
		String number = "" + num;// 받은 인덱스 int를 문자열로 바꾼다(자리수 계산위해)
		int size = 4; // 표시할 총 자리수
		if (number.length() > size) {// 인덱스 자리수가 고정자리수보다 크면
			return number; // 인덱스 그대로 반환
		}
		for (int i = 0; i < size - number.length(); i++) {
			result += 0; // 고정자리수-인덱스자리수만큼 0만들어서 result에 넣기
		}

		return result + number;// 0과인덱스 번호를 붙여 반환

	}

	/* 메서드-인덱스 번호로 게시물 찾기(자유게시판) */
	public static FreeBoard findIndex(FreeBoard[] freeBoards, int num) {
		FreeBoard findBoard = new FreeBoard();// 찾은 객체 넣을 새객체생성
		for (int i = 0; i < freeBoards.length; i++) {
			if (freeBoards[i] != null) {// 빈곳이 아니어야 하고
				if (freeBoards[i].getIndexNum() == num) {// 같은 indexNum거 찾아서
					findBoard = freeBoards[i];
					break;
				} else {
					System.out.println("");
				}
			} // --if(null)
		} // --for()
		return findBoard;
	}// --findIndex()

	/* 메서드-인덱스 번호로 게시물 찾기(회원게시판) */
	public static MemberBoard findIndex(MemberBoard[] memberBoards, int num) {
		MemberBoard findBoard = new MemberBoard();// 찾은 객체 넣을 새객체생성
		for (int i = 0; i < memberBoards.length; i++) {
			if (memberBoards[i] != null) {// 빈곳이 아니어야 하고
				if (memberBoards[i].getIndexNum() == num) {// 같은 indexNum거 찾아서
					findBoard = memberBoards[i];
					break;
				} else {
					System.out.println("");
				}
			} // --if(null)
		} // --for()
		return findBoard;
	}// --findIndex()

	

}// --class
