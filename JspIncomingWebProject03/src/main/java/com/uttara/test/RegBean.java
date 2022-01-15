package com.uttara.test;
import java.io.Serializable;

public class RegBean implements Serializable {
	String name, pwd, rpwd;
	
	public RegBean() {
		System.out.println("in RegBean public no args constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getRpwd() {
		return rpwd;
	}

	public void setRpwd(String rpwd) {
		this.rpwd = rpwd;
	}
	
}
