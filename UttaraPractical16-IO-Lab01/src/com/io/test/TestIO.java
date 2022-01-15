package com.io.test;

import java.util.Scanner;
import com.io.classes.*;




public class TestIO {

	public static void main(String[] args) {
		
		//Q-3)PRINT FILE CONTENT----------------->
		/*
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter path");
		String path = sc1.nextLine();
		
		PrintTextFromFile pt = new PrintTextFromFile();
		pt.printTextFromFile(path);
		*/
		
		
		
		
		//Q-4)GIVEN TWO PATHS READ FROM FILE AND CREATE FILE TO WRITE IN OTHER PATH----------------->
		/*
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter path you want to read file from");
		String filePath = sc2.nextLine();
		System.out.println("Enter path you want to create file and write to");
		String writePath = sc2.nextLine();
		ReadAndWrite raw = new ReadAndWrite();
		raw.readWrite(filePath, writePath);
		*/
		
		//Q-5)TAKE INPUT A PATH, IF PATH IS POINTING TO FOLSER, PRINT ALL TEXT FILE NAMES
		/*
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter path");
		String path = sc3.nextLine();
		PrintTextFileNames ptf = new PrintTextFileNames();
		ptf.printFileNames(path);
		*/
		
		
		//Q-6)FIND MAX OCCURING WORDS FROM FILE
		/*
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Enter path to search max occuring word");
		String path = sc4.nextLine();
		PrintMax pm = new PrintMax();
		pm.printMax(path);
		*/

		
		//Q-7)FIND UNCOMMON WORDS
		/*
		Scanner sc5 = new Scanner(System.in);
		System.out.println("Enter a path");
		String path1 = sc5.nextLine();
		System.out.println("Enter an other path");
		String path2 = sc5.nextLine();
		RemoveDuplicates rd = new RemoveDuplicates();
		rd.removeDuplicates(path1, path2);
		*/
		
		//Q-8)SORT WORDS WITHOUT DUPLICATES AND WITH DUPLICATES
		/*
		Scanner sc6 = new Scanner(System.in);
		System.out.println("Enter path");
		String path = sc6.nextLine();
		SortWordsInFile sw = new SortWordsInFile();
		sw.sortWords(path);
		 */
			
		
		
		
		
		
		
		
		
		
		

	}

}
