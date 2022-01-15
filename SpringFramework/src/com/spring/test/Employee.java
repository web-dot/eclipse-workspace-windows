package com.spring.test;

import java.util.List;

public class Employee {
	String name;
	int id;
	List<String> childNames;
	List<Account> account;
	
	
	public List<Account> getAccount() {
		return account;
	}


	public void setAccount(List<Account> account) {
		this.account = account;
		System.out.println("inside Employee setAccount()");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public List<String> getChildNames() {
		return childNames;
	}


	public void setChildNames(List<String> childNames) {
		this.childNames = childNames;
	}


	public Employee() {
		System.out.println("in Employee no args constructor");
	}
	
	//constructors
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public Employee(String name, int id, List<String> childNames) {
		this.name = name;
		this.id = id;
		this.childNames = childNames;
		System.out.println("inside Employee param constr");
	}
	
	
	//method
	public void completeTask(Task t) {
		
		t.doTask();
		
	}
	
	
	
	
}
