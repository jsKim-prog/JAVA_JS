<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<h2>로그인</h2>
	
	<hr>
	<form action="./LoginResponse.jsp" method = "post">
		아이디 : <input type="text" name="id" value="" /><br>
		(3글자 이상의 영문 또는 영문+숫자 조합) <br>
		패스워드 : <input type="password" name="pw" value="" /><br>
		(4글자 이상의 영문 또는 영문+숫자 조합)<br>
		<input type = "submit" value = "LOGIN">
	</form>
	
	<%
	String loginErr=request.getParameter("loginErr");
	if(loginErr!=null){//loginErr 값이 넘어오면(null이 아니면)
		%>
	<ul>		
	<li>Result : <%=loginErr%> </li>	
	<li>로그인 실패. 회원정보를 확인해 주세요. </li>	
	</ul>	
	<%} %>

</body>
</html>