package com.collections.map;
import java.util.Comparator;

/*Employee class must implement Comparable<> and override compareTo() for inserting Employee object into TreeMap or
 * 
 * 
 * 
 * A Comparator<> object which overrides compare must be passed as a parameter to the TreeMap constructor for inserting
 * Employee object in TreeMap*/
public class Employee /*implements Comparable<Employee>*/{
	String name;
	int age;
	int children;
	public Employee(String name, int age){
		this.name = name;
		this.age = age;
	}
	public Employee(int children, int age) {
		this.children = children;
		this.age = age;
	}
	
	/*
	@Override
	public int compareTo(Employee other) {
		if(name.compareTo(other.name) < 0) {
			return -1;
		}
		if(name.compareTo(other.name) > 0) {
			return 1;
		}
		else {
			return name.compareTo(other.name);
		}
	}*/
}
