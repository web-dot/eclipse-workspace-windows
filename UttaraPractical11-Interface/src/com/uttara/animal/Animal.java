package com.uttara.animal;

public abstract class Animal {
	
	String name;
	
	Animal(){
		System.out.println("in Animal no-arg constr");
	}
	
	Animal(String name){
		this.name = name;
		System.out.println("in Animal param constr");
	}
	
	
	
	public abstract void eat();
	
	public void sleep() {
		
		System.out.println("animal sleeping eyes closed");
	}
	
	
}


class Croc extends Animal{
	
	Croc(){
		System.out.println("in Croc no arg constr");
	}
	
	Croc(String name){
		super(name);
		System.out.println("in Crog param constr");
	}
	
	
	public void swim() {
		System.out.println("Croc swimming fast");
	}
	
	public void eat() {
		System.out.println("Croc eating");
	}
	
	public void sleep() {
		System.out.println("Croc sleeping");
	}
	
	
	
	
	
}