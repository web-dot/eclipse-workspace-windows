<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="javax.servlet.http.*, javax.servlet.*" errorPage="Error.jsp"%>
    <%@include file="Header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	
  <header>
    <div class="main">
     <div class="logo">
       <img src="logo.png">
     </div>
      <ul>
        <li class="active"><a href="#">Home</a></li>
        <li><a href="#">Services</a></li>
        <li><a href="#">Gallary</a></li>
        <li><a href="#">About</a></li>
        <li><a href="Contact.html">Contact</a></li>
      </ul>
    </div> 
    <div class="date">
      <h1> 
      
      	<%= new java.util.Date() %>
    
      	
      
      </h1>
    </div>
    <div class="title">
      <h1>WEB DEV</h1>
    </div>
    <div class="button">
      <a href="#" class="btn">WATCH VIDEO</a>
      <a href="#" class="btn">LEARN MORE</a>
    </div>
  </header>
  <%@include file="Footer.jsp" %>
</body>
</html>