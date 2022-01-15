<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*, java.lang.*" errorPage="Error.jsp"%>
<%@include file="head.html" %>
<body>
<%@include file="header.html" %>
  <section class="section-two">
	<%
		//pull data from request
		String name = (String)request.getAttribute("name");
		String email = (String)request.getAttribute("email");
		String result = (String)request.getAttribute("result");

		//pull data from session
		String name2 = (String)session.getAttribute("name");
		String email2 = (String)session.getAttribute("email");
		String result2 = (String)session.getAttribute("result");
		
		//pull data from context
		ServletContext ctx = getServletContext();
		String name3 = (String)ctx.getAttribute("name");
		String email3 = (String)ctx.getAttribute("eamil");
		String result3 = (String)ctx.getAttribute("result");
		
		//pulling data using pageContext
		String name4 = (String)pageContext.getAttribute("name");
		String email4 = (String)pageContext.getAttribute("email");
		String result4 = (String)pageContext.getAttribute("result");
		
		out.write("<html><body><h1>Hi " + " " + email + " " + name + " " + " your hailstone is " + result + " " + "</h1></body></html>");
		
	%>
	<a href="login.jsp"><button>Check Hailstone Again</button></a><br/>
	<br>
	<a href="Logout.jsp"><button>Logout</button></a>
  </section>
  <%@include file="footer.html" %>
</body>
</html>