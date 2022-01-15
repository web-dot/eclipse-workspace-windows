package com.testmgmntapp.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

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
       // System.out.println("Inside LoginServlet cons");
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
		// TODO Auto-generated method stub
		//System.out.println("Inside LoginServlet doPost()");
		//access user input
		//validate
		//create session
		//show success message
		//if invalid show error
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		System.out.println("email: " + email + " , " + " pass: " + pass);
		StringBuilder sb = new StringBuilder();
		if(email == null || email.trim().equals("")) {
			sb.append("email field is empty<br/>");
		}
		if(pass == null || pass.trim().equals("")) {
			sb.append("password field is empty<br/>");
		}
		PrintWriter pw = response.getWriter();
		String msg = sb.toString();
		if(!msg.equals("")) {
			//validation has failed
			pw.write("<html><body><h1>Error</h1><b>" + msg + "</b></body></html>");
		}
		else {
			//validation succeeded
			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(Constants.USERFILE));
				String s;
				while((s = br.readLine()) != null) {
					String[] a = s.split("=");
					if(email.equals(a[0]) && pass.equals(a[1])) {
						//valid user
						//create session
						HttpSession session = request.getSession(true);
						session.setAttribute(Constants.USER, email);
						
						pw.write("<html><body><h1>Welcome " + email + "</h1><a href='logout'>Click to logout</a><br/><a href='ChangePassword.html'>change password</a></body></html>");
						return;
					}
					
				}
				pw.write("<html><body><h1>Email or Password is wrong, Try Logging in again</h1><br/><a href='Login.html'>Login Page</a></body></html>");
			}catch(IOException e) {
				e.printStackTrace();
				pw.write("<html><body><h1>Error</h1><b>" + msg + "</b></body></html>");
				return;
				}finally {
					if(br != null) {
						br.close();
					}
				}
		}
		
	}

}
