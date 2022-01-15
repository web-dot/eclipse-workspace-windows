package com.uttara.test;
import java.io.Serializable;


public class UseBean implements Serializable {
	String uname,email,pwd,rpwd;
	
	public UseBean() {
		System.out.println("in no argument constructor of RegBean");
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		System.out.println("in RegBean class setUname");
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("in RegBean class setEmail");
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		System.out.println("in RegBean class setPwd");
		this.pwd = pwd;
	}

	public String getRpwd() {
		return rpwd;
	}

	public void setRpwd(String rpwd) {
		System.out.println("in RegBean class setRpwd");
		this.rpwd = rpwd;
	}

	@Override
	public String toString() {
		return "UseBean [uname=" + uname + ", email=" + email + ", pwd=" + pwd + ", rpwd=" + rpwd + "]";
	}
	
}
