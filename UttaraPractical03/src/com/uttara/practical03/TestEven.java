package com.uttara.practical03;

public class TestEven {
	
	
//[0]capture req-WAP to test if a given number is even
//[1]build test cases
	//1 -> false
	//2 -> true
	//4 -> true
	//9 -> false
//[3]design method header
//[4]method header
	/*public static void TestEven(int num) {
		
	}
	*/
//[5]psudocode
	
	/*
	 * START
	 * IF NUM == 0 > RETURN FALSE
	 * IF ABS NUM == 1 -> RETURN FALSE
	 * IF ABS NUM == 2 -> RETURN TRUE
	 * IF ABS NUM & 1 == 0 -< RETURN TRUE
	 * END IF
	 * ELSE RETURN FALSE 
	 */
	
//[6]IMPLEMENT CODE
	public static void TestEven(int num) {
		if(Math.abs(num) == 1) {
			System.out.println(num + " is not even");
		}
		else if((Math.abs(num) & 1) == 0) {
			System.out.println(num + " is even");
		}
		else {
			System.out.println(num + " is not even");
		}
	}
	public static void main(String[] args) {
		
		//[7]test code using test cases
		TestEven(0);
		TestEven(Integer.MIN_VALUE);
		TestEven(2);
		TestEven(99);
		TestEven(241847);
		TestEven(Integer.MAX_VALUE);
		
		
		//[refactor]
		//
	}

}
