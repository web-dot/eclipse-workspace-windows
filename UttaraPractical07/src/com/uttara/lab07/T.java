package com.uttara.lab07;

public class T {
	
	public static int val = 10;
	int p = 40;
	
	public static void main(String[] args) {
		
		System.out.println(val);
		T t  = new T();
		t = null;
		System.out.println(T.val); 
		/*
		 * Above statement prints 10 as a static member belongs to the class itself. 
		 * A STATIC variable is a single copy variable shared by all objects of class created inside the Class object
		 * of the associated class. 
		 * DURING CLASS lOADING STATIC DATA MEMORY ALLOCATION WILL HAPPEN -> EARLY BINDING -> EAGER INITIALIZATION
		 * */
	
		T t2 = new T();
		t2.test();
		
		//System.out.println(p); //Compiler Complains -> can not make static refrence to non static variable
		
		
		//To access instance variable in a static method a object needs to be created
		System.out.println(t2.p);
	
		
	}
	
	public void test() {
		System.out.println(T.val);
	}
	
	
}
