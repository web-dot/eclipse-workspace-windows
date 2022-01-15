package com.uttara.test;
import java.io.Serializable;
public class RegBean implements Serializable {
	String uname,pwd,rpwd;
	
	public RegBean() {
		System.out.println("in RegBean class no argument constructor");
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		System.out.println("in RegBean class setUname");
		this.uname = uname;
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
		return "RegBean [uname=" + uname + ", pwd=" + pwd + ", rpwd=" + rpwd + "]";
	}
	
}
