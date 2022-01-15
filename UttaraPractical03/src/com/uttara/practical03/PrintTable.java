package com.uttara.practical03;

public class PrintTable {
	
	//[0]capture req - accept two numbers, print the multiplication of the of the smaller 
	//number till the second number times
	
	//[1]build test cases
	//1,2 -> 1, 2 
	//-5,-2 -> 5, 10
	//-1, 2 -> 1, 2  
	//0, 2 -> 0, 0
	
//[3]design method header
//[4]method header
	/*public static void printTable(int num1, int num2) {
		
	}
	*/
//[5]psudocode
	
	/*
	 * START
	 * REPEAT FOR K = SMALLNUM TO BIGNUM
	 */
	
//[6]IMPLEMENT CODE
	public static void printTable(int smallInt, int bigInt) {
		if(smallInt > 0 && bigInt > 0 && bigInt > smallInt) {
		for(int i = 1; i <= bigInt; i++) {
			System.out.println(smallInt + " * " +  i + " = " + (smallInt * i));
			}
		}
		else if(smallInt < 0 && bigInt < 0 && smallInt > bigInt) {
			System.out.println(smallInt + " is bigger than " + bigInt);
		}
		else if(smallInt < 0 && bigInt < 0 && smallInt < bigInt ) {
			for(int i = 1; i <= Math.abs(bigInt); i++) {
				System.out.println(smallInt + " * -" +  i + " = " + Math.abs((smallInt * i)));
			}
		}
		else if(smallInt < 0 && bigInt > 0) {
			for(int i = 1; i <= Math.abs(bigInt); i++) {
				System.out.println(smallInt + " * " +  i + " = " + (smallInt * i));
			}
		}
		else {
			System.out.println("kindly enter bigger integer for bigInt value");
		}
	}
	
	
	
	public static void main(String[] args) {
		
//[7]test code using test cases
		printTable(2, 5);
		printTable(-2, -5);
		printTable(-10, -5);
		printTable(-2, 3);
		
//[refactor]
		//..
		
	}
	
	

}
