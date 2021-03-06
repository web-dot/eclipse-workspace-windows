
package com.uttara.dhrithi;

abstract class Device
{
	//Can have both abstract classes and non-abstract classes
	String device_name;
	
	Device(String d)
	{
		device_name = d;
	}

	public Device()
	{
		System.out.println("In device no-arg constructor");
	}
	
	//static method can be invoked directly... will be executed without creating object....cannot create object for abstract class!!
	public static void print()
	{
		System.out.println("Device is used to monitor");	
	}
	
	//Abstarct method
	public abstract  void doSomething();
}

abstract class Phone extends Device
{
	String phone_name;
	
	Phone(String pname, String dname)
	{
		super(dname);
		phone_name = pname;
	}

	public abstract void call(String pno);
}

class Mobile extends Phone
{
	Mobile(String pname, String dname)
	{
		super(pname, dname);
	}
	public void doSomething()
	{
		System.out.println(phone_name + " mobile doing something");	
	}
	
	public void call(String pno)
	{
		System.out.println(phone_name + " mobile calling... " + pno);	
	}
}

class personTester
{
	String name;
	
	personTester(String n)
	{
		name = n;
	}

	public void use(Device d)
	{
		d.doSomething();
		if(d instanceof Mobile)
		{
			Mobile m = (Mobile)d;
			m.call("912345678");
		}
	}
}

public class TestDevice
{
	public static void main(String []args)	
	{
		//Device is an abstract class. Cannot create object
		//Device d = new Device();

		//One of the use of abstract class : can invoke static members directly if it exists!!
		Device.print();
		
		Device d = new Mobile("Samsung", "Device");
		personTester tp = new personTester("Repair Engineer Mohan");
		
		tp.use(d);
	}
	
}

