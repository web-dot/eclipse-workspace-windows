package com.collections.collectionrecap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
public class TestEmployee {

	public static void main(String[] args) {
		
		//create Employee objects
		Employee e1 = new Employee("Ashish Ngarkar", "0018", 23);
		Employee e2 = new Employee("Binoy Jain", "0011",35);
		Employee e3 = new Employee("Chetan Pawar", "0015",24);
		Employee e4 = new Employee("Ritesh Kulkarni", "0025",21);
		Employee e5 = new Employee("Dinesh Bhoir", "0033",34);
		Employee e6 = new Employee("Krishna Doshi", "0021",27);
		Employee e7 = new Employee("Sunil Salian", "0043",45);
		Employee e8 = new Employee("Lohit Nagarkar", "0003",35);
		
		
		//Set<Employee> eSet = new TreeSet<Employee>();
		Set<Employee> eSet2 = new TreeSet<Employee>(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8));
		//eSet2 = Collections.unmodifiableSet(eSet2);
		
		/*
		for(Employee e : eSet2) {
			String name = e.name;
			System.out.println(name);
		}*/
		
		//Set<Employee> eSet3 = new TreeSet<Employee>(new EmployeeNameComparator());
		
		Set<Employee> eSet = new TreeSet<Employee>(new EmployeeIdComparator());
		eSet.add(e1);
		eSet.add(e2);
		eSet.add(e3);
		eSet.add(e4);
		eSet.add(e5);
		eSet.add(e6);
		eSet.add(e7);
		eSet.add(e8);
		
		
		for(Employee e : eSet) {
			String name = e.name;
			String id = e.id;
			System.out.println("name : " + name + " id : " + id);
		}
		
		//iterator
		Iterator<Employee> iterEmp = eSet.iterator();
		while(iterEmp.hasNext()) {
			Employee e = iterEmp.next();
			String name = e.name;
			System.out.println(name);
			System.out.println(e);
			iterEmp.remove();
			System.out.println(e);
		}
	}

}
