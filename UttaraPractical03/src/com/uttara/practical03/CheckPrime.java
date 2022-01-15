package com.uttara.practical03;

public class CheckPrime {

	//[0]capture req-WAP to test if a given number is prime
	//[1]build test cases
		//success -> 11, 13, 3, 5 -> true
		//negative -> 4, 6, 8 -> false
		//boundary -> max integer value -> 
		//single case -> 3 -> true
	//[3]design method header
	//[4]method header
		/*public static void checkPrime(int num) {
			
		}
		*/
	//[5]psudocode
		
		/*
		 * START
		 * DECLARE COUNT;
		 * IF NUM == 1
		 * RETURN FALSE
		 * REPEAT FOR K = 1 TO NUMBER
		 * IF NUM % K == 0
		 * INCREMENT COUNT
		 * END IF
		 * END FOR
		 * IF COUNT == 2
		 * RETURN TRUE
		 * ELSE RETURN FALSE
		 */
		
	//[6]IMPLEMENT CODE
		public static void checkPrime(int num) {
			int count = 0;
			if(num == 1) {
				System.out.println("1 is NOT a prime number");
			}
			for(int i = 1; i <= num; i++) {
				if(num % i == 0) {
					count++;
				}
				if(count > 2) {
					System.out.println(num + " is not a prime number");
					break;
				}
			}
			if(count == 2) {
				System.out.println(num + " is a prime number");
			}
		}
	
	public static void main(String[] args) {
		
		//[7]test using test cases
		checkPrime(3);
		checkPrime(11);
		checkPrime(13);
		checkPrime(5);
		
		checkPrime(1);
		
		checkPrime(2);
		
		checkPrime(4);
		checkPrime(6);
		checkPrime(8);
		
		checkPrime(Integer.MAX_VALUE); //exception

	}

}
