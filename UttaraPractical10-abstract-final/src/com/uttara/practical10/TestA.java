package com.uttara.practical10;


class A{
	final int p;
	public static final int R = 5;
	public A(int a) {
		p = a;
	}
}




public class TestA {

	public static void main(String[] args) {
		
		//A obj = new A();
		//obj.p = 20; 		//can not assign a value to final variable

		A obj = new A(10);
		System.out.println(obj.p);
		
		System.out.println(A.R);
		
		//A.R = 20;			//can not assign value to final variable
	}

}
