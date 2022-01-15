package com.mvc.onlinestore;

public class DAOFactory {
	public static IUserDAO getDAO() {
		if(Constants.DAOCHOICE == 1) {
			return new SQLServerDAO();
		}
		if(Constants.DAOCHOICE == 2) {
			return new UserFileDAO();
		}
		return null;
	}
}
