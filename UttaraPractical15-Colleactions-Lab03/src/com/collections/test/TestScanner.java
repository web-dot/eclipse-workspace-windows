package com.collections.test;

import java.util.*;

public class TestScanner {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("basic methods of scanner class usage : ");
		System.out.println();
		System.out.println("Enter a string input");
		String s1 = sc1.next();		//string input
		System.out.println("string = " + s1);
		
		System.out.println();
		System.out.println("Enter int n as input");
		int n = sc1.nextInt();		//int input
		System.out.println("n =" + n);
		
		System.out.println();
		System.out.println("Enter a double d as input");
		double d = sc1.nextDouble();	//double input
		System.out.println("d =" + d);
		
		System.out.println();
		//reading entire line 
		System.out.println("Enter a sentence");
		String line = sc2.nextLine();
		System.out.println(line);
		
		

	}

}
