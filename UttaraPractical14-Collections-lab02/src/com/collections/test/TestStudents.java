package com.collections.test;
import com.collections.classes.Student;
import com.collections.classes.StudentAgeDescendingComparator;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestStudents {

	public static void main(String[] args) {
		
		
		Student s1 = new Student("anil", 12);
		Student s2 = new Student("babu", 14);
		Student s3 = new Student("debu", 20);
		Student s4 = new Student("hari", 25);
		Student s5 = new Student("monu", 30);

		
		Student s6 = new Student("anil", 12);
		
		
		System.out.println("------------>adding and iterating in ArrayList object<------------------");
		System.out.println();
		
		//adding Student objects in a ArrayList object of type ArrayList<Student>  
		List<Student> list = new ArrayList<Student>(Arrays.asList(s1,s2,s3,s4,s5,s6));
		
		//iterating ArrayList object to get one one element
		for(Student s : list) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("------------>adding and iterating in HashSet object<------------------");
		System.out.println();
		
		//adding Student objects in a HashSet object of type HashSet<Student>
		Set<Student> set1 = new HashSet<Student>(Arrays.asList(s1,s2,s3,s4,s5,s6));
		
		//iterating HashSet object to get one one element
		for(Student s : set1) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("    # HashSet #     ");
		System.out.println("duplicate : can not hold");
		System.out.println("iteration : random");
		System.out.println("operations : constant time");
		
		System.out.println();
		System.out.println("------------>adding and iterating in LinkedHashSet object<------------------");
		System.out.println();
		
		//adding Student objects in a LinkedHashSet object of Type LinkedHasSet<Student>
		Set<Student> set2 = new LinkedHashSet<Student>(Arrays.asList(s1,s2,s3,s4,s5,s6));
		
		//iterating LinkedHashSet object to get one one value
		for(Student s : set2) {
			System.out.println(s);
		}
		System.out.println();
		System.out.println("    # LinkedHashSet #     ");
		System.out.println("duplicate : can not hold");
		System.out.println("iteration : insertion ordered");
		System.out.println("operations : nearly constant time");
		
		System.out.println();
		System.out.println("------------>adding and iterating in TreeSet object<------------------");
		System.out.println("          natural sorted order based on age --> compareTo()   ");
		System.out.println();
		
		//adding Student objects in a TreeSet object of type TreeSet<Student>
		Set<Student> set3 = new TreeSet<Student>(Arrays.asList(s1,s2,s3,s4,s5,s6));
		
		//iterating TreeSet object to get one one element
		for(Student s : set3) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("    # TreeSet #     ");
		System.out.println("duplicate : checks based on compareTo()");
		System.out.println("iteration : sorted(natural / Comparable->compareTo() / Comparator->compare())");
		System.out.println("operations : log time");
		
		
		
		
		System.out.println();
		System.out.println();
		
		System.out.println("------------>creating TreeSet and sorting elements while passing StudentDescendAgeComparator<------------------");
		//Set<Student> set4 = new TreeSet<Student>(new StudentNameComparator());			//passing StudentNameComparator to constructor
		Set<Student> set4 = new TreeSet<Student>(new StudentAgeDescendingComparator());		//passing StudentAgeDescendComparator to constructor
		
		//adding elements
		set4.add(s1);
		set4.add(s2);
		set4.add(s3);
		set4.add(s4);
		set4.add(s5);
		set4.add(s6);
		
		
		//iterating TreeSet
		for(Student s : set4) {
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
