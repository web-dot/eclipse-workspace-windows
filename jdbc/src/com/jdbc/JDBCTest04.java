package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest04 {

	
		public static void main(String[] args) {
			
			String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
			String URL = "jdbc:sqlserver://localhost:1433;databaseName = W3resources";
			String UNAME = "sa";
			String PASS= "123";
			
			
			/*
			MAIN OBJECTS
			
			[1]	DATA SOURCE OBJECT -> DriverManager can also be used
			
			[2]	Connection OBJECT
			
			[3]	Statement, PreparedStatement AND CallableStatement OBJECTS 
		
			[4]	ResultSet OBJECT
			*/
			
			
			
			try {
			Class.forName(DRIVER); //load the driver
			Connection c = DriverManager.getConnection(URL, UNAME, PASS); //getting connection object
			System.out.println("Connection successful");
			
			
			//Statement
			Statement s1 = c.createStatement();   						//getting Statement object
			String sql1 = "SELECT * FROM SALESMAN";
			ResultSet rs1 = s1.executeQuery(sql1); 						//getting resultset object
			
			while(rs1.next()) {
				String salesman_id = rs1.getString(1);
				String salesman_name = rs1.getString(2);
				System.out.println(salesman_id + " : " + salesman_name);
			}
			
			//PreparedStatement
			String sql2 = "SELECT * FROM SALESMAN WHERE SALESMAN_ID = ? AND NAME = ?";
			PreparedStatement ps1 = c.prepareStatement(sql2);
			ps1.setString(1, "5001");
			ps1.setString(2, "james hoog");
			
			ResultSet rs2 = ps1.executeQuery();
			
			while(rs2.next()) {
				String city = rs2.getString("city");
				String commission = rs2.getString("commission");
				System.out.println(city + " : " + commission);
			}
			
			}
			catch(SQLException  | ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		}
}
