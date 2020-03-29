<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:out value="${msg}" />
	<form action="UserController" method="get">
		ID : <input type="text" name="id"> 
		NAME : <input type="text" name="name"> 
		EMAIL : <input type="text" name="email">
		<input type="submit" name="submit" value="INSERT"> 
		<input type="hidden" name="action" value="Insert">
	</form>
	<a href="index.jsp">GO TO INDEX</a>
</body>
</html>