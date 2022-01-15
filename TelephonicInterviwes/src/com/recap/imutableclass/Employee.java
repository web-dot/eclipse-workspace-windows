package com.recap.imutableclass;


/*
 * What is Immutable class?
 * 
 * Immutable class means if you create object of the class the state of the class can not be modified.
 * For example String class is immutable class. When we create String object with some data, we can
 * not modify contents of that object. If this facility is supported by any class then that class is 
 * immutable.
 * 
 * 
 * 
 * How will you create a immutable class?
 * 
 * 1. Declare class as final so that subclass should not modify the data.
 * 2. All the variables of the class mark private and final. Private will ensure that the data is hidden
 *    and final will prohibit value modification.
 * 
 * 3. Constructor to set the state of the instance only once
 * 4. Getter method but no Setter method.
 * 
 * this will make sure that the class is immutable. 
 * 
 * */


public class Employee {
	
	private final String name;
	private final int age;
	
	
	Employee(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

}
