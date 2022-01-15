package com.uttara.practical03;

public class AverageOfNumbers {
	//[0]capture req-given 3 numbers, return the correct average.
	//can you reuse the method coded for 4th problem.
	//[1]build test cases
		//success -> 
		//negative -> 
		//boundary -> 
		//single case ->
	//[3]design method header
	//[4]method header
		/*public static void returnAverage(int num) {
			
		}
		*/
	//[5]psudocode
		
		/*
		 * START
		 * SUM = NUM1 + NUM2 + NUM3;
		 * AVERAGE = SUM / 3;
		 * RETURN AVERAGE
		 */
		
	//[6]IMPLEMENT CODE
	public static void returnAverage(double a, double b, double c) {
		double sum = a + b + c;
		double avg = sum / 3;
		System.out.println("average = " + avg);
	}
	public static void main(String[] args) {
		
		//test
		returnAverage(20, 40, 30);
		returnAverage(22.45, 12.25, 75.25);
		returnAverage();
	}

}
