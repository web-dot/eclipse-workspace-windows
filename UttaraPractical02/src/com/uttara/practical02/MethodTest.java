package com.uttara.practical02;

public class MethodTest {
	
	public static int print() {
		if(1 != 2) {
			return 1;
		}
		return 0;
	}
	
	
	public static void main(String[] args) {
		System.out.println("main starts");
		print();
		System.out.println("main ends");
	}
	
	

}
