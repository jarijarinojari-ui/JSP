<html>
<head>
<title>Scripting tag</title>
</head>
<body>
	<%
		for (int i =0; i <= 10; i++){
			if( 0 == i % 2){
				out.println(i + "<br>");
			}
		}
	%>
</body>
</html>