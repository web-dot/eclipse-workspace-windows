package com.uttara.practical01;


//27
public class printChar {

	public static void main(String[] args) {
		char a = 'a';
		int x = a;
		System.out.println(x);
		for(char c = a; c <= a+25; c++) {
			System.out.println((int)c + " = " + c);
		}
		
	}

}
