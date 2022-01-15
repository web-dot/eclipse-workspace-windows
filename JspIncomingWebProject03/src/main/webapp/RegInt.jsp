<jsp:useBean id="reg" class="com.uttara.test.RegBean" scope="request">
	<jsp:setProperty name="reg" property="*"/>
</jsp:useBean>
<jsp:forward page="register.do"/>


<!-- 
	RegBean bean = new RegBean();
	bean.setName(request.getParameter(name));
	bean.setPass(request.getParameter(pwd));
	bean.setRpass(request.getParameter(rpwd));
	
	request.setAttribute("reg", bean);
	
	RequestDispatcher rd = request.getRequestDispatcher("register.do");
	rd.forward(request, response);
 -->