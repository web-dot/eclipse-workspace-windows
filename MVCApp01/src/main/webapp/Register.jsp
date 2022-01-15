<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Register</h1>
	<form action="RegInt.jsp" method="POST">
		Enter Name: <input	 type="text" name="uname"><br>
		Enter email: <input type="text" name="email"><br>
		Enter Password: <input type="password" name="pwd"><br>
		Repeat Password:<input type="password" name="rpwd"><br>
		<br>
		<input type="submit">
	</form>
	
	<b>${errorMsg}</b>
</body>
</html>