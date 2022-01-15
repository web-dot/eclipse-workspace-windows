package com.uttara.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet01
 */
public class Servlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet01() {
        super();
        System.out.println("servlet1 cons");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doGet() of S1");
		
		//[1]get hold of RequestDispatcher and point him to '/two'
		//[2]store data in 3 scopes
		//[3]forward the control
		
		HttpSession session = request.getSession();
		ServletContext ctx = getServletContext();
		
		//storing data in scopes
		request.setAttribute("reqData", "Data from request");
		session.setAttribute("sessData", "Data from session");
		ctx.setAttribute("ctxData", "Data from ctx");
		

		RequestDispatcher rd = request.getRequestDispatcher("/two"); //forward or include resources in a servlet response
		rd.forward(request, response);
		System.out.println("S1's req,res forwarded to S2");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
