package com.uttara.spring;

public class Juggler implements Performer {
	
	
	//instance variable marked private
	private int numRings = 3;
	
	
	//overloaded constr -> externalize dependency
	public Juggler() {
		System.out.println("in Juggler no argument public constructor");
	}
	
	public Juggler(int numRings) {
		super();
		this.numRings = numRings;
		System.out.println("in Juggler param constr numRings = " + numRings );
	}
	
	
	//setter getter -> externalize dependency
	public int getNumRings() {
		return numRings;
	}
	public void setNumRings(int numRings) {
		this.numRings = numRings;
		System.out.println("in Juggler -> setNumRings() numRings = " + numRings);
	}
	
	//instance overriden method
	public void perform() {
		System.out.println("I am a juggler, juggling " + numRings + " rings.");
	}
	
	//override equals(), hashCode() and toString()
	@Override 
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numRings;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Juggler other = (Juggler) obj;
		if (numRings != other.numRings)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Juggler [numRings=" + numRings + "]";
	}
	
	
	
}
