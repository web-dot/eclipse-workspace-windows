package com.uttara.practical02;

public class ShamboGovinda {

	public static void shamboGovinda(int num) {
		for(int i = 1; i <= num; i++) {
		if((num&1) == 0) {
			System.out.println("shambo");
			}
		else {
			System.out.println("govinda");
		}
		}
	}
	
	public static void main(String[] args) {
		
		shamboGovinda(5);
	}

}
