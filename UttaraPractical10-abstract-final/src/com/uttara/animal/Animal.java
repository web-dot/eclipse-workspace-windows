package com.uttara.animal;

public abstract class Animal {
	
	String name;
	
	
	public Animal() {
		System.out.println("inside Animal no arg constr");
	}
	
	public Animal(String name) {
		this.name = name;
		System.out.println("inside Animal param constr");
	}
	
	//abstract method
	public abstract void eat();
	
	//concrete method
	public void sleep() {
		System.out.println("animal sleeping closing eyes!!!");
	}
}


class Croc extends Animal{

	
	public Croc() {
		System.out.println("inside Croc no arg constr");
	}
	
	public Croc(String name) {
		super(name);
		System.out.println("inside Croc param constr");
	}
	
	
	
	@Override
	public void eat() {
		System.out.println("Croc eating");
	}
	
	@Override
	public void sleep() {
		System.out.println("Croc sleeping");
	}
	
	
	public void swim() {
		System.out.println("Croc swimming in okavango");
	}
	
}
