package com.uttara.practical02;

public class Test {

	public static int process(int num) {
		System.out.println("in process x = " + num);
		num = 20;
		return num;
	}
	
	
	
	public static void main(String[] args) {
		
		//simple progs 
		//1
		int x = 10;
		System.out.println("in main before process() x = " + x);
		x = process(x);
		System.out.println("in main sfter process() x = " + x);
		
		
	}

}
