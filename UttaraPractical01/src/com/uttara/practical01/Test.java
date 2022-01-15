package com.uttara.practical01;

//26
public class Test {
	
	
	public static int y() {
		int y = 20;
		System.out.println("inside y");
		return y;
	}
	

	public static void x() {
		int x = 10;
		System.out.println("inside x");
		//System.out.println(y); //local variable of another method is not accessible unless the method returns the value
		System.out.println(y());
	}
	
	
	public static void main(String[] args) {
		x();
		Test2.z();
	}

}
