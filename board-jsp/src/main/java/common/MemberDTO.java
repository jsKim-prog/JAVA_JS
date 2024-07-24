package common;

import java.sql.Date;

public class MemberDTO {
	//필드
	private String name;
	private String id;
	private String pw;
	private Date regdate;
	private boolean loginCheck;
	//생성자
	public MemberDTO() {} //기본생성자
	public MemberDTO(String id, String pw) {//커스텀 생성자(로그인)
		//super();
		this.id = id;
		this.pw = pw;
		this.loginCheck = false;
	}
	
	
	//메서드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public boolean isLoginCheck() {
		return loginCheck;
	}
	public void setLoginCheck(boolean loginCheck) {
		this.loginCheck = loginCheck;
	}
	public Date getRegdate() { //DB 자동생성으로 getter만 생성
		return regdate;
	}
	
	
	
	

}
