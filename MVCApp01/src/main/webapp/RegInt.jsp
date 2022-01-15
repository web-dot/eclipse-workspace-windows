<jsp:useBean id="reg" class="com.uttara.test.UseBean" scope="request">
	<jsp:setProperty name="reg" property="*"/>
</jsp:useBean>
<jsp:forward page="register.do"/>


<!-- 
	UseBean bean = new UseBean();
	bean.setUname(request.getParameter("uname"));
	bean.setEmail(request.getParameter("email"));
	bean.setPwd(request.getParameter("pwd"));
	bean.setRpwd(request.getParameter("rpwd"));
	
	request.setAttribute("reg", bean);
	RequestDispatcher rd = request.getRequestDispather("register.do");
	rd.forward(request, response);
 -->