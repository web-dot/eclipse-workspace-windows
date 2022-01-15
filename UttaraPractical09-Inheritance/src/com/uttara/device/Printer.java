package com.uttara.device;



//STEP-08
class Printer extends Device{
	
	Printer(){
		System.out.println("in Printer class no argument constructor");
	}
	
	Printer(String n){
		super(n);
	}
	
	
	public void doSomething(){
		System.out.println(getName() + " doing something");
	}
}