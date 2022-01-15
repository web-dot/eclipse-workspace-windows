package com.uttara.pet;

public interface Pet {
	
	int X = 10;
	String NAME = "Pingu";
	
	
	void play();
	
	//public Pet() {}; interfaces can not have constructors
	//public void someMethd() {}; //abstract method can not have body
	//final void finalMethd(); //a final method can not be overridden
	
	//final int var; // a variable in interface must be initialized before end of contructor
	
	
}
