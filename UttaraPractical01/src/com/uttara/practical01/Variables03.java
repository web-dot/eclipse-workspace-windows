package com.uttara.practical01;

public class Variables03 {

	public static void main(String[] args) {
		
		
		System.out.println("--------------e------------------");
					
		byte b = 100;
		b = -128; 
		System.out.println(b);
		
		System.out.println("--------------f------------------");
		
		byte a = 50;
		int x = b;
		//a = x; //incompatible data type conversion
		
		
		System.out.println("--------------g------------------");
		
		a = (byte)x;
		
		short s = 32000;
		char c = 55000;
		
		
		//smaller d.t to bigger d.t
		int j = c;
		j = s;
		j = a;
		long l = c;
		l = s;
		l = a;
		float f = c;
		f = s;
		f = a;
		double d = c;
		d = s;
		d = a;
		
		//bigger d.t to smaller d.t
		//int to short,byte,char
		s = j;
		c = j;
		a = j;
		
		//long to short,byte,char
		s = l;
		c = l;
		a = l;
		
		//float to short,byte,char
		s = f;
		c = f;
		a = f;
		
		//double to short,byte,char
		s = d;
		c = d;
		a = d;
		
		
		//double to float
		f = d;
		//float to long
		l = f;
		//int to char
		c = j;
		//char to byte
		a = c;
		//long to int
		j = l;
		//short to byte
		a = s;
		
		
		
		System.out.println("--------------f------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
