package com.mvc.onlinestore;

import java.util.List;

public interface IUserDAO {
	public String create(OrderBean bean);
	public boolean ifEmailExists(String email);
	public boolean delete(String email);
	public List<OrderBean> getUsers();
	public OrderBean getUser(String email);
	public boolean authenticate(OrderBean bean);
}
