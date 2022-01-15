package com.mvc.test;

import java.io.Serializable;

public class RegBean implements Serializable{
	
	String uname, email, pass, rpass;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		System.out.println("inside RegBean setUname()");
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("inside RegBean setEmail()");
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		System.out.println("inside RegBean setPass()");
		this.pass = pass;
	}

	public String getRpass() {
		return rpass;
	}

	public void setRpass(String rpass) {
		System.out.println("inside RegBean setRpass()");
		this.rpass = rpass;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((pass == null) ? 0 : pass.hashCode());
		result = prime * result + ((rpass == null) ? 0 : rpass.hashCode());
		result = prime * result + ((uname == null) ? 0 : uname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegBean other = (RegBean) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (pass == null) {
			if (other.pass != null)
				return false;
		} else if (!pass.equals(other.pass))
			return false;
		if (rpass == null) {
			if (other.rpass != null)
				return false;
		} else if (!rpass.equals(other.rpass))
			return false;
		if (uname == null) {
			if (other.uname != null)
				return false;
		} else if (!uname.equals(other.uname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RegBean [uname=" + uname + ", email=" + email + ", pass=" + pass + ", rpass=" + rpass + "]";
	}
	
	public String validate() {
			
			StringBuilder sb = new StringBuilder(); // mutable seq of characters
			if(uname == null || uname.isEmpty() || uname.equals(" ")) {
				sb.append("please fill in your Name!<br>");
			}
			if(email == null || email.isEmpty() || email.equals(" ")) {
				sb.append("kindly fill in your Email!<br>");
			}
			if(pass == null || pass.isEmpty() || pass.equals(" ")) {
				sb.append("password can't be empty!<br>");
			}
			else
				if(!pass.equals(rpass))
					sb.append("pass do not match");
			String message;
			message = sb.toString();
			if(sb.toString().isEmpty()) {
				return Constants.SUCCESS;
			}
			else {
				return message;
			}
		}
		
	
}
