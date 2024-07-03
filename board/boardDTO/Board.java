package kr.co.mbc.board.boardDTO;

import kr.co.mbc.board.service.Common;

public class Board { //board-부모
	//필드
	
	private String title; // 제목
	private String content; // 내용
	private String writer; // 작성자
	private String regDate;// 작성일	
	private int goodPoint; // 좋아요 포인트
	private int badPoint; // 신고횟수

	//생성자
	
	//메서드
	
	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}
	public String getwriter() {
		return writer;
	}
	public String getRegDate() {
		return regDate;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setwriter(String writer) {
		this.writer = writer;
	}
	public void setRegDate() { //날짜자동생성용
		this.regDate = Common.today();
	}
	
	public void setRegDate(String regDate) {//날짜입력용
		this.regDate = regDate;
	}

	public int getGoodPoint() {
		return goodPoint;
	}

	public int getBadPoint() {
		return badPoint;
	}

	public void setGoodPoint(int goodPoint) {
		this.goodPoint = goodPoint;
	}

	public void setBadPoint(int badPoint) {
		this.badPoint = badPoint;
	}
	
	
	
	

}
