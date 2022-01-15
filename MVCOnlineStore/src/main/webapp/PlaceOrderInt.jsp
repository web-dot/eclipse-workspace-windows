<jsp:useBean id="ord" class="com.mvc.onlinestore.OrderBean" scope="request">
	<jsp:setProperty name="ord" property="*"/>
</jsp:useBean>
<jsp:forward page="PlaceOrder.do"/>