package com.uttara.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Model {
	
	public String register(UseBean bean) {
		
		/*
		 * 1) input validate the bean, if it fails, return msg to be displayed to user
		 * 2) businss validate by conn to db, if it fails return msg to be diplayed to user
		 * 3) apply business logic -> store bean data into table
		 * 4) return success msg
		 * */
		
		String msg = bean.validate();
		if(msg.equals("SUCCESS")) {
			//input validation successful
			
			//apply business validation
			
			Connection con = null;
			PreparedStatement ps_sql = null, ps_ins = null;
			ResultSet rs = null;
			
			try {
				
				con = JDBCHelper.getConnection();
				if(con == null) {
					return "Could not connect to DB!! Contact Admin";
				}
				else {
					ps_sql = con.prepareStatement("SELECT * FROM REGISTER WHERE EMAIL = ? AND PASS = ?");
					ps_sql.setString(1, bean.getEmail());
					ps_sql.setString(2, bean.getPwd());
					ps_sql.execute();
					rs = ps_sql.getResultSet();
					if(rs.next()) {
						return("This email already exists");
					}
					else {
						//business validation succeeded
						//store data
						ps_ins = con.prepareStatement("INSERT INTO REGISTER(U_NAME, EMAIL, PASS) VALUES(?,?,?)");
						ps_ins.setString(1, bean.getUname());
						ps_ins.setString(2, bean.getEmail());
						ps_ins.setString(3, bean.getPwd());
						ps_ins.execute();
						return "SUCCESS";
					}
				}
			}catch(SQLException e) {
				e.printStackTrace();
				return "Something bad happened msg = " + e.getMessage();
			}
		}
		else {
			return msg;
		}
	}
}
