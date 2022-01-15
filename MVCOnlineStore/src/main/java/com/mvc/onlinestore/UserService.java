package com.mvc.onlinestore;

public class UserService {
	
	public String register(OrderBean bean) {
		
		String message = bean.validate();
		if(!message.equals(Constants.SUCCESS)) {
			return message;
		}
		//perform business validation
		IUserDAO dao = DAOFactory.getDAO();
		if(dao.ifEmailExists(bean.getEmail())) {
			return "eamil id already exists";
		}
		else {
			//save the data
			String msg = dao.create(bean);
			if(msg.equals(Constants.SUCCESS)) {
				return Constants.SUCCESS;
			}
			else {
				return msg;
			}
		}
		
	}
	
}
