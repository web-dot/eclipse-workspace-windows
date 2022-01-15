package com.uttara.practical01;


//24
public class TestProcess {
	
	public static int process(int n) {
		System.out.println("in process =" + n);
		n = 20;
		System.out.println("in process =" + n);
		return n;
	}
	
	
	public static void main(String[] args) {
		
		
		System.out.println("----------------24----------------------");
		
		//test process
		/*
		int x = 10;
		System.out.println("in main =" + x);
		x = process(x);
		System.out.println("in main = " + x);
		*/
		
		
		System.out.println("-----------------23---------------------");
		
		//23
		
		/*
		 * INFINITE LOOP
		 
		int i = 50;
		while(i != 0) {
			System.out.println(i >>> 1);
	
 		}
 		*/
		
		
		System.out.println("---------------22-----------------------");
		
		
		//22
		System.out.println(4 | 3);
		System.out.println(4 | 4);
		System.out.println(4 & 3);
		System.out.println(4 / 3);
		
		System.out.println("--------------20------------------------");
		
		//20
		int x = 10;
		System.out.println(x >>> 2);
		
		int a = -10;
		System.out.println(a >>> 2);
		
		System.out.println("-----------------19---------------------");
		
		int c = 10;
		int y = 6;
		System.out.println(c ^ y);
		
		int j = 100;
		int b = 50;
		System.out.println(j ^ b);
		
		
		System.out.println("--------------------18------------------");
		
		int i = 10;
		int k = 6;
		System.out.println(i & k);
		
		int s = 100;
		int p = 50;
		System.out.println(s & p);
	}

}
