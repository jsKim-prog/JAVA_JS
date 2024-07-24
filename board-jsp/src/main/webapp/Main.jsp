<%@page import="common.JDBConnection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>connect 테스트</h2>
	<%
	JDBConnection con = new JDBConnection();
	con.close();
	%>

</body>
</html>