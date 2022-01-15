package com.uttara.collections01;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class TestStringCollections {

	public static void main(String[] args) {


		Collection col = new HashSet();
		
		
		System.out.println("----------<adding elements>------------");
		//add()
		col.add("Java");
		col.add("JavaScript");
		col.add("scala");
		col.add("python");
		col.add("c");
		col.add("php");
		
		System.out.println(col);
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("----------<contains()>------------");
		String s1 = "c";
		
		//contains()
		System.out.println("contains c = " + col.contains(s1));

		
		System.out.println();
		System.out.println();
		
		
		
		System.out.println("----------<adding duplicates>------------");
	
		String s2 = "php";
		String s3 = "scala";
		
		col.add(s2);
		col.add(s3);
		col.add(s2);
		col.add(s2);
		col.add(s3);
		
		System.out.println(col);
		
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("----------<removing duplicates>------------");
		
		while(col.remove(s2));
		while(col.remove(s3));
		
		System.out.println(col);
		
		
		Collection col2 = new HashSet();
		
		//col2.add("Java");
		col2.add("JavaScript");
		col2.add("html");
		col2.add("css");
		col2.add("python");
		col2.add("c");
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("----------<printing col2>-------------------");
		System.out.println(col2);
		
		System.out.println();
		System.out.println();
		
		System.out.println("----------<col.addAll(col2)>-------------------");
		
		System.out.println(col.addAll(col2)); 
		System.out.println(col);
		
		
		
		System.out.println();
		System.out.println();
		
		System.out.println("----------<col.retainAll(col2)>-------------------------");
		//System.out.println(col.retainAll(col2));
		System.out.println(col);
		
		System.out.println();
		System.out.println();
		
		System.out.println("----------<col.removeAll(col2)>-------------------------");
		System.out.println(col.removeAll(col2));
		System.out.println(col);
		
		
		
		
	}

}
