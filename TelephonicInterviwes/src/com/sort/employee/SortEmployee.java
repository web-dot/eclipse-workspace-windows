package com.sort.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmployee {

	public static void main(String[] args) {


		List<Employee> list = new ArrayList<Employee>();
		
		
		Employee e1 = new Employee("Fardeen", 32);
		Employee e2 = new Employee("Elina", 35);
		Employee e3 = new Employee("Deepak", 23);
		Employee e4 = new Employee("Chaitanya", 28);
		Employee e5 = new Employee("Anjali", 25);
		Employee e6 = new Employee("Bharti", 20);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		
		
		for(Employee e : list) {
			System.out.print(e.empName + " ");
		}
		
		System.out.println();
	
		Collections.sort(list, new EmpNameComparator());
		
		for(Employee e : list) {
			System.out.print(e.empName + " ");
		}
		
		
		
		
		

	}

}
