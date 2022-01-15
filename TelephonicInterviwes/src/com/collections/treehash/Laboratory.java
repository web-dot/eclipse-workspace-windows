package com.collections.treehash;

public class Laboratory /*implements Comparable<Laboratory>*/ {
	String medName;
	int stock;
	String power;
	
	public Laboratory(String medName, int stock, String power) {
		this.medName = medName;
		this.stock = stock;
		this.power = power;
	}
	/*
	@Override
	public int compareTo(Laboratory other) {
		if(stock - other.stock < 1) {
			return -1;
		}
		if(stock - other.stock > 1) {
			return -1;
		}
		else {
			return stock - other.stock;
		}
	}	*/
}
