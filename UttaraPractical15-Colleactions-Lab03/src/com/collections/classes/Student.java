package com.collections.classes;

import java.time.Year;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Student implements Comparable<Student>{
	String name;
	public String dob;
	String email;
	public String id;
	
	public Student(String name, String dob, String email, String id) {
		if(name == null || name.equals(" ") || email == null || email.endsWith(" ") || id == null || id.equals(" ")) {
			throw new IllegalArgumentException();
		}
		else {
			this.name = name;
			this.email = email;
			this.id = id;
		}
		
		String[] da = dob.split("/");
		int year = YearMonth.now().getYear();
		int month = YearMonth.now().getMonthValue();
		if(Integer.parseInt(da[1]) >= month || Integer.parseInt(da[2]) >= year) {
			System.out.println("Date or Year can not be in future");
		}
		else {
			this.dob = dob;
		}
	}
	
	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}
	
	//natural order based on name(String compareTo())
	@Override
	public String toString() {
		return "Student [name=" + name + ", dob=" + dob + ", email=" + email + ", id=" + id + "]";
	}
	
	
	
}