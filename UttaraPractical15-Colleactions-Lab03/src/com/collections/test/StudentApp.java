package com.collections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.collections.classes.*;

public class StudentApp {

	public static void main(String[] args) {
		
		System.out.println("Student App");
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int choice = 0;
		String name;
		String dob;
		String email;
		String id;
		
		List<Student> students = new ArrayList<Student>();
		
		while(choice != 5) {
			
			System.out.println("press 1 to add a student");
			System.out.println("press 2 to get student info");
			System.out.println("press 3 to sort students");
			System.out.println("press 4 to sort students based on dob");
			System.out.println("press 5 to exit app");
			choice = sc1.nextInt();
			
			switch(choice) 
			{
				case 1:
						System.out.println("add student");
						System.out.println("enter name");
						name = sc2.nextLine();
						System.out.println("enter email");
						email = sc2.nextLine();
						System.out.println("enter id");
						id = sc2.nextLine();
						System.out.println("enter dob(DD/MM/YYYY)");
						dob = sc2.nextLine();
						Student s1 = new Student(name, dob, email, id);
						students.add(s1);
						System.out.println("student added");
						break;
				case 2:
						System.out.println("Enter student id to get info");
						id = sc2.nextLine();
						for(Student student : students) {
							if(student.id.equals(id)) {
								System.out.println(student.toString());
							}
						}
						break;
				case 3:
						System.out.println("sorting students");
						Collections.sort(students);
						System.out.println(students);
						break;
				case 4:
						System.out.println("sorting based on dob");
						Collections.sort(students, new StudentDOBComparator());
						System.out.println(students);
						break;
				case 5:
						System.out.println("Exiting app");
						break;
				default:
						System.out.println("Invalid input!!");
						
						
			}
			
		}
		
		
	}

}














