package com.uttara.womanandman;

public class Woman {
	private String name;
	private Man husband;
	private boolean hasHusband = false;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Man getHusband() {
		return husband;
	}

	public void setHusband(Man husband) {
		this.husband = husband;
	}

	public void work() {
		System.out.println("I am a working Woman");
	}
	
	
	
	public boolean isHasHusband() {
		return hasHusband;
	}

	public void setHasHusband(boolean hasHusband) {
		this.hasHusband = hasHusband;
	}

	public void marry(Man husband) {
		if(!hasHusband) {
			this.husband = husband;
			hasHusband = true;
			this.husband.setHasWife(true);
			this.husband.setWife(this);
			System.out.println("I am " + name + ", I just married " + husband.getName());
		}
		else {
			System.out.println("you can not marry");
		}
	}
	
	public void printHubbysName() {
		if(hasHusband) {
			System.out.println("I am " + name + ", " + husband.getName() + " is my Husband");
		}
		else {
			System.out.println("You need to marry to have a Wife");
		}
	}
	
}
