package com.io.test;

import java.io.File;
import java.util.Scanner;

public class TestFile {
	
	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter a path");
		String path = sc1.nextLine();
		System.out.println(path);
		
		//creating file object
		File f = new File(path);
		
		//checking file obj methods
		System.out.println("exists = " + f.exists());
		System.out.println("isDirectory = " + f.isDirectory());
		System.out.println("length = " + f.length());
		System.out.println("getAbsolutePath = " + f.getAbsolutePath());
		System.out.println("getName = " + f.getName());
		
		
		File[] fa = f.listFiles();
		for(File file : fa) {
			System.out.println("looping over files and printing name one at a time = " + file);
		}
		
		//What does each File ref in the array point to
		//path object

	}
	
	
	
}
