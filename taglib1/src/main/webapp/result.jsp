<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테스트 화면</title>
</head>
<body>

	<h2>계산기 테스트</h2>

	<jsp:useBean id="myCalc" class="com.test.Calculator" />
	
	<%
		// 자바 파일에 있는 process 메서드 사용 (5를 넣음)
		int result = myCalc.process(5);
	%>
	
	<p>5의 3제곱 결과는: <b><%= result %></b> 입니다.</p>

</body>
</html>