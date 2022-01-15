package com.uttara.practical03;

public class SumOfDigits {
	
	//12
	//SUM OF DIGITS
	public static void sumOfDigits(int num) {
		int sum = 0;
		while(num > 0) {
			int rem = num % 10;
			sum = sum+rem;
			num = num / 10;
		}
		System.out.println("sum of the digits = " + sum);
	}
	
	
	//13
	//IF A DIGIT IS PRESENT
	public static void checkDigit(int num, int digit) {
		while(num > 0) {
			int rem = num % 10;
			if(rem == digit) {
				System.out.println("number contains digit " + digit);
			}
			num = num / 10;
		}
	}
	
	public static void main(String[] args) {
		
		sumOfDigits(12);
		sumOfDigits(567);
		sumOfDigits(352673);
		
		
		checkDigit(1245, 5);
		
		i == 2;
		i == 0 ? System.out.println("yes") : System.out.println("no");
	}

}
