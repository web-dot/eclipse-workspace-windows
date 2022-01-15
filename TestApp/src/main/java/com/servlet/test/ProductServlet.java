package com.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.tools.javac.resources.ct;

/**
 * Servlet implementation class ProductServlet
 */
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
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
		System.out.println("in productservlet doPost");
		
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		StringBuilder sb = new StringBuilder();
		if(email == null || email.trim().equals("")) {
			sb.append("Email field is empty, enter again");
		}
		if(pass == null || pass.trim().equals("")) {
			sb.append("Password field is empty, Kindly re-enter");
		}
		
		String msg = sb.toString();
		System.out.println(msg);
		PrintWriter pw = response.getWriter();
		if(msg.equals("")) {
			//validation passed
			
			//create session object
			HttpSession session = request.getSession(true);
			session.setAttribute(Constants.USER, email);
			ServletConfig con = getServletConfig();
			ServletContext ctx = con.getServletContext();
			ctx.setAttribute(Constants.USER, email);
			RequestDispatcher rd = ctx.getRequestDispatcher("/session");
			rd.include(request, response);
			pw.write("<html<body>Login sucessful<h1></h1></body></html>");
			
		}
		else {
			//validation failed
			pw.write("<html<body>Kindly enter proper details<h1></h1></body></html>");
		}
	}

}
