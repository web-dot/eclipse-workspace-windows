package com.mvc.test;

public class DAOFactory {
	public static IUserDAO getDAO() {
		if(JDBCUtil.DAOCHOICE == 1) {
			return new SqlServerDAO();
		}
		if(JDBCUtil.DAOCHOICE == 2) {
			return new UserFileDAO();
		}
		return null;
	}
}
