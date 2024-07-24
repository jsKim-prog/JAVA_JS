<%@page import="java.util.LinkedList"%>
<%@page import="java.util.List"%>
<%@page import="common.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LoginResponse.jsp</title>
</head>
<body><!-- 로그인 정보 받아 파악 -->
	<%
	LinkedList<MemberDTO> members = (LinkedList<MemberDTO>)application.getAttribute("app_members"); //application 영역의 리스트를 불러온다.
	String ckID = request.getParameter("id");
	String ckPW = request.getParameter("pw");
	for(MemberDTO temp : members){
		if(temp.getId().equals(ckID) && temp.getPw().equals(ckPW)){//id와 pw가 맞으면
			response.sendRedirect("LoginWelcome.jsp"); //응답객체를 활용하여 LoginWelcome.jsp로 redirect(페이지이동)
			break;
		}else{
			request.getRequestDispatcher("LoginMain.jsp?loginErr=1").forward(request, response); //요청했던 페이지로 loginErr 값을 실어서 다시 보낸다.(요청객체 이용)
			break;
		}
	}
	
	%>

</body>
</html>