package com.uttara.practical03;

public class DigitsInDecreasing {
	
	//WAM to test if all digits in a given number are in decreasing order (allow -ves)
	public static boolean digitsInDecreasing(int num) {
		int min = 0;
		boolean retval = false;
		while(Math.abs(num) > 0) {
			int rem = Math.abs(num) % 10;
			if(rem < min) {
				min  = rem;
				retval = false;
				break;
			}
			else {
				retval = true;
			}
			min = rem;
			num = num / 10;
		}
		return retval;
	}
	
	
	public static void main(String[] args) {
		
	boolean b1 = digitsInDecreasing(-53721);
	System.out.println(b1);
	
	boolean b2 = digitsInDecreasing(75321);
	System.out.println(b2);
	
	boolean b3 = digitsInDecreasing(-932);
	System.out.println(b3);
	
	boolean b4 = digitsInDecreasing(639);
	System.out.println(b4);
	
	
	}

}
