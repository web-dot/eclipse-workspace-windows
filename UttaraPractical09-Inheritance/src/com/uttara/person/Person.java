package com.uttara.person;

public class Person {
	private String name;
	private int age;
	private String[] petNames = new String[20];
	int count = 0;
	
	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String[] getPetNames() {
		return petNames;
	}




	public void addPetNames(String n) {
		if(count < petNames.length) {
			petNames[count++] = n;
		}
		else {
			System.out.println("can not add more than 20 petnames");
		}
	}




	public void dance() {
		if(getAge() < 25) {
			System.out.println("Person doing ChaCha!!");
		}
		else {
			System.out.println("Persson doing Waltz!!!");
		}
	}
	
	
	public void sing() {
		String song = "";
		for(int i = 0; i < petNames.length; i++) {
			int n = (int)(Math.random()*20);
			song = song + petNames[n];
		}
		System.out.println(song);
	}
	
	public boolean searchPetName(String n) {
		//search in petNames array if a name equal to n exists, if yes
		//return true, else return false
		
		for(String s : petNames) {
			
			if(s.equals(n)) {
				return true;
			}
		}
		return false;
	}
	
	
}
