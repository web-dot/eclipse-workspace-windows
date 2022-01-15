package com.sudip.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MessageServlet
 */
public class MessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MessageServlet() {
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
		
		//---------------RETRIEVE DATA FROM REQUEST-----DATA WILL EXIST ONLY TILL THE REQUEST OBJECT EXISTS--------------------------
		String reqData = request.getParameter("email");
		System.out.println(reqData);
		//------------------RETRIEVE DATA FROM SESSION--DATA WILL EXIST TILL THE SESSION EXISTS---------------------
		
		//check if session is not null and session attribute is not null
		//if session exist retrieve from session
		HttpSession session = request.getSession(false);
		String semail = (String)session.getAttribute("email");
		System.out.println(semail);
		
		//-----------------RETRIEVE DATA FROM SERVLET CONTEXT---DATA WILL EXIST AS LONG AS THE APPLICATION IS RUNNING------------
		ServletContext ctx = request.getServletContext();
		String cemail = (String)ctx.getAttribute("email");
		System.out.println(cemail);
		PrintWriter pw = response.getWriter();
		pw.write("<html><body><h1>Welcome " + reqData + " </h1><br/><a href='logout'>Click to Logout</a><br/><a href='sky'>Click to see Sky</a></body></html>");
		
	}

}
