package com.uttara.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DateServlet
 */
public class DateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
	
    public DateServlet() {
        // TODO Auto-generated constructor stub
    	System.out.println("In DateServlet no args cons");    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In DateServlet doGet");
		//apply business logic create date dime
		//generate html dynamic res
		//write res to resp
		String[] quotes = {"abcdef", "akmkoakdk", "asdkaasld", "dsklsdfkkdkf", "smfamfkmdlskfm"};
		Date dt = new Date();
		String html = "<html><body><h1>Date and Time</h1><b>Todays date and time is " + dt.toString()+" </b><br/> Quote of day : " + quotes[(int)(Math.random() * quotes.length)]+"</body></html>";
		//System.out.println(html);
		PrintWriter pw = response.getWriter();
		pw.write(html);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
