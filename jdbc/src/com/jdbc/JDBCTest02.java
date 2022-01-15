package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
public class JDBCTest02 {
	public static void main(String[] args) {
		
		
		//---------------JDBC driver---------------
		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		
		//---------------Database spqcific URL-----
		String Url = "jdbc:sqlserver://localhost:1433;databaseName = BikeStores";
		
		//---------------user id and password----------
		String userid = "sa";
		String password = "123";
		
		try {
		Class.forName(driver);
		Connection c = DriverManager.getConnection(Url, userid, password);
		System.out.println("Connection Sucessful");
		String sql = "select product_name from production.products where brand_id = 2";
		Statement st = c.createStatement();
		ResultSet rs1 = st.executeQuery(sql);
		String s= "";
		while(rs1.next()) {
			s = rs1.getString("product_name");
			System.out.println(s);
		}
		}catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
