package com.uttara.collections01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestEmployee {

	public static void main(String[] args) {
		
		
		//creating Employee object with different states
		Employee emp1 = new Employee("Ramu", "ramu@webmail.com");
		Employee emp2 = new Employee("Bhimu", "bhimu@webmail.com");
		
		
		emp1.setDob("11.11.1991");
		emp2.setDob("21.08.1973");
	
		
		//creating Address object
		Address ad1 = new Address("Bengaluru", "ORR", "100", "20030");
		Address ad2 = new Address("Bengaluru", "BANSH", "200", "20010");
		
		Address ad3 = new Address("Bengaluru", "SLKBRD", "300", "20020");
		Address ad4 = new Address("Bengaluru", "BANSH", "300", "20040");
		
		//setting home address
		emp1.setHomeAddress(ad1);
		emp2.setHomeAddress(ad2);
		
		
		//setting office address
		emp1.setOfficeAddress(ad3);
		emp2.setOfficeAddress(ad4);
	

		//creating a Collection of type Set(which checks based on hashcode() which i forgot so had to override hascode())
		Set set1 = new HashSet();
		
		set1.add(emp1);
		set1.add(emp2);		
		
		/*
		 * [1]Employee objects with different added in set
		 * [2]equals() method in Employee class has been overridden
		 * [3]add() method of HashSet will call 
		 * 									[1] hashcode() of Employee class for each object for equality check, 
		 * 										if hashcode of objects are different it will add the elements.
		 * 									[2] if hashcode is same, then it will invoke equals() to check for equality
		 * 
		 * In first Case where two Emp objects with different state is being added, HashSet calls checks hashcode for each object -> adds them in set
		 * In Second case where two Emp objects with same sate is added, HashSet calls hashcode() and as hashcode values are same so it calls equals(),
		 * and as the two objwcts have the same state equals returns true, so it only adds one object to the Set.
		 * */
		System.out.println(set1);
		
		
		
		//creating Employee objects with same state
		Employee emp3 = new Employee("Ramu", "ramu@webmail.com");
		Employee emp4 = new Employee("Ramu", "ramu@webmail.com");
		
		
		emp3.setDob("11.11.1991");
		emp4.setDob("11.11.1991");
		
	
		Set set2 = new HashSet();
		
		set2.add(emp3);
		set2.add(emp4);
		
		System.out.println(set2);
		
		System.out.println();
		
		System.out.println("-----------------invoking Collection methods on ArrayList Object to check equality------------------");
		
		System.out.println();
		System.out.println();
		
		
		//creating a Collection of type ArrayList(which does equality check based on equals() method)
		List list = new ArrayList();
		
		list.add(emp1);
		list.add(emp2);
		
		System.out.println(list);
		
		System.out.println(list.contains(emp1)); 
		
		System.out.println(list.remove(emp1));
		
		
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("---------tried adding Employee object into TreeSet-----------");
		System.out.println("---------ClassCastException-----------");
		System.out.println("---------implement Comparable and override compareTo()----or pass Comparator obj to the TreeSet constructor-------");
		
		//creating a Collection of type TreeSet to check working of equals()
		//Set set3 = new TreeSet();
		
		Employee emp5 = new Employee("Ramu", "ramu@webmail.com");
		Employee emp6 = new Employee("Ramu", "ramu@webmail.com");
		
		//set3.add(emp5);
		//set3.add(emp6);
		
		
		//System.out.println(set3);
		
		
		
		
		
		

	}

}
