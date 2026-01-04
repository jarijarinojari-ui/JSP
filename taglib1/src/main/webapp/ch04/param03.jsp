<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
<head>
<title>Action Tag</title>
</head>
<body>
	<h3>param 액션 태그</h3>
	<jsp:include page="param03_date.jsp">
		<jsp:param name="title" value='<%=java.net.URLEncoder.encode("오늘의 날짜와 시각") %>'/>
		<jsp:param name="date" value="<%=java.util.Calendar.getInstance().getTime() %>"/>
		<jsp:param name="a" value="abc"/>
	</jsp:include>
	
		
</body>
</html>