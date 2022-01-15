package com.recap.recursion;

public class TestRe01 {

	public static void print(int i) {
		
		if(i == 0) {
			return;
		}
		else {
			print(i-1);
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		print(10);
	}

}
