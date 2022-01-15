package com.recap.javadailycode;

import java.util.Arrays;

public class NumberBased {
	
	//Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.[Adobe]
	public static int addDigits01(int num) {
		int sum = 0;
		int lastSum = 0;
			while(num > 0) {
				int rem = num % 10;
				sum = sum + rem;
				num = num / 10;
			}
		while(sum > 9) {
			int rem = sum % 10;
			sum = sum / 10;
			lastSum = rem + sum;
		}
		return lastSum;
	}
	
	//REFACTOR
	/*
	public static int addDigits02(int num) {
		while(num >= 10) {
			int temp = 0;
		}
	}
	*/
	
	//checkprime
	
	public static boolean checkPrime(int num) {
		boolean v = false;
		int i = 2;
		while(i<=num-1) {
			if(num%i==0) {
				v = false;
				break;
			}
			i++;
		}
		if(i==num) {
			v = true;
		}
		return v;
	}
	
		public static void main(String[] args) {

		//System.out.println(addDigits01(38));
		
		System.out.println(checkPrime(22));
		
	}

}
