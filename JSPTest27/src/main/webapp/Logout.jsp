<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="Error.jsp"%>
<%@include file="head.html" %>
<body>
<%@include file="header.html" %>
  <section class="section-two">
    	<%
    		session.removeAttribute("name");
    		session.removeAttribute("email");
    		session.removeAttribute("result");
    		
    		session.invalidate();
    		
    		out.write("<h1>Hi you have successfully logged out</h1>");
    	%>
    	<a href="login.jsp"><button>Login again</button></a>
  </section>
  <%@include file="footer.html" %>
</body>
</html>
