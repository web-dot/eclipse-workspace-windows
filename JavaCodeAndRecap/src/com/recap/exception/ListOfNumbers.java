package com.recap.exception;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

class ListOfNumbers{
	private List<Integer> list;
	private static final int SIZE = 10;
	
	public void listOfNumbers() {
		list = new ArrayList<Integer>(SIZE);
		for(int i = 0; i < SIZE; i++) {
			list.add(i);
		}
		//System.out.println(list);
	}
	
	public void writeList() {
		PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
		
		for(int i = 0; i < SIZE; i++) {
			out.println("Value at: " + i + " = " + list.get(i));
		}
		out.close();
	}
}