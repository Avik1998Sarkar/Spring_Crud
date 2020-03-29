<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>DELETE PAGE</h1>
	${msg}
	<form method="post" action="delete">
		<pre>
ID :     <input type="text" name="id"><br>
<input type="submit" name="submit">
	</pre>
	</form>
</body>
</html>