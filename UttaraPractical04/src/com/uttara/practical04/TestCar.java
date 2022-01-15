package com.uttara.practical04;

public class TestCar {

	public static void main(String[] args) {
		//start()
		//drive() , reverse() , stop()
		
		
		Car c1 = new Car();
		
		c1.start();
		//System.out.println(c1.ifStarted);
		
		c1.stop();
		
		c1.drive();
		
		c1.reverse();
		
		c1.fuel = 20;
		c1.drive();
		c1.start();
		c1.drive();
		c1.reverse();
		c1.stop();
		c1.stop();
		c1.stop();
		
		c1.drive();
		
		c1.reverse();
		c1.start();
		c1.fuel = 0;
		
		c1.start();
		c1.drive();
		c1.reverse();
		
		c1.start();
		
		
		
		c1.fuel = 20;
		
		c1.start();
		
		c1.drive();
		
		
		c1.reverse();
		
		
		
		
		
		
		
		
		
		
		
		
		
		//c1.fuel=2;
		//c1.drive();
		
		
		
		

	}

}
