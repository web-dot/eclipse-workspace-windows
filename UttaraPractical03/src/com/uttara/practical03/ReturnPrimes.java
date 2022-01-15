package com.uttara.practical03;

import java.util.ArrayList;
import java.util.List;

public class ReturnPrimes {
	
	//[0]capture req-WAP to generate all primes within a positve int number.
	//can you reuse the method coded for 4th problem.
	//[1]build test cases
		//success -> 
		//negative -> 
		//boundary -> 
		//single case ->
	//[3]design method header
	//[4]method header
		/*public static void returnPrimesInRange(int num) {
			
		}
		*/
	//[5]psudocode
		
		/*
		 * START
		 * 
		 * REPEAT FOR K = 1 TO RANGE BY 1
		 * INITIALIZE COUNT TO 0
		 * REPEAT FOR J = 1 TO K BY 1
		 * IF K % J == 0
		 * INCREMENT COUNT
		 * END IF
		 * END FOR
		 * END FOR
		 * IF COUNT == 2
		 * ADD NUM TO ARRAY
		 * RETURN ARRAY
		 */
		
	//[6]IMPLEMENT CODE
	public static void returnPrimesInRange(int num) {
		List<Integer> primeList = new ArrayList<Integer>();
		for(int i = 1; i <= num; i++) {
			int count = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 2) {
				primeList.add(i);
			}
		}
		System.out.println("prime numbers within " + num + " : " + primeList);
	}
	public static void main(String[] args) {
		
		//check for test cases
		returnPrimesInRange(0);
		returnPrimesInRange(1);
		returnPrimesInRange(15);
		returnPrimesInRange(255);
		
		//refactor
		//..
	}

}
