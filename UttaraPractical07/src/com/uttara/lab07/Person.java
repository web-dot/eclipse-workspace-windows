package com.uttara.lab07;

public class Person {
	
	private String name;
	private int age;
	
	public static int count = 0;
	
	public Person(){
		System.out.println("in Person class no argument constructor");
		count++;
	}
	public Person(String name){
		System.out.println("in Person class single argument constructor");
		this.name = name;
		count++;
	}
	
	public Person(String name, int age){
		System.out.println("in Person class double argument constructor");
		this.name = name;
		this.age = age;
		count++;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null && !name.trim().equals("") && name.length() <= 30) {
		this.name = name;
		}
		else {
			throw new IllegalArgumentException("Name can not be null or empty and should be less than 30 chars");
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 0 && age < 100) {
		this.age = age;
		}
		else {
			throw new IllegalArgumentException("Age must be less than 100 and more than 0");
		}
	}

}

