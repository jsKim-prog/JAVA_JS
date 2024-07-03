package kr.co.mbc.board.accountDTO;

import kr.co.mbc.board.boardDTO.Board;

public class boardAccount extends Account{//게시판활동용 계정
	//필드
	private int goodScore;//추천 점수
	private int badScore;//신고점수 -> 일정이상 black 계정으로 관리
	private Board boards;//내글 관리용 Board객체
		
	//생성자
	
	//메서드
	public int getGoodScore() {
		return goodScore;
	}
	public int getBadScore() {
		return badScore;
	}
	public Board getMyboard() {
		return boards;
	}
	public void setGoodScore(int goodScore) {
		this.goodScore = goodScore;
	}
	public void setBadScore(int badScore) {
		this.badScore = badScore;
	}
	public void setMyboard(Board boards) {
		this.boards = boards;
	}

}
