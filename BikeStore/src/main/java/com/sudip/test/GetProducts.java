package com.sudip.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetProducts
 */
public class GetProducts extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public GetProducts() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in GetProducts doGet()");
		String brand = request.getParameter("brand");
		String category = request.getParameter("category");
		
		String brand_id = "0";
		String category_id = "0";
		if(brand.equals("Electra")) {
			brand_id = "1";
			System.out.println(brand_id);
			}
		if(brand.equals("Haro")) {
			brand_id = "2";
			System.out.println(brand_id);
		}
		if(category.equals("Mountain_Bike")) {
			category_id = "6";
		}
		if(category.equals("Road Bike")) {
			category_id = "7";
		}
		
		
		//connection to ddatabase sing jdbc
		
		//[1] -------------Driver specific URL-------------------
		String url = "jdbc:sqlserver://localhost:1433;databaseName=BikeStores";
		//[2]----------------Driver Class----------------------------
		String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		//[3]-----------------uid, pass--------------------------------
    	String userid = "sa";
    	String password = "123";
    	try {
    		System.out.println(brand);
    		System.out.println(category);
    		Class.forName(DRIVER);
    		Connection connection = DriverManager.getConnection(url, userid, password);
    		System.out.println("connection successful");
    		System.out.println("brand_id = " + brand_id);
    		System.out.println("category_idpo = " + category_id);
    		String sql1 = "select product_name, list_price from production.products where brand_id = ? and category_id = ?";
    		PreparedStatement ps1 = connection.prepareStatement(sql1);
    		ps1.setString(1, brand_id);
    		ps1.setString(2, category_id);
    		ps1.execute();
    		ResultSet resultSet1 = ps1.getResultSet();
    		while(resultSet1.next()) {
    			System.out.println(resultSet1.getString("product_name") + " " + resultSet1.getString("list_price"));
    		}
    	}catch(SQLException | ClassNotFoundException e) {
    		e.printStackTrace();
    	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
