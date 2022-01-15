package com.uttara.practical01;

public class EvenOdd {
	
	public static void evenOdd() {
		for(int i = 2; i <= 100; i++) {
			if((i&1) == 0) {
				System.out.println("Even " + i);
			}
			else {
				System.out.println("odd " + i);
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		evenOdd();

	}

}
