<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Login</h1>
	<form action="LoginInt.jsp" method="POST">
		Enter Email:<input type="text" name="email"><br>
		Enter password: <input type="password" name="pass"><br>
		<br>
		<input type="submit">
	</form>
	${errorMessage} 
</body>
</html>