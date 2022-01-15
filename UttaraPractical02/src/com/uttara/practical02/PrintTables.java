package com.uttara.practical02;

public class PrintTables {

	public static void printIntTable(int smallInt, int bigInt) {
		for(int i = 1; i <= bigInt; i++) {
			System.out.println(smallInt + " * " + i + " = " + (smallInt * i));
		}
	}
	
	
	
	public static void main(String[] args) {

		//print table 1 to 10
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
		
		System.out.println("----------------------------------------------");
		
		
		//print table two nums
		printIntTable(13, 50);
		

	}

}
