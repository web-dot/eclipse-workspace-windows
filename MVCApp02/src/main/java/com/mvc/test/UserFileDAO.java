package com.mvc.test;

import java.util.List;

public class UserFileDAO implements IUserDAO {

	@Override
	public String create(RegBean bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean ifEmailExists(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<RegBean> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RegBean getUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean authenticate(LoginBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

}
