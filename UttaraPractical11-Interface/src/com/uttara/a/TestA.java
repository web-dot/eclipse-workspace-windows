package com.uttara.a;

public class TestA {

	public static void main(String[] args) {


		B objB = new B();
		System.out.println(objB.name);
		
		
		
		A objA = objB;
		
		System.out.println(objA.name);
		
		
		
		objB.print();
		objA.print();
	}

}
