package com.uttara.practical04;

//Duck.java methods are invoked in TestDuck -> main()

public class Duck {
	private int tailSize;
	public void setTailSize(int tailSize) {
		if(tailSize > 0) {
		this.tailSize = tailSize;
		}
		else {
			System.out.println("tailsize can not be negetive");
		}
	}
	public int getTailSize() {
		return this.tailSize;
	}
	public void swim() {
		System.out.println("I am a Duck,with tail size : " + this.tailSize + " swimming in cool water!!!");
	}
	
}	
