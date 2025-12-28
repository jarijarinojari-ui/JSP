<%@ page contentType ="text/html; charset = utf-8"%>
<%! int pageCount = 0; 
	void addCount () {
		pageCount++;
	}
%>
<%
addCount();
%>
<p>total visit <%= pageCount %></p>
