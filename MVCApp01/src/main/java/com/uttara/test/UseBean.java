package com.uttara.test;
import java.io.Serializable;


public class UseBean implements Serializable {
	String uname,email,pwd,rpwd;
	public UseBean() {
		System.out.println("in UseBean no arg constructor");
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		System.out.println("in UseBean setUname()");
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		System.out.println("in UseBean setEmail()");
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		System.out.println("in UseBean setPwd()");
		this.pwd = pwd;
	}
	public String getRpwd() {
		return rpwd;
	}
	public void setRpwd(String rpwd) {
		System.out.println("in UseBean setRpwd()");
		this.rpwd = rpwd;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
		result = prime * result + ((rpwd == null) ? 0 : rpwd.hashCode());
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
		UseBean other = (UseBean) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (pwd == null) {
			if (other.pwd != null)
				return false;
		} else if (!pwd.equals(other.pwd))
			return false;
		if (rpwd == null) {
			if (other.rpwd != null)
				return false;
		} else if (!rpwd.equals(other.rpwd))
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
		return "UseBean [uname=" + uname + ", email=" + email + ", pwd=" + pwd + ", rpwd=" + rpwd + "]";
	}
	
	public String validate() {
		StringBuilder sb = new StringBuilder();
		if(uname == null || uname.trim().equals("")) {
			sb.append("name can't be empty<br/>");
		}
		if(email == null || email.trim().equals("")) {
			sb.append("email can't be empty<br/>");
		}
		if(pwd == null || pwd.trim().equals("")) {
			sb.append("password can't be empty<br/>");
		}
		else {
			if(!pwd.equals(rpwd)) {
				sb.append("password do not match<br/>");
			}
		}
		String msg = sb.toString();
		if(msg.equals("")) {
			return "SUCCESS";
		}
		else {
			return msg;
		}
	}
}
