<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*, java.lang.*" errorPage="Error.jsp"%>
<%@include file="head.html" %>
<body>
<%@include file="header.html" %>
  <section class="section-two">
	
	
	
	<%
		String question = request.getParameter("question");
		String answer = request.getParameter("answer");
		String askedQuestion = request.getParameter("askedquestion");
		
		String result = question + " : " + answer;
		out.write("<h1> " + result +  " </h1>");
		
	%>
  </section>
  <%@include file="footer.html" %>
</body>
</html>