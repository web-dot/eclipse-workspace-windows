package com.uttara.practical03;

public class CheckIfPowerOfTwo {
	public static void powerOfTwo(int num) {
		int count = 0;
		while(num > 2) {
			num = num / 2;
			if(num % 2 != 0) {
				count++;
			}
		}
		if(count == 0) {
			System.out.println("power of two");
		}
		else {
			System.out.println("not a power of two");
		}
	}
	
	
	public static void main(String[] args) {
		
		powerOfTwo(255);
		
		String letters = "ABCAB";
		System.out.println(letters.substring(0, 2).startsWith("A"));
	}

}
