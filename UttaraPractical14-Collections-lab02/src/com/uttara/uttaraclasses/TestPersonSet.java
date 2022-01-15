package com.uttara.collections;

import java.util.HashSet;
import java.util.Set;

public class TestPersonSet {

	public static void main(String[] args) {
		
		Person p1 = new Person("Diggu",160);
		Person p2 = new Person("Diggu",160);
		
	//	System.out.println("is p1 eq to p2 "+(p1.equals(p2)));
		Set persons = new HashSet();
	//	List al = new ArrayList();
	//	al.add(p1);
	//	System.out.println("is p2 existing in al ? "+al.contains(p2));

		System.out.println("p1.hashCode() = "+p1.hashCode());
		System.out.println("p2.hashCode() = "+p2.hashCode());
		
		System.out.println("adding "+p1+" to hs = "+persons.add(p1));
		System.out.println("adding "+p2+" to hs = "+persons.add(p2));
		
	}

}
class Person
{
	String name;
	int ht;
	
	public Person(String name, int ht) {
		super();
		this.name = name;
		this.ht = ht;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Person)
		{
			Person p = (Person) obj;
			System.out.println("in Person equals()-> comparing this.name "+name+" with p.name "+p.name+" and this.ht "+this.ht+" with p.ht "+p.ht);
			
			if(this.name.equals(p.name) && this.ht == p.ht)
				return true;
		}
		return false;
	}
	@Override
	public String toString() {
		
		return "Person:"+name+","+ht;
				
	}
	
	@Override
	public int hashCode() {

		/*
		 * check what state var we are using in equals()
		 * all those var, contat to a string and invoke hashCode()
		 * what is returned, return it to invoker of this method!
		 */
		int x = (name+ht).hashCode();
		System.out.println("in Person->hashCode() returning value = "+x);
		return x;
			
	}
}







