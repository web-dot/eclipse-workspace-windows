package com.collections.map;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestEmployee {

	public static void main(String[] args) {
	
		Map<Employee, String> map = new TreeMap<Employee, String>(new EmployeeNameComparator());
		Employee e1 = new Employee("alan", 37);
		Employee e2 = new Employee("nagesh", 21);
		Employee e3 = new Employee("ritika", 25);
		Employee e4 = new Employee("sooraj", 32);
		Employee e5 = new Employee("prachi", 26);
		
		map.put(e1, e1.name);
		map.put(e2, e2.name);
		map.put(e3, e3.name);
		map.put(e4, e4.name);
		map.put(e5, e5.name);
		
		//System.out.println(map.values());
		
		//Map<Integer, Integer> map2 = new TreeMap<Integer, Integer>(new EmployeeAgeComparator());
		

		Map<String, Integer> hmap1 = new HashMap<String, Integer>();
		
		hmap1.put(e1.name, e1.age);
		hmap1.put(e2.name, e2.age);
		hmap1.put("sudip", 37);
		
		//System.out.println(hmap1);
		
		Set<Employee> set = new TreeSet<Employee>(new EmployeeAgeComparator());
		set.add(e3);
		set.add(e1);
		set.add(e5);
		//System.out.println(set);
		for(Employee e : set) {
			String name = e.name;
			int age = e.age;
			System.out.println(name + " : " + age);
		}
		
		
		
		
		
		
		
	}

}
