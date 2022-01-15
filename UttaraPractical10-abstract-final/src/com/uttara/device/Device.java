package com.uttara.device;

//Device class------------------------------------------
public abstract class Device {
	
	public Device() {
		System.out.println("inside Device no arg constr");
	}
	
	
	public static void test() {
		System.out.println("inside Device static method test");
	}
	
	public abstract void doSomething();
}


//Phone class--------------------------------------------
abstract class Phone extends Device{
	
	public abstract void call(String number);
}


//MobilePhone class---------------------------------------
class MobilePhone extends Phone{
	
	@Override
	public void doSomething() {
		System.out.println("inside MobilePhone doSomething()");
	}
	
	@Override
	public void call(String number) {
		System.out.println("inside MobilePhone call()" + " calling" + number);
		
	}
}

//Person class-------------------------------------------
class APerson{
	String name;
	
	public static void use(Device d) {
		if(d instanceof MobilePhone) {
			MobilePhone m = (MobilePhone)d;
			m.doSomething();
		}
	}
}




















