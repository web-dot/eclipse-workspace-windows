package com.uttara.dhrithi;


interface Thing
{
	public void doSomething();  //by default public abstract
}

class Tool implements Thing
{
	
	public void doSomething()
	{
		System.out.println("Thing in use");
	}
}

class Spanner extends Tool
{
	public void doSomething()
	{
		System.out.println("Spanner in use");
	}
}

class Tubelight implements Thing
{
	public void doSomething()
	{
		System.out.println("Tubelight giving light");		
	}
}

class Vehicle implements Thing
{
	public String name;

	public Vehicle(String vehicleName)	
	{
		if(vehicleName == null || vehicleName.trim().equals(""))
		{
			System.out.println("Vehicle name cannot be empty or null.. please proide a name");
			return;
		}
	
		name = vehicleName;
	}
	
	public void doSomething()
	{
		System.out.println(name + " in driving mode");
	}
}

class Person
{
	public String name;

	public Person(String personName)
	{
		if(personName == null || personName.trim().equals(""))
		{
			System.out.println("Person name cannot be empty or null... please proide a name");
			return;
		}

		name = personName;
	}

	public void testThing(Thing t)
	{
		System.out.println(name + " testing");
		t.doSomething();
	}
}

public class TestThing
{
	public static void main(String []args)
	{
		Thing th = new Spanner();
		Person p = new Person("Ramu");

		th.doSomething();
	
		Thing th1 = new Tool();
		th1.doSomething();
		
		Thing th2 = new Tubelight();
		th2.doSomething();

		Thing th3 = new Vehicle("Suzuki");
		th3.doSomething();
		
		p.testThing(th);
		p.testThing(th1);
		p.testThing(th2);
		p.testThing(th3);
	}
}
