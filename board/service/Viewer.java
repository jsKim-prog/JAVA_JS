package kr.co.mbc.board.service;

import kr.co.mbc.board.boardDTO.FreeBoard;
import kr.co.mbc.board.boardDTO.MemberBoard;

public class Viewer {// 출력보기용 메서드
	// 필드

	/* 게시판리스트 보기용 출력(자유게시판) */
	public static void printBoard(FreeBoard[] freeBoards) {

		for (int i = 0; i < freeBoards.length; i++) {
			if (freeBoards[i] != null) {// 비어있지 않은 배열만 출력!
				System.out.println("--------------------------------------------");
				System.out.printf("%6s\t%10s\t%5s\t%d\t%s\n", freeBoards[i].getBno(), freeBoards[i].getTitle(),
						freeBoards[i].getwriter(), freeBoards[i].getGoodPoint(), freeBoards[i].getRegDate());

			} else { // 비어있으면 출력 중지
				break;
			}
		} // --for()
	}// --printBoard
	
	/* 게시판리스트 보기용 출력(멤버게시판) */
	public static void printMBoard(MemberBoard[] memberBoards) {

		for (int i = 0; i < memberBoards.length; i++) {
			if (memberBoards[i] != null) {// 비어있지 않은 배열만 출력!
				System.out.println("--------------------------------------------");
				System.out.printf("%6s\t%10s\t%5s\t%d\t%s\n", memberBoards[i].getBno(), memberBoards[i].getTitle(),
						memberBoards[i].getwriter(), memberBoards[i].getGoodPoint(), memberBoards[i].getRegDate());

			} else { // 비어있으면 출력 중지
				break;
			}
		} // --for()
	}// --printBoard



}
