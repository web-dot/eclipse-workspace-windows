package com.uttara.practical02;

public class PrintPattern02 {

	
	public static void printPatt(int num) {
		for(int i = num; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print(j);
			}
			System.out.println();	
		}
	}
	
	
	public static void main(String[] args) {
			
		printPatt(7);

	}

}
