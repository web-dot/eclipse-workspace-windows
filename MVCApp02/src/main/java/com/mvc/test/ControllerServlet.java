package com.mvc.test;

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
        System.out.println("In ControllerServlet Constructor");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In ControllerServlet doGet()");
		process(request, response);
	}
	
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In ControllerServlet process()");
		String uri = request.getRequestURI();
		RequestDispatcher rd;
		String message;
		UserService service = new UserService();
		if(uri.contains("/login.do")) {
			System.out.println("in Controller process -> /login.do");
			LoginBean bean = (LoginBean)request.getAttribute("log");
			message = service.authenticate(bean);
			if(message.equals(Constants.SUCCESS)) {
				String msg = "Login successful";
				request.setAttribute("message", msg);
				rd = request.getRequestDispatcher("Menu.jsp");
				rd.forward(request, response);
			}
			else {
				request.setAttribute("errorMessage", message);
				rd = request.getRequestDispatcher("Login.jsp");
				rd.forward(request, response);
			}
		}
		if(uri.contains("/register.do")) {
			RegBean bean = (RegBean)request.getAttribute("reg");
			message = service.register(bean);
			if(message.equals(Constants.SUCCESS)) {
				String msg = "Registration Successful";
				request.setAttribute("message", msg);
				rd = request.getRequestDispatcher("Message.jsp");
				rd.forward(request, response);
			}
			else {
				request.setAttribute("errorMessage", message);
				rd = request.getRequestDispatcher("Register.jsp");
				rd.forward(request, response);
			}
		}
		if(uri.contains("/openRegisterView.do")) {
			rd = request.getRequestDispatcher("Register.jsp");
			rd.forward(request, response);
		}
		if(uri.contains("/openLoginView.do")) {
			rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In ControllerServlet doPost()");
		process(request, response);
	}

}
