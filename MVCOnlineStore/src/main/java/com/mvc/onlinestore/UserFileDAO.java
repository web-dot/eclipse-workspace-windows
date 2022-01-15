package com.mvc.onlinestore;

import java.util.List;

public class UserFileDAO implements IUserDAO {

	@Override
	public String create(OrderBean bean) {
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
	public List<OrderBean> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderBean getUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean authenticate(OrderBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

}
