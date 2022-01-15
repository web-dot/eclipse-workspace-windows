package com.collections.classes;

import java.util.Arrays;
import java.util.Comparator;

public class StudentDOBComparator implements Comparator<Student> {
	
	@Override
	public int compare(Student o1, Student o2) {
		
		String[] s1 = o1.dob.split("/");
		//System.out.println(Arrays.toString(s1));
		int y1 = Integer.parseInt(s1[2]);
		int m1 = Integer.parseInt(s1[1]);
		
		String[] s2 = o2.dob.split("/");
		//System.out.println(Arrays.toString(s2));
		int y2 = Integer.parseInt(s2[2]);
		int m2 = Integer.parseInt(s2[1]);
		
		
		if(y1 != y2) {
			return y1 - y2;
		}
		else {
			return m1-m2;
		}
	}
}
