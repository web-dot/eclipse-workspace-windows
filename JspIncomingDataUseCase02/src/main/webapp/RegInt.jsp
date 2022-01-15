<jsp:useBean id="reg" class="com.uttara.test.RegBean" scope="request">
	<jsp:setProperty name="reg" property="*"/>
</jsp:useBean>
<jsp:forward page="register.do"/>


<!-- 

	RegBean bean = new RegBean();
	bean.setUname(request.getParameter("name"));
	bean.setEmail(request.getParameter("email"));
	bean.setPwd(request.getParameter("pwd"));
	bean.setRpwd(request.getParameter("rpwd"));
	
	request.setAttribute("reg", bean);
	
	RequestDispatcher rd = request.getRequestDispatcher("register.do");
	rd.forward(request, response);
 -->