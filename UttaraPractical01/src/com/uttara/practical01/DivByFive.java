package com.uttara.practical01;

public class DivByFive {
	
	public static void divByFive(int num) {
		if(num <= 100) {
			if(num % 5 == 0 ^ num % 3 == 0) {
				System.out.println("Divisible " + num);
				}
			else {
				System.out.println("the number might be divisible by 3 and 5 both or some other number");
			}
			}
		else {
			System.out.println("The number is larger than 100");
		}
	}
	
	public static void main(String[] args) {
		
		//method call
		divByFive(13);

	}

}
