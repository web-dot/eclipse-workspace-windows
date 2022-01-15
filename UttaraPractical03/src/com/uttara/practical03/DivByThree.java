package com.uttara.practical03;

public class DivByThree {

	//[0]capture req-test if a given number is divisible by 3.Do this for +ve 
	// -ve ints
	//[1]build test cases
		//success -> 3, -3, -6, 15 -> true
		//negative -> 5 -> false
		//boundary -> max integer value -> 
		//single case -> 3 -> true
	//[3]design method header
	//[4]method header
		/*public static void divByThree(int num) {
			
		}
		*/
	//[5]psudocode
		
		/*
		 * START
		 * IF ABSOLUTE VALUE OF NUMBER % 3 == 0
		 * RETURN TRUE
		 * END IF
		 */
		
	//[6]IMPLEMENT CODE
	public static void divByThree(int num) {
		if(Math.abs(num) % 3 == 0) {
			System.out.println(num + " is divisible by three");
		}
		else {
		System.out.println(num + " is not divisible by three");
		}
	}
	public static void main(String[] args) {
		
		
		//[7]test using test cases
		divByThree(3);
		divByThree(-3);
		divByThree(-6);
		divByThree(15);
		divByThree(-15);
		divByThree(Integer.MAX_VALUE);
		divByThree(Integer.MIN_VALUE);
		
		//[8]refactor
		//..
	}

}
