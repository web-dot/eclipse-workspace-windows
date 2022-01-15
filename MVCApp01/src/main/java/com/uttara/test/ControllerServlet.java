package com.uttara.test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerServlet
 */
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in ControllerServlet doGet()");
		process(request, response);
	}
	
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in ControllerServlet process()");
		
		String uri = request.getRequestURI();
		System.out.println(uri);
		
		RequestDispatcher rd = null;
		Model md = new Model();
		if(uri.contains("/openRegisterView.do")) {
			
			rd = request.getRequestDispatcher("Register.jsp");
			rd.forward(request, response);
		}
		
		if(uri.contains("/openLoginView.do")) {
			
			rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}
		
		if(uri.contains("/register.do")) {
			/*
			 * 1)get the bean from request scope
			 * 2)invoke Model -> register(bean)
			 * 3)accept whether register succeeds/fails
			 * 4)if it succeeds, forward to Success.jsp
			 * else 
			 * 	forward to Register.jsp
			 * */
			UseBean bean = (UseBean)request.getAttribute("reg");
			System.out.println(bean);
			String result = md.register(bean);
			
			if(result.equals("SUCCESS")) {
				//registration successful
				request.setAttribute("successMsg", "registration successful");
				rd  = request.getRequestDispatcher("Success.jsp");
				rd.forward(request, response);
			}
			else {
				//registration failed
				request.setAttribute("errorMsg", result);
				rd = request.getRequestDispatcher("Register.jsp");
				rd.forward(request, response);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in ControllerServlet doPost()");
		process(request, response);
	}

}
