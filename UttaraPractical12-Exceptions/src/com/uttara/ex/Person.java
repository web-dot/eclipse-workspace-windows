package com.uttara.ex;


public class Person {
	String name;
	int age;
	
	
	//validateName
	public boolean validateName(String name) {
		if(name == null || name.isEmpty() || name.equals(" ")) {
			return false;
		}
		return true;
	}
	
	//validateAge
	public boolean validateAge(int age) {
		if(age <= 0 || age > 100) {
			return false;
		}
		return true;
	}
	
	//param constr
	public Person(String name, int age) {
		if(validateName(name)) {
			this.name = name;
		}
		if(validateAge(age)) {
			this.age = age;
		}
		else {
			throw new IllegalArgumentException("is this person born or is he already dead?");
		}
	}

	
	//setter/getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(validateName(name)) {
		this.name = name;
		}
		else {
		throw new IllegalArgumentException();
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(validateAge(age)) {
		this.age = age;
		}
		else {
			throw new IllegalArgumentException("is this person born or is he already dead?");
		}
		
	}
	
	
	//instance method
	public void dance(String type)throws DanceFailureException {
		if(this.age > 50 || type == "salsa") {
			throw new DanceFailureException("Can not dance!!");
		}
		else {
			System.out.println("Dance as much as you can!!");
		}
	}
}
