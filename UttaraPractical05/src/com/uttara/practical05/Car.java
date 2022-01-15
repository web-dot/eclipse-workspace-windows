package com.uttara.practical05;

public class Car {
	String name;
	int fuel;
	boolean ifStarted;
	boolean isDriving;
	
	public void start() {
		if(this.fuel < 0) {
			System.out.println("fuel can not be negetive");
		}
		else if(fuel == 0) {
			this.stop();
		}
		else {

			System.out.println("The car has started");
			ifStarted = true;	
		}
	}
	
	public void drive() {
		if(fuel == 0) {
			this.stop();
		}
		else if(ifStarted == false) {
			System.out.println("Please start the car to drive");
		}
		else if(ifStarted = true) {
			isDriving = true;
			System.out.println("Car is moving forward and also fuel is reduced by 1");
			fuel--;
		}
	}
	
	public void reverse() {
		if(ifStarted == false) {
			System.out.println("kindly start the car to reverse");
		}
		else if(ifStarted == true) {
			System.out.println("Car is reversing also fuel is reduced by 1");
			fuel--;
		}
	}
	
	public void stop() {
		if(fuel < 0) {
			System.out.println("fuel can not be negetive");
		}
		else if(fuel == 0) {
			System.out.println("Kindly refuel to start or stop or drive");
		}
		else if(isDriving == false) {
			System.out.println("start the car to stop or drive");
		}
		else if(ifStarted == false) {
			System.out.println("Car is already stopped");
		}
		else if(fuel > 0) {
			System.out.println("Car has stopped");
		}
		ifStarted = false;
	}
	
}
