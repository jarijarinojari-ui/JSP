<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String quary = request.getParameter("query");
	String method = request.getMethod();
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
</head>
	<body>
		<div><h1>JSP</h1></div>
		<div><h3><%= quary %><%= method %><h3></div>
		<ul>
			<%
				for (int i = 1 ; i < 10; i++){
			%>
				<li>No.<%=i %> </li>
			<%
				}
			%>
		</ul>
	</body>
</html>