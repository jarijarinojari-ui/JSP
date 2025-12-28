<%@ page contentType = "application/msword" %>
<%
    response.setHeader("Content-Disposition", "attachment; filename=test.doc");
%>
<html>
<head>
<title>Directives Tag</title>
</head>
<body>
 Today is <%=new java.util.Date() %>
</body>
</html>