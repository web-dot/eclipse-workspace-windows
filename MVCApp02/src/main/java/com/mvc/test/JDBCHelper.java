package com.mvc.test;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;


public class JDBCHelper {
	public static Connection getConnection() {
		try {
			Class.forName(JDBCUtil.DRIVER);
			Connection c = DriverManager.getConnection(JDBCUtil.URL, JDBCUtil.UID, JDBCUtil.PASS);
			System.out.println("Connection succeeded");
			return c;
		}
		catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
	public static void close(ResultSet x) {
		if(x != null) {
			try {
				x.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void close(Statement x) {
		if(x != null) {
			try {
				x.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void close(Connection x) {
		if(x != null) {
			try {
				x.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
