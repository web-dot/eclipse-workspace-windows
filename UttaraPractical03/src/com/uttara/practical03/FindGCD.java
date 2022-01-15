package com.uttara.practical03;

public class FindGCD {
	
	public static void printGCD(int a, int b) {
		int GCD = 0;
		if(a <= b) {
			for(int i = 1; i <= a; i++) {
				if(a % i == 0 && b % i == 0) {
					GCD = i;
				}
			}
		}
		if(b <= a) {
			for(int i = 1; i <= b; i++) {
				if(a % i == 0 && b % i == 0) {
					GCD = i;
				}
			}
		}
		System.out.println("GCD of " + a + " and " + b + " = " + GCD);
	} 
	
	
	public static void main(String[] args) {
		
		printGCD(550, 1100);

	}

}
