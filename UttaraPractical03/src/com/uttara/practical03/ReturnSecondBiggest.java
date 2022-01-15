package com.uttara.practical03;

public class ReturnSecondBiggest {
	
	//17
	
	public static int returnBiggestNum(int a, int b, int c) {
		int max = 0;
		if(a > b && a > c) {
			max = a;
		}
		else if(b > a && b > c) {
			max = b;
		}
		else {
		 max = c;
		}		//System.out.println(max);
		if(max == a) {
			if(b < max && b > c) {
				return b;
			}
		}
		//return c;
		else if(max == b) {
			if(a < max && a >c) {
				return a;
			}
		}
		return c;
	}
	public static void main(String[] args) {

		int r1 = returnBiggestNum(30, 20, 12);
		System.out.println(r1);
		
//		int r2 = returnBiggestNum(30, 5, 5);
//		System.out.println(r2);
		
	}

}
