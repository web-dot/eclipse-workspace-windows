package com.collections.classes;

public class Student implements Comparable<Student> {

	private String name;
	private int id;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		String result = name + age + id;
		return result.hashCode();
	}

	/*
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student s = (Student) obj;
			if (age == s.age && id == s.id && name.equals(s.name)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	*/


	@Override
	public boolean equals(Object o) {
		if(o instanceof Student) {
			Student s = (Student)o;
			if(age == s.age && id == s.id && name.equals(s.name)) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	
	/*
	@Override
	public int compareTo(Student s) {
		if (age  == s.age) {
			return 0;
		}
		if(age  < s.age) {
			return -1;
		}
		else
			return 1;
	}
	*/
	
	@Override
	public int compareTo(Student s) {
		if(age == s.age) {
			return 0;
		}
		if(age < s.age) {
			return -1;
		}
		else
			return 1;
	}
	

	@Override
	public String toString() {
		return "Student : "  + " age : " + age + ", id : " + id +  ", name : " + name;
	}
}
