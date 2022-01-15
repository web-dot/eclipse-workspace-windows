package com.oop;


/*How to create immutable class
 * In Java all the wrapper classes(like Integer, Boolean, Byte, Short)
 * and String class is immutable
 * 
 * we can create our won immutable classes as well as follows
 * 
 * Declare the class final - so that subclasses can not override methods
 * Make all the fields final and private
 * Make the constructor private and construct instances in factory methods
 * Do not provide "setter" methods - methods that modify fields or objects referred to by fields*/
final public class MyImmutableClass {
	final private String name;
	final private int age;
	
	public MyImmutableClass(String name, int age) {
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


