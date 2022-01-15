package com.test;

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
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in LoginServlet doPost()");
		
		//get parameters from request
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String age = request.getParameter("age");

		//write parameters in HttpSession
		HttpSession session = request.getSession(true);
		session.setAttribute("age", age);
		
		//write parameters in ServletContext
		ServletContext ctx = getServletContext();
		ctx.setAttribute("age", age);
		
		//get RequestDispatcher
		RequestDispatcher rd = request.getRequestDispatcher("/eligible");
		//forward request response
		rd.forward(request, response);
		
		
		
		
		
		
		
		
	}

}
