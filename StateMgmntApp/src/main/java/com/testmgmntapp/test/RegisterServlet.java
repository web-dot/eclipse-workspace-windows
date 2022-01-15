package com.testmgmntapp.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("In RegisterServlet Cons");
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
		System.out.println("In RegisterServlet doPost");
		
		//access inputs
		//apply validation
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String rpass = request.getParameter("rpass");
		
		System.out.println("email: " + email + " , " + " pass: " + pass);
		
		StringBuilder sb = new StringBuilder();
		if(email == null || email.trim().equals("")) {
			sb.append("enter correct email please<br/>");
		}
		if(pass == null || pass.trim().equals("")) {
			sb.append("Password field is empty<br/>");
		}
		else
			if(pass == null || !pass.trim().equals(rpass)) {
				sb.append("Paswords do not match<br/>");
			}
		PrintWriter pw = response.getWriter();
		String msg = sb.toString();
		if(!msg.equals("")) {
			//validation has failed
			String html = "<html><body><h2>Error</h2><b>" + msg + "</b><br/><a href='Register.html'>Try Again</a><body></html>";
			pw.write(html);
		}
		else {
			//validation has passed
			BufferedWriter bw = null;
			try {
				File f = new File(Constants.USERFILE); 
				System.out.println("f.exists = " + f.exists() + " path + " + f.getAbsolutePath());
				bw = new BufferedWriter(new FileWriter(Constants.USERFILE,true));
				bw.write(email + "=" + pass);
				bw.newLine();
			}catch(IOException e) {
				e.printStackTrace();
				pw.write("<html><body><h1>Error</h1><b> something complex happened" + e.getMessage() + "</b></body></html>");
				return;
			}finally {
				if(bw != null) {
					try {
						bw.close();
					}catch(IOException e) {
						e.printStackTrace();
					}
					pw.write("<html><body><h1>Registration Complete</h1><br/><a href='HomePage.html'>Home</a></body></html>");
				}
			}
		}
		
		
	}

}
