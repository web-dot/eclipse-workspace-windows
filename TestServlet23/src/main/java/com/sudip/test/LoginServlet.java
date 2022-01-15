package com.sudip.test;

import java.io.IOException;

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
		
		String name = request.getParameter("name");
		String email= request.getParameter("email");
		System.out.println(name + " " + email);
		
		//validate if name and email are not null
		//if validation succeeds
		
		//get Session object
		HttpSession session = request.getSession(true);
		session.setAttribute("email", email);
		session.setAttribute("name", name);
		System.out.println("session id = " +session.getId());
		System.out.println("request session id = " + request.getRequestedSessionId());
		
		//get Context object
		ServletContext ctx = request.getServletContext();
		ctx.setAttribute("email", email);
		
		//get RequestDispatcher object
		RequestDispatcher rd = ctx.getRequestDispatcher("/message");
		rd.forward(request, response);
		
		
	}

}
