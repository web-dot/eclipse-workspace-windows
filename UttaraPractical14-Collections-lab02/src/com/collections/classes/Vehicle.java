package com.collections.classes;

public class Vehicle implements Comparable<Vehicle>{
	public String name;
	public int engineCap;
	
	public Vehicle(String name, int engineCap) {
		this.name = name;
		this.engineCap = engineCap;
	}
	
	
	//HashSet, LinkedHasSet, HashMap, LinkedHashMap
	@Override
	public int hashCode() {
		System.out.println("in hashCode() of Vehicle");
		String result = name+engineCap;
		return result.hashCode();
	}
	
	//HashSet, LinkedHasSet, HashMap, LinkedHashMap
	@Override
	public boolean equals(Object o) {
		System.out.println("(“Vehicle->equals()->testing…”) " + name + " : " + ((Vehicle)o).name  +" , "+ engineCap  + " : " + ((Vehicle)o).engineCap  );
		if(o instanceof Vehicle) {
			Vehicle v = (Vehicle)o;
			if(name.equals(v.name) && engineCap == v.engineCap) {
				return true;
			}
		}
		return false;
	}


	//TreeSet, TreeMap
	@Override
	public int compareTo(Vehicle v) {
		if(engineCap == v.engineCap) {
			return 0;
		}
		if(engineCap < v.engineCap) {
			return 1;
		}
		else return -1;
	} 
	
	
}









