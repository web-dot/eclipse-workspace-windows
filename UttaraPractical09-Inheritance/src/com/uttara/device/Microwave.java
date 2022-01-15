package com.uttara.device;


//STEP-08
class Microwave extends Device{
	
	Microwave(){
		
		System.out.println("in Microwave class no argument constructor");
	}
	
	Microwave(String n){
		super(n);
	}
	
	public void doSomething(){
		System.out.println(getName() + " doing something");
	}
}