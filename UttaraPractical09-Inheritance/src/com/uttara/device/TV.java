package com.uttara.device;

//STEP-05
class TV extends Device{
	
	
	
	TV(){
		System.out.println("in TV class no argument constructor");
	}
	
	TV(String n){
		super(n);
	}
	
	
	
	//STEP-06
	public void doSomething(){
		System.out.println(getName() + " doing something");
	}
	
	
	//STEP-07
	public void switchChannel(){
		System.out.println("TV switching channel");
	}
	
}