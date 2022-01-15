package com.collections.collectionrecap;

public class Employee implements Comparable<Employee> {
	String name;
	String id;
	int age;
	
	public Employee(String name, String id, int age) {
		this.name = name;
		this.id = id;
	}
	
	
	
	@Override
	public int compareTo(Employee o) {
		if(name.compareTo(o.name) < 0) {
			return -1;
		}
		else if(name.compareTo(name) > 0) {
			return 1;
		}
		else {
			return name.compareTo(o.name);
		}
	}
	
	
}
