package kr.co.mbc.board.boardDTO;

import kr.co.mbc.board.accountDTO.Account;
import kr.co.mbc.board.service.Common;

public class MemberBoard extends Board{ //파일전용 게시판
	//필드
	private String bno; // 게시물 번호
	private int indexNum; // bno추출용 저장 순서
	private Account account; //계정정보
	//생성자
	
	//메서드
	public void setIndexNum(MemberBoard[] memberBoards) { // 배열번호로 자동생성
		int max = 0;
		for (int i = 0; i < memberBoards.length; i++) {
			if (memberBoards[i] != null) { // 비어있지 않으면 검색시작
				if (memberBoards[i].indexNum > max) {// 배열의 indexNum이 더 크면 max변경
					max = memberBoards[i].indexNum;
				} else if (memberBoards[i].indexNum <= max) {// 최대 index값 만나면 검색 중지
					break;
				} else {// 비어있으면
					max = 0;
				}
			}
		} // --for()
		this.indexNum = max + 1;
		setBno(indexNum); // indexnum이 생성되면 bno자동실행
	}
	public String getBno() {
		String head = "ME"; // 멤버게시판머리글
		return head + bno;
	}
	public int getIndexNum() {
		return indexNum;
	}
	public Account getAccount() {
		return account;
	}
	public void setBno(int indexNum) {
		this.bno = Common.addZero(indexNum);
	}
	public void setIndexNum(int indexNum) {
		this.indexNum = indexNum;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	

}
