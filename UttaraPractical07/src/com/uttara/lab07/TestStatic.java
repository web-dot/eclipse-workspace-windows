package com.uttara.lab07;

public class TestStatic {
	
	 static int i = 10;
	 int j = 20;
	 
	 
	 public static void m2() { 
		
		// this is a static variable, static method can access static variables
		 i = 100;
		 
		// this is a instance variable, static method can not access instance variables without creating object
		 //j = 200;
		 System.out.println(i);
		 
		 //accessing instance variable after creating object
		 TestStatic ts1 = new TestStatic();
		 ts1.j = 500;
		 System.out.println(ts1.j);
		
	 }
	 
	 public void m1() {
		 
		 
		 
		 i = 100;
		 j = 200;
		 
		 System.out.println(i);
		 System.out.println(j);
		 
	 }
	

	public static void main(String[] args) {
		
		// this is a static method, we CAN invoke a static member without creating object
		m2();
		
		//this is a instance method, we CAN NOT invoke a instance member without creating object
		//m1();
		
		//creating object
		TestStatic ts1 = new TestStatic();
		
		//invoking instance method after creating object
		ts1.m1();
		
		
		
		
	}

}
