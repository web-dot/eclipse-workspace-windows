<jsp:useBean id="reg" class="com.mvc.test.RegBean" scope="request">
	<jsp:setProperty name="reg" property="*"/>
</jsp:useBean>
<jsp:forward page="register.do"/>

<!-- 
	RegBean bean = new RegBean();
	bean.setParameter(request.getAttribute("uname"));
	bean.setParameter(request.getAttribute("email"));
	bean.setParameter(request.getAttribute("pass"));
	bean.setParameter(request.getAttribute("rpass"));
	
	RequestDispathcer rd = request.getRequestDispatcher("/register.do");
	rd.forward(request, response);
 -->