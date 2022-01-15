package com.mvc.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SqlServerDAO implements IUserDAO {

	@Override
	public String create(RegBean bean) {
		
		Connection con = null;
		PreparedStatement ps_ins = null;
		try {
			con = JDBCHelper.getConnection();
			ps_ins = con.prepareStatement("INSERT INTO USERS(NAME, EMAIL, PASS)VALUES(?,?,?)");
			
			ps_ins.setString(1, bean.getUname());
			ps_ins.setString(2, bean.getEmail());
			ps_ins.setString(3, bean.getPass());
			
			ps_ins.execute();
			
			return JDBCUtil.SUCCESS;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return "something bad happened" + e.getMessage();
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
			ps_sel = con.prepareStatement("SELECT * FROM USERS WHERE EMAIL = ?");
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
