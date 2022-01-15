package com.sudip.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SignUpServlet
 */
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
        super();
        System.out.println("in SignUpServlet no argument constructor");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in SignUPServlet doGet()");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String pass = request.getParameter("pass");
		StringBuilder sb = new StringBuilder();
		if(name == null || name.equals("")) {
			sb.append("name field is empty kindly enter name");
		}
		if(age == null || age.equals("")) {
			sb.append("age field is empty kindly enter age");
		}
		if(pass == null || pass.equals("")) {
			sb.append("password field is empty kindly enter password");
		}
		String msg = sb.toString();
		PrintWriter pw = response.getWriter();
		pw.write("<html><body><h1> " + msg + " </h1></body></html>");
		if(msg.equals("")) {
			//validation successful
			pw.write("<html><body><h1> Welcome " + name + " </h1><br/></body></html>");
			pw.write("<html><body><a href='LogOutServlet'>LogOut</a></html></body>");
			
			//write parameters in HttpSession
			HttpSession reqSess = request.getSession();
			reqSess.setAttribute("name", name);
			ServletContext ctx = getServletContext();
			ctx.setAttribute("name", name);
			//RequestDispatcher rd = ctx.getRequestDispatcher("/LogOutServlet");
			//rd.forward(request, response);
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
