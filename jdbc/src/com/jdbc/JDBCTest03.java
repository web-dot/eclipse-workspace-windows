package com.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
public class JDBCTest03 {

	public static void main(String[] args) {
		
		//-----------connection URL---------------
		String url = "jdbc:sqlserver://localhost:1433;databaseName = BikeStores";
		//----------Driver class-----------------
		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";	
		//-----------userid, password-------------
		String userid = "sa";
		String password = "123";
		try {
			//Class.forName(driver); //not required post version 4
			
			//DriverManager connects to database -> returns Connection object
			Connection c = DriverManager.getConnection(url, userid, password);
			System.out.println("Connection Successful");
			
			//Statement
			//Connection object creates Statement object
			Statement s = c.createStatement();
			
			//SQL query string
			String sql1 = "update production.products set product_name = 'Trek 210 - 2017' where product_name = 'Trek 826 - 2016' ";
			String sql2 = "select product_name, brand_id from production.products where product_id = 1";
			
			
			System.out.println("---------------------execute()---------------------------------------------");
			//execute() -> executes the given SQL statement -> indicates the form of first result//
			
			boolean b1 = s.execute(sql1); //returns false if there are no results
			boolean b2 = s.execute(sql2); //returns true if first result is a ResultSet object
			System.out.println(b1);
			System.out.println(b2);
			ResultSet rs1 = s.getResultSet(); //use getResultSet to retrieve the results
			while(rs1.next()) {
				String product_name = rs1.getString(1);
				System.out.println(product_name);
			}
			
			
			System.out.println("---------------------executeQuery()---------------------------------------------");
			//executeQuery -> executes the given SQL statement, typically a static SELECT statement//
			//cannot be called on PreparedStatement or CallableStatement//
			
			String sql3 = "select category_name, product_name from production.products join production.categories on "
					+ "production.products.category_id = production.categories.category_id where category_name = 'Mountain Bikes' and"
					+ " list_price < 450";
			ResultSet rs2 = s.executeQuery(sql3);
			while(rs2.next()) {
				String product_name = rs2.getString(2);
				String list_price = rs2.getString(1);
				System.out.println(list_price + " : " + product_name);
			}
			
			
			System.out.println("---------------------executeUpdate()---------------------------------------------");
			//executeUpdate -> executes the given SQL statement which may be INSERT, UPDATE, or DELETE or DDL statements//
			
			String sql4 = "update production.products set product_name = 'Trek 255 - 2015' where product_name = 'Trek 210 - 2017'";
			int val = s.executeUpdate(sql4);
			System.out.println(val);
			
			System.out.println("---------------------PreparedStatement---------------------------------------------");
			//PreparedStatement -> used for pre-compiling SQL statements that might include input parameters
			//SQL statement is precomiled and stored in a PreparedStatement Object. This object can then be used to efficiently execute this statement multiple times
			String sql5 = "select category_name, product_name from production.products join production.categories on "
					+ "production.products.category_id = production.categories.category_id where category_name = ? and"
					+ " list_price < ?";;
			PreparedStatement ps = c.prepareStatement(sql5); //
			ps.setString(1, "Mountain Bikes");
			ps.setInt(2, 400);
			ResultSet rs = ps.executeQuery();
			
			//ps.execute();
			//ResultSet rs = ps.getResultSet();
			
			while(rs.next()) {
				String category_name = rs.getString("category_name");
				String product_name = rs.getString("product_name");
				System.out.println(category_name + " : " + product_name);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}








