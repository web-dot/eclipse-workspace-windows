<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%>
<%@include file="head.html" %>
<body>
<%@include file="header.html" %>
  <section class="section-two">
  
  	<%
  		out.write("<h1>Hi an error has occurred " + exception.getMessage() + " </h1>");
  	%>
  </section>
  <%@include file="footer.html" %>
</body>
</html>