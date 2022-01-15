package com.uttara.thing;

public interface Thing {
	
	void doSomething(); //implicitly public abstract
}


class Tool implements Thing{
	
	public void doSomething() {
		System.out.println("thing doing something");
	}
}


class Spanner extends Tool{
	
	public void doSomething() {
		System.out.println("spanner doing something");
	}
}


class TubeLight implements Thing{
	public void doSomething() {
		System.out.println("tubelight rendering light");
	};
}


class Vehicle implements Thing {
	
	String name;
	
	public void doSomething() {
		System.out.println("vehicle is driving");
	}
}



class Person{
	
	public void testThing(Thing t) {
		
		t.doSomething();
		
	}
	
}



