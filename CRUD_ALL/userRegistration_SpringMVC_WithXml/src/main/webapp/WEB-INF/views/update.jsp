<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>UPDATE PAGE</h1>
	${msg}
	<form method="post" action="update">
	<pre>
ID :     <input type="text" name="id" value="${id}" readonly="readonly"><br>
NAME :   <input type="text" name="name" value="${name}"><br>
EMAIL :  <input type="text" name="email" value="${email}"><br>
<input type="submit" name="submit" value="UPDATE HERE">
<input type="reset" name="submit" value="RESET FORM">
	</pre>
	</form>
	<pre>
WANT TO SEE ALL DATA ?		<a href="display"><button> &gt;&gt; CLICK HERE &lt;&lt;</button></a>

WANT TO GO HOME PAGE ?		<a href="/"><button> &gt;&gt; CLICK HERE &lt;&lt;</button></a>

WANT TO GO INSERT DATA ?	<a href="insert"><button> &gt;&gt; CLICK HERE &lt;&lt;</button></a>
	</pre>
</body>
</html>