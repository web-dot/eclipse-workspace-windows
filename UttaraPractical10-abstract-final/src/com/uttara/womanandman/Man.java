package com.uttara.womanandman;

public class Man {
	private String name;
	private Woman wife;
	private boolean hasWife = false;
	
	public void eat() {
		System.out.println("Man eating");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Woman getWife() {
		return wife;
	}

	public void setWife(Woman wife) {
		this.wife = wife;
	}
	

	public boolean getHasWife() {
		return hasWife;
	}
	
	public void setHasWife(boolean hasWife) {
		this.hasWife = hasWife ;
	}

	public void marry(Woman wife) {
		if(!hasWife) {
			this.wife = wife;
			hasWife = true;
			this.wife.setHasHusband(true);
			this.wife.setHusband(this);
			System.out.println("I am " + name + ", I just married " + wife.getName());
		}
		else {
			System.out.println("change hasWife to false to marry again!!!");
		}
	}
	
	public void printWife() {
		if(hasWife) {
			System.out.println("I am " + name + ", " + wife.getName() + " is my Wife");;
		}
		else {
			System.out.println("You need to marry to have a Wife");
		}
	}
	
	public void divorce() {
		hasWife = false;
		System.out.println("I am " + name + ", me and " + this.wife.getName() + " are happily divorced now!!!");
	}
	
	
}
