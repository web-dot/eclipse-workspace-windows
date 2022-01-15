package com.testmgmntapp.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ChangePassword
 */
public class ChangePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangePassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get existing session for client
		//if session does not exist scold
		//if session exist, open the file validate if old pass is correct and then update the file contents to reflect new pass change for email id
		//
		
		HttpSession s = request.getSession(false);
		PrintWriter pw = response.getWriter();
		if(s == null) {
			pw.write("<html><body><h1>Please Login to change password</h1></body></html>");
		}
		else {
			String email = (String)s.getAttribute(Constants.USER);
			//validate if email is correct by looking into file and then update
			String npass = request.getParameter("npass");
			BufferedReader br = null;
			BufferedWriter bw = null;
			try {
				br = new BufferedReader(new FileReader(Constants.USERFILE));
				Map<String, String> map = new HashMap<String, String>();
				String str;
				while((str = br.readLine()) != null) {
					String[] sa = str.split("=");
					map.put(sa[0], sa[1]);
				}
				for(String key : map.keySet()) {
					String value = map.get(key);
					if(key.equals(email)) {
						map.put(email, npass);
					}
				}
				br.close();
				br = null;
				bw = new BufferedWriter(new FileWriter(Constants.USERFILE));
				for(String key : map.keySet()) {
					String value = map.get(key);
					bw.write(key + "=" + value);
					bw.newLine();
				}
				bw.flush();
			}catch(IOException e) {
				e.printStackTrace();
				}finally {
					if(bw != null) {
					bw.close();	
					}
					if(br != null) {
						br.close();
					}
				}
			pw.write("<html><body><h1>Password Changed successfully</h1><br/><a href='HomePage.html'>Home</a></body></html>");
		}
	}

}
