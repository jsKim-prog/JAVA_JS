package kr.co.mbc.board.boardDTO;

import kr.co.mbc.board.service.Common;

public class FreeBoard extends Board { // 자유게시판
	// 필드
	
	private int indexNum; // bno추출용 저장 순서
	private String bno; // 게시물 번호
	// 생성자

	// 메서드
	public void setIndexNum(FreeBoard[] freeBoards) { // 배열번호로 자동생성
		int max = 0;
		for (int i = 0; i < freeBoards.length; i++) {
			if (freeBoards[i] != null) { // 비어있지 않으면 검색시작
				if (freeBoards[i].indexNum > max) {// 배열의 indexNum이 더 크면 max변경
					max = freeBoards[i].indexNum;
				} else if (freeBoards[i].indexNum <= max) {// 최대 index값 만나면 검색 중지
					break;
				} else {// 비어있으면
					max = 0;
				}
			}
		} // --for()
		this.indexNum = max + 1;
		setBno(indexNum); // indexnum이 생성되면 bno자동실행
	}

	public void setIndexNum(int indexNum) {// 강제 인덱스 넘버 생성
		this.indexNum = indexNum;
	}

	public void setBno(int indexNum) { // index번호에 0을 붙여 bno 생성
		this.bno = Common.addZero(indexNum);
	}

	public String getBno() {// 머리글 붙여서 bno 생성
		String head = "FR"; // 자유게시판머리글
		return head + bno;
	}

	public int getIndexNum() {
		return indexNum;
	}

	

}
