<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="Error.jsp" import="javax.servlet.http.*, javax.servlet.*" isErrorPage="false"%>
<!DOCTYPE html> 
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		if(name == null || name.equals("")){
			out.print("Kindly fill up your name");
		}
		if(age == null){
			out.print("kindly fill up your age");
		}
		else{
			try{
				out.print("Hi " + name + " your age is " + age);
			}catch(NumberFormatException e){
				e.printStackTrace();
			}
		}
	%>
</body>
</html>