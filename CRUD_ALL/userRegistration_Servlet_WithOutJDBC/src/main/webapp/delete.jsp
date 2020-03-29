<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="UserController" method="get">
	ID : <input type="text" name="id">
	<input type="submit" name="submit">
	<input type="hidden" name="action" value="Delete">
</form>
</body>
</html>