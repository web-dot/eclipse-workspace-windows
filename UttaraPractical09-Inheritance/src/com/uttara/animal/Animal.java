package com.uttara.animal;

public class Animal {
	
	private String name;
	
	
	
	//getter-setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	//behaviors
	public void eat() {
		System.out.println(getName() + " eating");
	}
	
	public void sleep() {
		System.out.println(getName() + " sleeping and snoring");
	}
	
	public void dance() {
		System.out.println(getName() + " dancing");
	}
}
