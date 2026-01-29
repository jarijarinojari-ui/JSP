<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.Date" %>
    <%@ page import="java.time.LocalDateTime" %>
    <%@ page import="java.time.format.DateTimeFormatter" %>
<%
	LocalDateTime now = LocalDateTime.now();
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	String result = now.format(fmt);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<meta http-equiv="refresh" content="1">
</head>
<body>
	<div>
		<h1>Hello Time</h1>
	</div>
	<div>
		<h3>현재 시작은 <%= result %>입니다.</h3>
	</div>
</body>
</html>