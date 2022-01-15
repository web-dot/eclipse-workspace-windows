package com.uttara.practical03;

public class DigitsInIncreasing {
	
	public static boolean digitsInIncreasing(int num) {
		int max = Math.abs(num);
		boolean retval = false;
		while(Math.abs(num) > 0) {
			int rem = Math.abs(num) % 10;
			if(rem > max) {
				max  = rem;
				retval = false;
				break;
			}
			else {
				retval = true;
			}
			max = rem;
			num = num / 10;
		}
		return retval;
	}
	
	
	public static void main(String[] args) {
		
		boolean b1 = digitsInIncreasing(-379);
		System.out.println(b1);	
		
		boolean b2 = digitsInIncreasing(57289);
		System.out.println(b2);	
		
		
	}

}
