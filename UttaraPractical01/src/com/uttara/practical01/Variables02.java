package com.uttara.practical01;

public class Variables02 {

	public static void main(String[] args) {
		
		System.out.println("-------------I---------------");
		
		//int a = 10/0;
		//double d = 10.0/0.0;
		float f = 10.0f/0.0f;
		double d = 10.0/0;
		double a = 10/0.0;
		
		System.out.println("-------------k--------------");
		
		/*
		char c = 'X';
		int m = 63;
		char n = m;
		System.out.println(n);
		*/
		/*
		char c = 'X';
		int m = 63;
		char n =(char)m;
		System.out.println(n);
		*/
		
		System.out.println("-------------j--------------");
		
		//type error
		/*
		byte b = 10;
		b = b + 10;
		System.out.println();
		*/
		
		byte b = 10;
		b += 10;
		System.out.println(b);
		
		System.out.println("-------------i--------------");
		
		System.out.println("1" + 2 + 3);
		System.out.println(6 + 2 + "4");
		System.out.println('2' + 2 + "2");
		System.out.println('2' + "2");
		
		
		System.out.println("-------------h--------------");
		
		int x = 10;
		int y = 4;
		
		int result1 = x + y;
		int result2 = x * y;
		int result3 = x / y;
		int result4 = x % y;
		int result5 = x - y;
		
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
				
		
		
		
		
	}

}
