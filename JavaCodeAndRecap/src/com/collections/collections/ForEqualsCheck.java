package com.collections.collections;

class A{
	
	void check(Object o) {
		
		System.out.println("in A class check");
	}
}


class B extends A{
	void check(Person p) {
		System.out.println("in B class check");
	}
}


class Person{
	String name = "Ram";
}

class Employee extends Person{
	
}

public class ForEqualsCheck {

	public static void main(String[] args) {
		
		
		Person p = new Person();
		Employee e = new Employee();
		
		B b = new B();
		Integer s = 10;
		Object o = new Object();
		b.check(p);
		

	}

}
