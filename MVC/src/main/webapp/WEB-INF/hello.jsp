<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div>
			<h1>Heloo JSP</h1>
		</div>
		<div>
			<h3><%= request.getAttribute("msg") %></h3>
		</div>
	</body>
</html>