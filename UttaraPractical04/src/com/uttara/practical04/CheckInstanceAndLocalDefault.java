package com.uttara.practical04;

class TestDefault{
	String s;
	int i;
	boolean b;
}


public class CheckInstanceAndLocalDefault {

	public static void main(String[] args) {
		TestDefault td1 = new TestDefault();
		System.out.println("string instance default = " + td1.s);
		System.out.println("int instance default = " + td1.i);
		System.out.println("boolean instance default = " + td1.b);
	}

}
