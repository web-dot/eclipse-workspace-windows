package com.collections.test;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import com.collections.classes.*;

public class TestVehicles {

	public static void main(String[] args) {
		
		
		Vehicle v1 = new Vehicle("pulsar", 180);
		Vehicle v2 = new Vehicle("pulsar", 180);
		
		
		System.out.println(v1.equals(v2)); // comparing by identity not equality
		
		
		Vehicle v3 = new Vehicle("bajaj", 100);
		Vehicle v4 = new Vehicle("luna", 50);
		
		System.out.println(v3.equals(v4));  //equals() is working
		
		
		List<Vehicle> list = new ArrayList<Vehicle>();
		
		list.add(v1);
		
		System.out.println();
		System.out.println(list.contains(v2)); //returns true
		
		
		
		System.out.println();
		System.out.println("--------------adding Vehicle objects in HashSet----------------");
		Set<Vehicle> set1 = new HashSet<Vehicle>();
		
		set1.add(v2);
		set1.add(v3);
		set1.add(v4);
		
		Vehicle v5 = new Vehicle("bajaj", 100);
		
		set1.add(v5);
		
		for(Vehicle v : set1) {
			System.out.println(v.name); //duplicates should not be allowed but getting added
		}
		
		System.out.println();
		System.out.println("printing hashcode of duplicates");
		System.out.println();
		System.out.println(v3.hashCode());
		System.out.println(v5.hashCode());
		
		System.out.println();
		
		System.out.println("     : if hashCode() is not overriden : ");
		//when hashCode() is not overridden
		System.out.println("hashcode of different objects returning different values so set will allow them even they are equal in state");
		
		
		System.out.println();
		
		System.out.println("adding Vehicle objects in TreeSet----------------");
		
		
		Set<Vehicle> set2 = new TreeSet<Vehicle>();
		
		
		//shows ClassCastException ---> implement Comparable override compareTo in the Vehicle class
		set2.add(v5);
		set2.add(v4);
		set2.add(v3);
		set2.add(v2);
		set2.add(v1);
		
		System.out.println();
		
		//iterating
		
		System.out.println("iterating");
		for(Vehicle v : set2) {
			System.out.println(v.name + " : " + v.engineCap);
		}
		
		System.out.println();
		System.out.println("no duplicates --> based on compareTo()");
		
		
		
		
		
		
		
		
		
		

	}

}
