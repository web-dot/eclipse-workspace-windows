package com.uttara.practical10;

class NewA{
	static String name = "A";
	
	public NewA() {
		System.out.println("in parameteized constructor of newA");
	}
	
	public static void print() {
		System.out.println("in NewA " + name);
	}
	
}

class B extends NewA{
	static String name = "B";
	
	public B() {
		System.out.println("in parameterized contructor of B");
	}
	
	
	public static void print() {
		System.out.println("in B " + name);
	}
}




public class TestAB {

	public static void main(String[] args) {
		
		
		//printing name using B reference
		B obj = new B();
		System.out.println(obj.name);

		//printing name using NewA reference
		NewA obj2 = new B();
		System.out.println(obj2.name);
		
		//invoke print() using both ref
		obj.print();
		obj2.print();
		
		
		
	}

}
