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
	<h1>INSERT PAGE</h1>
	${msg}
	<form method="post" action="insert">
	<pre>
ID :     <input type="text" name="id"><br>
NAME :   <input type="text" name="name"><br>
EMAIL :  <input type="text" name="email"><br>
<input type="submit" name="submit" value="INSERT DATA">
<input type="reset" name="reset" value="RESET FORM">
	</pre>
	</form>
<pre>
WANT TO SEE ALL DATA ?	 <a href="display"><button> &gt;&gt; CLICK HERE &lt;&lt;</button></a>

WANT TO GO HOME PAGE ?	 <a href="/"><button> &gt;&gt; CLICK HERE &lt;&lt;</button></a>
</pre>
</body>
</html>