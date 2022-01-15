<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*, java.lang.*" errorPage="Error.jsp"%>
<%@include file="head.html" %>
<body>
<%@include file="header.html" %>
  <section class="section-two">
	
	<%!
	public String getHailStone(int n){
		List<Integer> list = new ArrayList<Integer>();
			while(n != 1){
				list.add(n);
			if(n % 2 == 0){
				n = n / 2;
				}
				else{
					n = 3 * n + 1;
				}
			}
			list.add(n);
			return list.toString();
		}
	%>
	
	<%
	if(session == null){
		out.write("<h1>Hi your session has expired, kindly login again to check hailstone</h1>");
	}
	else{
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String num = request.getParameter("number");
		int n = Integer.parseInt(num);
		String result = getHailStone(n);
		
		request.setAttribute("name", name);
		request.setAttribute("email", email);
		request.setAttribute("result", result);
		
		//accessing JSP IMPLICIT OBJECTS
		
		//set attribute in session
		session.setAttribute("name", name);
		session.setAttribute("email", email);
		session.setAttribute("result", result);
		
		//set attribute in servlet context
		ServletContext ctx = getServletContext();
		ctx.setAttribute("name", name);
		ctx.setAttribute("email", email);
		ctx.setAttribute("result", result);
		
		
		
		RequestDispatcher rd = ctx.getRequestDispatcher("/Result.jsp");
		rd.forward(request, response);
	}
		
	%>
  </section>
  <%@include file="footer.html" %>
</body>
</html>