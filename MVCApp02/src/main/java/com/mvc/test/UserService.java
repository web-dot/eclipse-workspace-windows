package com.mvc.test;

public class UserService {
	
	public String register(RegBean bean) {
		
		System.out.println("UserService register() -> bean" + bean);
		
		String message = bean.validate();
		if(!message.equals(Constants.SUCCESS)) {
			return message;
		}
		
		//perform busines validation 
		IUserDAO dao = DAOFactory.getDAO();
		if(dao.ifEmailExists(bean.getEmail())) {
			return "email id already exists";
		}
		else {
			
			//save the data
			String msg = dao.create(bean);
			if(msg.equals(JDBCUtil.SUCCESS)) {
				return JDBCUtil.SUCCESS;
			}
			else {
				return msg;
			}
		}
	}
	public String authenticate(LoginBean bean) {
			
			System.out.println("UserService authenticate() -> bean" + bean);
			return Constants.SUCCESS;
			
		}
	
	
}
