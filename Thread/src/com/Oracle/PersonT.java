package com.Oracle;

 class PersonT {
	String lastName;
	int nameCount = 0;
	public void addName(String name) {
		lastName = name;
		nameCount++;
	}
	nameList.add(name);
	
}

 class msLunch{
	 private long c1 = 0;
	 private long c2 = 0;
	 
	 private Object lock1 = new Object();
	 private Object lock2 = new Object();
	 
	 public void inc1() {
		 synchronized(lock1) {
			 c1++;
		 }
	 }
	 
	 public void inc2() {
		 synchronized(lock2) {
			 c2++;
		 }
	 }
}
 
 
 
 
 
 
 
 
 
 
 
 
 
