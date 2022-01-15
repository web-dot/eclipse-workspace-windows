package com.uttara.lab07;

public class TestWrapper {

	public static void main(String[] args) {
		
			
		//primitive to Wrapper // autoboxing
		
		Byte b = 10;
		Short s = 20;
		Integer i = 30;
		Long l = 40L;
			
		Float f = 1000.00f;
		Double d = 55.55;
		
		
		//Wrapper to primitive
		int i1 = i.intValue();
		short s1 = s.shortValue();
		
		
		//String to primitive
		String str1 = "112244";
		int i3 = Integer.parseInt(str1);
		System.out.println("String to int parse = " + i3);
		
		String str2 = "10.55";
		double dob = Double.parseDouble(str2);
		System.out.println("String to double parse  = " + dob);
		
		
		String str3 = "Hello World";
		//int i4 = Integer.parseInt(str3);// NumberFormatException
		
		
		//primitive to string
		
		//using wrapper class toString() method
		int i5 = 1024;
		String str4 = Integer.toString(i5);
		System.out.println("int to String using toString() = " + str4);
		
		//using String class valueOf() method
		double i6 = 10.55;
		String str5 = String.valueOf(i6);
		System.out.println("souble to String using valueOf() = " + str5);
		
		/*
		 * 
		Byte.parseByte(str2);
		Short.parseShort(str2);
		*/
		
		Character c = 'a';
		
		c.isAlphabetic(c);
		c.isDigit(0);
		c.isLetter(0);
		
		
		
		//STATIC METHODS
		int maxInt = Integer.MAX_VALUE;
		short maxShort = Short.MAX_VALUE;
 		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(i1);
		System.out.println(s1);

	}

}
