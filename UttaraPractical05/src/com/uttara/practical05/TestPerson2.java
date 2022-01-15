package com.uttara.practical05;



class Person2{
	private String name;
	private int age;
	private String[] petNames = new String[20];
	int count = 0;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
			this.age = age;
	}
	public void setPetName(String petName) {
		if(petName != null && petName != " ") {
			for(int i = 0; i < petNames.length; i++) {
				petNames[i] = petName;
			}
		}
		else {
			throw new NullPointerException("kindly enter valid petname");
		}
	}
	
	public void sing() {
		String song = "";
		for(int i = 0; i < petNames.length; i++){
			int n = (int)(20 * Math.random());
			song = song + petNames[n];
		}
		System.out.println(song);
	}
	
	
	public void dance() {
		if(this.age < 0) {
			System.out.println("age can not be negetive");
		}
		if(this.age > 0 && this.age < 25) {
			System.out.println("Person doing Chacha!!");
		}
		else {
			System.out.println("Person dooing Waltz!!");
		}
	}
	
	
	public void addPetName(String n){
		if(count < petNames.length)
		petNames[count++] = n;
		else
		System.out.println("pet name limit exceeded");
	}
}

public class TestPerson2 {

	public static void main(String[] args) {
		
		Person2 p = new Person2();
		p.setPetName("PETNAME1");
		p.setPetName("PETNAME2");
		p.setPetName("PETNAME3");
		p.setPetName("PETNAME4");
		
		p.sing();
		p.dance();
		
		int[][] arr = new int[2][2];
		
		//arr[0] = {1,2};
		
		int[][] arr1 = {{1,2},{2,3}};
		
		arr[0] = new int[] {1,2};
		
		
		

	}

}
