package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class EligibleServlet
 */
public class EligibleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EligibleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get HttpSession
		HttpSession session = request.getSession(false);
		//get ServletContext
		ServletContext ctx = getServletContext();
		
		String age1 = request.getParameter("age");
		String age2 = "";
		String age3 = (String)ctx.getAttribute("age");
		
		String msg = "";
		if(session != null && session.getAttribute("age") != null) {
			age2 = (String)session.getAttribute("age");
		}
		if(Integer.parseInt(age1) > 21) {
			msg = "OOps You can not persue a career in Programming, You are too Old and Slow";
		}
		else {
			msg = "welcome";
		}
		
		PrintWriter pw = response.getWriter();
		
		pw.write("<html><body><h1> " + "ageByReq : " + age1 + " ageBySess : " + age2 + " ageByCtx : " + age3 + "<br/><br/> <a href='logout'>Logout</a></body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
