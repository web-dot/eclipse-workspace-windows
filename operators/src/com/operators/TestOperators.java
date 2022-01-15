package com.operators;
import java.math.*;

public class TestOperators {

	public static void main(String[] args) {
		
		//byte a = 1;
		//short b = 3;
		//short n = a + b;
		
		//double a = Math.pow(2, 32);
		//System.out.println(a);
		
		char c = 'a';
		System.out.println(c);
		int x = c + 1;
		System.out.println(x);
		c = 97;
		System.out.println(c);
		c = 'z';
		x = c;
		System.out.println(x);
		
		//put char into int
		char s = 'd';
		System.out.println((int)s);
		
		int y = 'c' + 'c';
		System.out.println(y);
		
		//literal data types
		//decimal literals - > double, float
		
		double d = 10.0; //10.0 <- double literal // 64 bit IEEE 754
		float f = 10f;	//10f <- float literal // 32 bits
		//static error
		//int y = 10.0; //double literal can not be assigned to int type variable
		//int z = 10f; //float lteral can not be assigned to int type variable
		
		//Integer literals -> integer, long
		int a = 10; 	//integer literal // 32 bit int
		long b = 20l;  //long literal 
		
		
		
		//-----------------------------
		
		// 4 types of int literals
		int ax = 10;
		int ay = 010; //octal
		int az = 0XAB; //hexadecimal
		int aa = 0b1010; //binary
		
		
		//-----------------------------
		// 1 type of double literal
		double da = 20.0;
		
		//-----------------------------
		//1 type of float literal
		float af = 2f;
		
		//---------------------------
		//1 type of long literal
		long h = 20l;
		
		
		int i = 20;
		//byte by = i; //value of i is smaller than byte but as COMPILER DOES NOT EXECUTE this will not compile
		byte bt = (byte) i; // this will compile
		
		long l = (byte)(long)(int)(short)bt;
		
		int in = 1000;
		byte be = (byte) in;
		System.out.println(be);		
		
		int z = -7 >>> 2;
		System.out.println(z);
		
	
	}

}
