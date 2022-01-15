package com.uttara.practical08;

public class TestX {

	public static void main(String[] args) {
		

		//---(1)----static field created
		//---(2)----static field initializers executed
		//---(3)----static initializer executed
		//---(4)----instance field created
		//---(5)----instance field initializer executed
		//---(6)----instance initializer executed
		//---(7)----constructor executed
		 
		//CHECK 1
		//X obj1 = new X();
		
		//System.out.println("a = " + obj1.a);
		//System.out.println("b = " + X.b);
		
		//System.out.println();
		
		
		//CHECK 2
		X obj2 = new X(100);
		
		System.out.println("as constructpr is executed last, value of a = 100");
		System.out.println("a = " + obj2.a);
		System.out.println("b = " + X.b);
		
		
		System.out.println();
		
		X.process(5);
		X.process(5L);
		//X.process(5.5);//  can not accept 5.5 as parameter
		X.process(5.5f);
		Long l1 = 1050L;
		X.process(l1);
		
		
		
		System.out.println();
		
		Byte b1 = 12;
		X.process(b1);
		
		Short s1 = 22;
		X.process(s1);
		
		
		short s2 = 12;
		X.process(s2);;
		
		
		
		
		
	}

}
