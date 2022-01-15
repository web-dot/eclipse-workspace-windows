package com.uttara.thing;

public class TestThing {

	public static void main(String[] args) {
		
		
		Spanner sp1 = new Spanner();
		sp1.doSomething();
		
		
		Thing thing = sp1;
		thing.doSomething();
		
		Tool tool = sp1;
		tool.doSomething();
		
		
		
		Thing thing2 = new Spanner();
		thing2.doSomething();
		
		
		Tool tool2 =(Tool) thing2;
		tool2.doSomething();
		
		
		System.out.println();
		
		Person p = new Person();
		
		
		Spanner sp2 = new Spanner();
		Vehicle v1 = new Vehicle();
		v1.name = "hero cycle";
		
		
		p.testThing(sp2);
		p.testThing(v1);
		
		
		
		
	}

}
