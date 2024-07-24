<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- @지시어 : 자바언어 사용에 대한 안내, 시그니처 -->
<%!/*! : 선언부  */
	String str1 = "JSP";
	String str2 = "안녕하세요~^^";%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JSP</title>
</head>
<body>
	<h2>
		처음 만드는
		<%=str1 + str2%></h2> <!--문장 합치기는 가능!  -->
	<!-- =는 표현식 -->
	<p><%out.println(str2+" "+str1+"입니다. 지금부터 시작합니다.");
	%>
	</p>
	<!--P태그 : 문단태그  -->
</body>
</html>