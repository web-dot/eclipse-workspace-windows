<jsp:useBean id="log" class="com.mvc.test.LoginBean" scope="request">
	<jsp:setProperty name="log" property="*"/>
</jsp:useBean>
<jsp:forward page="login.do"/>


<!-- 

	LoginBean bean = new LoginBean();
	bean.setParameter(bean.getAttribute("email"));
	bean.setParameter(bean.getAttribute("pass"));
	
	RequestDispatcher rd = request.getRequestDispatcher("/login.do");
	rd.forward(request, response);
	
 -->