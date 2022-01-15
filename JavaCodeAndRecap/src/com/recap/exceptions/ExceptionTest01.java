package com.recap.exceptions;

import java.io.IOException;


class E1{
	public static void process1(int x) {
		if(x == 0) {
			throw new IllegalArgumentException();
		}
		else {
			System.out.println("Hello there");
		}
	}
}

class E2{
	public void process2() {
		E1.process1(0);
	}
}


//


public class ExceptionTest01 {
	public static void main(String[] args) {
		
		
		
		
		
		int i = 10;
		byte b = 10;
		
		//b = i;
		
		if(i == b) {
			System.out.println("hello");
		}
		else {
			System.out.println("na");
		}
		
		/*
		System.out.println("hello");
		int i = 5;
		System.out.println(i);
		try {
		System.out.println(i / 0);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("hi");
		*/
	}
	
}
