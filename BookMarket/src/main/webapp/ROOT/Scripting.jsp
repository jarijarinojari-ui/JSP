<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scripting</title>
</head>
<body>
<h2>Scripting Tag</h2>
<%!//스크립트 태그의 선
int count = 3;

String marketLower (String data) {
	return data.toLowerCase();
}

%>

<%// 스크립트 태그의 처리
for (int i=1; i <= count; i++){
	out.println("Java Server Pages" + i +".<br>");
}
%>

<%=//스크립트 태그의 출력
marketLower("Hello World") // 세미콜론 사용 안
%>

</body>
</html>