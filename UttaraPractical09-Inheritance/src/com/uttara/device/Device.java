package com.uttara.device;


//STEP-01
class Device{
	
	private String name;
	
	
	//setter-getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//STEP-03
	Device(){
		System.out.println("in Device class no argument constructor");
	}
	
	
	Device(String s){
		name = s;
		System.out.println("in Device class parameterized constructor");
		
	}
	
	public void doSomething(){
		System.out.println(name + " doing something");
	}
}