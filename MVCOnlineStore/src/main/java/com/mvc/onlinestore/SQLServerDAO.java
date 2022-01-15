package com.mvc.onlinestore;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SQLServerDAO implements IUserDAO {

	@Override
	public String create(OrderBean bean) {
		Connection con = null;
		PreparedStatement ps_ins = null;
		try {
			con = JDBCHelper.getConnection();
			ps_ins = con.prepareStatement("INSERT INTO CUSTOMER(NAME, EMAIL, MOBILE, ADDRESSLINE1, ADDRESSLINE2, LANDMARK, PAYMENTMETHOD)VALUES(?,?,?,?,?,?,?)");
			ps_ins.setString(1, bean.getUname());
			ps_ins.setString(2, bean.getEmail());
			ps_ins.setString(3, bean.getMobile());
			ps_ins.setString(4, bean.getAddressline1());
			ps_ins.setString(5, bean.getAddressline2());
			ps_ins.setString(6, bean.getLandmark());
			ps_ins.setString(7,	bean.getPaymentmethod());
			
			ps_ins.execute();
			return Constants.SUCCESS;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return "something bad happened " + e.getMessage();
		}
		finally {
			JDBCHelper.close(ps_ins);
			JDBCHelper.close(con);
		}
	}

	@Override
	public boolean ifEmailExists(String email) {
		Connection con = null;
		PreparedStatement ps_sel = null;
		ResultSet rs = null;
		try {
			con = JDBCHelper.getConnection();
			ps_sel = con.prepareStatement("SELECT * FROM CUSTOMER WHERE EMAIL = ?");
			ps_sel.setString(1, email);
			ps_sel.execute();
			rs = ps_sel.getResultSet();
			
			if(rs.next()) {
				return true;
			}
			else {
				return false;
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			JDBCHelper.close(rs);
			JDBCHelper.close(ps_sel);
			JDBCHelper.close(con);
		}
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
