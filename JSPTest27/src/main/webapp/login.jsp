<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="Error.jsp"%>
<%@include file="head.html" %>
<body>
<%@include file="header.html" %>
  <section class="section-two">
    <form action='Hailstone.jsp' action='POST'>
    	Enter name:<input typ="text" name="name"/><br/>
    	Enter email:<input type="text" name="email"/><br/>
    	Enter Number:<input type="text" name ="number"/>
    	<input type="submit"/>
    </form>
  </section>
  <%@include file="footer.html" %>
</body>
</html>
