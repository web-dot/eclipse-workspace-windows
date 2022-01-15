package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCTest05 {

	public static void main(String[] args) {
		
		
		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String url = "jdbc:sqlserver://localhost:1433;databaseName = APP_USERS";
		String uid = "sa";
		String pass = "123";

		try {
			Class.forName(driver);
			Connection c = DriverManager.getConnection(url, uid, pass);
			System.out.println("connection done");
		}
		catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
