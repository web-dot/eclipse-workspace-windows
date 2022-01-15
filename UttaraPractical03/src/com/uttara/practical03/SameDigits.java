package com.uttara.practical03;

public class SameDigits {
	
	public static void sameDigits(int num) {
		while(num > 0) {
			int c = 0;
			int rem = num % 10;
			c = rem;
			if(c == rem) {
				System.out.println("same");
			}
			else {
				System.out.println("not same");
			}
			System.out.println(rem);
			
			num = num / 10;
		}
	}
	
	
	public static void main(String[] args) {

		sameDigits(323);

	}

}
