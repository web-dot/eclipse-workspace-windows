package com.sort.employee;

/*
 * Q.
 * Employee class has employee name, age, dob and all other fields. 
 * I want to sort it by employee name and employee age
 * 
 * A.
 * We are storing collection of Employee object into ArrayList. we are storing
 * List of employee. 
 * 
 * We will write two separate Comparator class, we can take class EmployeeComparator by implementing
 * java.util.comparator interface.
 * We will override compareTo() method which takes two objects as parameter, in compare() method
 * we will access forst emp object, we need to type cast if not using generics, we will get hold of the
 * reference of the first employee object and write s1.compareTo(s2)
 * To sort we will call Collections.sort(). it takes two parameters, first is the list of the objects
 * and second is a comparator subclass object. 
 * 
 * 
 * */


public class Employee {
	String empName;
	int age;
	int dob;

	public Employee(String name, int age){
		this.empName = name;
		this.age = age;
	}
}
