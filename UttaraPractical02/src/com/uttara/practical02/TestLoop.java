package com.uttara.practical02;

public class TestLoop {

	public static void main(String[] args) {
		
		for(int i = 1; i < 100; i++) {
			System.out.print(i);
			if(i % 11 == 0) {
				System.out.println("hello");
			}
		}
		

	}

}
