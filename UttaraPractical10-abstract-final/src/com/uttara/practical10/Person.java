package com.uttara.practical10;

/*
 * Immutable class Person
 * 
 * [0] Person is marked final to ensure subclass can not modify data.
 * [1] Instance variables are marked final to guarantee that one initialized they can't be reassigned
 * [2] Instance variables are marked private to guarantee data hiding.
 * [3] Person object can only be instantiated using a parameterized constructor that accepts String name and int age as value.
 * [4] Only getter methods are provided to read data.
 * 
 * */

public final class Person {
	
	private final String name;
	private final int age;
	
	public Person(String name, int age) {
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
