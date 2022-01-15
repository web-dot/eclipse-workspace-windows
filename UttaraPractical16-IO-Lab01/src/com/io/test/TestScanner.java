package com.io.test;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		
		System.out.println();
		System.out.println("word input");
		System.out.println("Enter a string input");
		String s1 = sc1.next();
		System.out.println(s1);
		
		System.out.println();
		System.out.println("int input");
		System.out.println("Enter int as input");
		int n = sc1.nextInt();
		System.out.println("n = " + n);
		
		System.out.println();
		System.out.println("double input");
		System.out.println("Enter a double");
		double d = sc1.nextDouble();
		System.out.println("d = " + d);
		
		
		System.out.println();
		System.out.println("line input");
		System.out.println("Enter a sentence");
		String line = sc2.nextLine();
		System.out.println(line);
		
		System.out.println();
		System.out.println("boolean input");
		System.out.println("Enter a boolean");
		boolean b = sc1.nextBoolean();
		System.out.println(b);
		
		System.out.println();
		System.out.println("float input");
		System.out.println("Enter a float");
		float f = sc1.nextFloat();
		System.out.println(f);
		
		

	}

}
