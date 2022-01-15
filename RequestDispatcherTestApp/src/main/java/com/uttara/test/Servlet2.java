package com.uttara.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        System.out.println("servlet2 cons");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doGet() of S2");
		
		String reqData = "";
		String sessData = "";
		String ctxData = "";
		
		HttpSession session = request.getSession(false);
		ServletContext ctx = getServletContext();
		
		//always do null check before getAttribute 
		if(request.getAttribute("reqData") != null) {
			reqData = (String)request.getAttribute("reqData");
		}
		if(session != null && session.getAttribute("sessData") != null) {
			sessData = (String)session.getAttribute("sessData");
		}
		if(ctx.getAttribute("ctxData") != null) {
			ctxData = (String)ctx.getAttribute("ctxData");
		}
		
		
		PrintWriter pw = response.getWriter();
		pw.write("<html><body><h1>response from S2 : sessionData =" + sessData + " contextData = " + ctxData + " reqData = " + reqData +   " </h1></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
