<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>DISPLAY PAGE</h1>
	<table border="1" style="text-align: center; width: 600px">
		<thead>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>EMAIL</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="user">
				<tr>
					<td>${user.id}</td>
					<td>${user.name}</td>
					<td>${user.email}</td>
					<td><a
						href="update?id=${user.id}&name=${user.name}&email=${user.email}">Update</a></td>
					<td><a href="delete?id=${user.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<pre>
WANT TO INSERT MORE ?	<a href="insert"><button> &gt;&gt; CLICK HERE &lt;&lt;</button></a>

WANT TO GO HOME PAGE ?	<a href="/"><button> &gt;&gt; CLICK HERE &lt;&lt;</button></a>
	</pre>
</body>
</html>