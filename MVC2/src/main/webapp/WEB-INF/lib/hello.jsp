<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h3>쿠폰이 도착햇습니다.</h3>
		<h3><%= request.getAttribute("msg") %></h3>
	</div>
</body>
</html>