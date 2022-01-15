package com.uttara.immutableclass;


/*
 * IMMUTABLE CLASS
 * 
 * DECLARE CLASS FINAL
 * MARK THE INSTANCE VARIBLES PRIVATE AND FINAL 
 * PARAM CONSTR TO INITIALIZE STATE
 * PROVIDE GETTER BUT NO SETTER
 * */

//final class
public final class Person {
	
	
	//private final inst variables
	private final String name;
	private final int age;
	
	//param constr
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}
	
	//getters
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
}


