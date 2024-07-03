package kr.co.mbc.board.accountDTO;

import kr.co.mbc.board.Author;
import kr.co.mbc.board.service.Common;

public class Account { //사용자계정(부모)
	//필드
	private String id;
	private String pw;
	private String nickName;
	private String email;
	private Author author;	
	private boolean loginCK;
	private int indexNum;
	private boolean usability; //ID,PW 사용가능여부 판단용
	private String regData; //가입일
	
	//생성자
	public Account() {//기본생성자(처음 접속시)
		super();
		this.id="Guest";
		this.pw="guest";
		this.nickName="guest";
		this.email=null;
		this.author=Author.GUEST;
		this.loginCK=false;
		this.indexNum=0;
		this.usability=false;		
	}
	
	public Account(String id, String pw, String nickName, String email) {//회원가입용 생성자
		super();
		this.id = id;
		this.pw = pw;
		this.nickName = nickName;
		this.email = email;
		this.author = Author.USER; //가입시 user로 권한 변경
	}
	
	public Account(String id, String pw) {//로그인시 생성자
		super();
		this.id = id;
		this.pw = pw;
		this.loginCK=false; //로그인 성공 시 변경
	}

	//메서드
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getNickName() {
		return nickName;
	}
	public String getEmail() {
		return email;
	}
	public Author getAuthor() {
		return author;
	}
	public boolean isLoginCK() {
		return loginCK;
	}
	public int getIndexNum() {
		return indexNum;
	}
	public void setId(String id) {// test 입력용 setter
		this.id = id;
	}
	
	public void setId(String id, Account[] accounts) {// ID검증용 setter
		for (int i = 0; i < accounts.length ; i++) {
			if (accounts[i] != null && accounts[i].id.equals(id)) {//동일id검색
				this.id = id;
				this.usability=false;
				break;
			} else {
				this.id = id;
				this.usability=true;
				//break;
			}
		} // --for()
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public void setNickName(String nickName, Account[] accounts) {
		for (int i = 0; i < accounts.length ; i++) {
			if (accounts[i] != null && accounts[i].nickName.equals(nickName)) {//동일id검색
				this.nickName = nickName;
				this.usability=false;
				break;
			} else {
				this.nickName = nickName;
				this.usability=true;
				//break;
			}
		} // --for()
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public boolean isUsability() {
		return usability;
	}
	

	public void setIndexNum(Account[] accounts) {//인덱스 번호 자동생성(배열에서 가장 큰번호+1)
		this.indexNum = Common.createNum(accounts)+1;
	}
	

	public void setLoginCK(boolean loginCK) {
		this.loginCK = loginCK;
	}
	
	

	public String getRegData() {
		return regData;
	}

	public void setRegData(String regData) {
		this.regData = Common.today();
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", pw=" + pw + ", nickName=" + nickName + ", email=" + email + ", author=" + author
				+ ", loginCK=" + loginCK + ", indexNum=" + indexNum + ", usability=" + usability + "]";
	}
	
	

}
