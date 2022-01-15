package com.collections.comparator;
import java.util.*;
public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee("sudipto", 37);
		Employee e2 = new Employee("mark", 31);
		Employee e3 = new Employee("kevin", 27);
		Employee e4 = new Employee("michelle", 21);
		Employee e5 = new Employee("priya", 25);
		Employee e6 = new Employee("alan", 37);
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		
		/*
		System.out.println(list.get(0).empName);
		System.out.println(list.get(1).empName);
		System.out.println(list.get(2).empName);
		System.out.println(list.get(3).empName);
		System.out.println(list.get(4).empName);
		System.out.println(list.get(5).empName);
		*/
		
		System.out.println(list.get(0).empAge);
		System.out.println(list.get(1).empAge);
		System.out.println(list.get(2).empAge);
		System.out.println(list.get(3).empAge);
		System.out.println(list.get(4).empAge);
		System.out.println(list.get(5).empAge);
		
		/*java.util.Collections
		 * this class contains several static utility methods for working with collections
		 * the methods are generic - that is they will work for collections of objects of various types
		 * 
		 * takes a comparator as second argument*/
		//Collections.sort(list, new EmployeeNameComparator());
		Collections.sort(list, new EmployeeAgeComparator());
		
		//sort based on multiple fields
		Collections.sort(list, new EmployeeNameComparator().thenComparing(new EmployeeAgeComparator()));
		
		System.out.println();
		
		/*
		System.out.println(list.get(0).empName);
		System.out.println(list.get(1).empName);
		System.out.println(list.get(2).empName);
		System.out.println(list.get(3).empName);
		System.out.println(list.get(4).empName);
		System.out.println(list.get(5).empName);
		*/

		System.out.println(list.get(0).empName + " : " + list.get(0).empAge);
		System.out.println(list.get(1).empName + " : " + list.get(1).empAge);
		System.out.println(list.get(2).empName + " : " + list.get(2).empAge);
		System.out.println(list.get(3).empName + " : " + list.get(3).empAge);
		System.out.println(list.get(4).empName + " : " + list.get(4).empAge);
		System.out.println(list.get(5).empName + " : " + list.get(5).empAge);
		
	}

}
