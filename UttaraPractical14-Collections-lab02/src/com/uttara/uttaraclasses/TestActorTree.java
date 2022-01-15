package com.uttara.collections;

import java.util.Set;
import java.util.TreeSet;

public class TestActorTree {

	public static void main(String[] args) {
		
		Actor a1 = new Actor("Sonakashi",6,30);
		Actor a2 = new Actor("Alia",5,22);
		Actor a3 = new Actor("Athiya Shetty",1,20);
		Actor a4 = new Actor("Aamir",55,60);
		Actor a5 = new Actor("Aamir",55,60);
		
		Set actors = new TreeSet();
		actors.add(a1);
		actors.add(a2);
		actors.add(a3);
		actors.add(a4);
		actors.add(a5);

		System.out.println(actors);
		
	}
}
class Actor implements Comparable
{
	private String name;
	private int numOfFilms;
	private int age;
	
	public Actor() {
		// TODO Auto-generated constructor stub
	}
	
	public Actor(String name, int numOfFilms, int age) {
		super();
		this.name = name;
		this.numOfFilms = numOfFilms;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumOfFilms() {
		return numOfFilms;
	}
	public void setNumOfFilms(int numOfFilms) {
		this.numOfFilms = numOfFilms;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Actor [name=" + name + ", numOfFilms=" + numOfFilms + ", age="
				+ age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numOfFilms;
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
		Actor other = (Actor) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numOfFilms != other.numOfFilms)
			return false;
		return true;
	}
	
	
	@Override
	public int compareTo(Object o) {
		
		if(o instanceof Actor)
		{
			Actor a = (Actor) o;
			
			return this.name.compareTo(a.name);
		}
		else
			throw new IllegalArgumentException("Actor can be compared with only Actor, you reactor!!");
	}
}













