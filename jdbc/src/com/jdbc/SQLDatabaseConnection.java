package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLDatabaseConnection {
    // Connect to your database.
    // Replace server name, username, and password with your credentials
    public static void main(String[] args) {
    	
    	String url = "jdbc:sqlserver://localhost:1433;databaseName=test";
    	String uid = "sa";
    	String pass = "123";
    	String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    	
    	ResultSet resultSet = null;

        try  {
        	
        	Class.forName(DRIVER);
            Connection con = DriverManager.getConnection(url, uid, pass);
            Statement statement = con.createStatement();
        	System.out.println("Connection Established");
        	/*
        	String selectSql = "SELECT * from salesman";
        	resultSet = statement.executeQuery(selectSql);
        	
        	
        	while(resultSet.next()) {
        	System.out.println(resultSet.getString("brand_name"));
        	}
        	*/
        }
        // Handle any errors that may have occurred.
        catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
