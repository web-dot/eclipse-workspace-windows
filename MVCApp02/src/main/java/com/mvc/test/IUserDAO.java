package com.mvc.test;

import java.util.List;

public interface IUserDAO {
	
	public String create(RegBean bean);
	public boolean ifEmailExists(String email);
	public boolean delete(String email);
	public List<RegBean> getUsers();
	public RegBean getUser(String email);
	public boolean authenticate(LoginBean bean);
}
