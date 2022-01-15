package com.collections.list;

public class Customer {
	String name;
	int srNo;
	int bill;
	public Customer(String name, int srNo) {
		this.name = name;
		this.srNo = srNo;
	}
	
	public Customer(String name, int srNo, int bill) {
		this.name = name;
		this.srNo = srNo;
		this.bill = bill;
	}
}
