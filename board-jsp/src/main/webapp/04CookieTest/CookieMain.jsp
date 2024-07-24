<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CookieMain.jsp</title></head><body>
	<h2>1. 쿠키설정</h2>
	<% 
	Cookie cookie = new Cookie("newCookie01","쿠키테스트내용1"); //name, value 넣어 생성
	//쿠키의 경로와 유효기간 설정
	cookie.setPath(request.getContextPath()); //컨텍스트 루트로 설정
	cookie.setMaxAge(60*60); //1분만 유지
	response.addCookie(cookie); //응답헤더에 만든 쿠키 추가
	System.out.println(cookie.getPath()); //경로를 콘솔에 출력
	
	Cookie ck = new Cookie("newCookie02","두번째쿠키테스트내용");
	ck.setPath("/");
	ck.setMaxAge(60*60); //2분간 유지
	response.addCookie(ck);
	System.out.println(ck.getPath()); //경로를 콘솔에 출력
	%>
	
	<h2>2. 쿠키 확인하기</h2>
	<%
	Cookie[] cookies = request.getCookies(); //요청객체를 이용, 쿠키들을 불러와 배열을 만든다.
	if(cookie != null){
		for(Cookie c:cookies){
			String cname = c.getName(); //쿠키 이름 가져오기
			String cvalue = c.getValue(); //쿠키 값 가져오기
			out.println(String.format("%s : %s<br/>", cname, cvalue));
		}
	}
	%>
</body>
</html>