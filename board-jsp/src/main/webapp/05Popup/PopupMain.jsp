<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PopupMain.jsp</title>
<!--css영역(외부파일 연결)  -->
<link rel="stylesheet" type="text/css" href="style.css" >
</head>
<body>
	<!--js영역  -->
	<script>
		
	</script>
	<!--html영역  -->
	<div id="popup">
		<h3 align="center">공지사항</h3>
		<div align="right">
			<form name="popfrm">
				<input type="checkbox" id="noOpen" value="1" />하루동안 열지 않음 
				<input type="button" id="closeBtn" value="닫기" />
			</form>
		</div>
	</div>
</body>
</html>