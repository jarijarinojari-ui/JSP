<html>
<head>
<title>Scripting Tag</title>
<body>
	<%! int sum(int a, int b){
		return a+b;
	}
	
	%>
	
	<%
	out.println("2 + 3 = " + sum(2,3));
	%>
</body>
</head>
</html>