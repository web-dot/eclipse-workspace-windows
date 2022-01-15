package com.uttara.practical10;

public class TestPerson {

	public static void main(String[] args) {
		
		/*
		 * Creating object p1 of class Person
		 * 
		 * [0] Person is marked final to ensure subclass can not modify data.
		 * [1] Instance variables are marked final to guarantee that one initialized they can't be reassigned
		 * [2] Instance variables are marked private to guarantee data hiding.
		 * [3] Person object can only be instantiated using a parameterized constructor that accepts String name and int age as value.
		 * [4] Only getter methods are provided to read data.
		 * 
		 * */
		
		Person p1 = new Person("sachin", 24);
		System.out.println(p1.getName() + " : " + p1.getAge());
		
		
	}

}
