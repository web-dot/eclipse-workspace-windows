package com.recap.methods;

class Overloading {
	//overloaded methods have different method signatures
	//->must have different parameter list
	//may or may not have different return types
	//may or may not have different access levels
	//can not be defined only by defining different types of return types or access levels
	
	//->parameter list 
	//can be different in number
	//can be different in type
	//can be different in position
	
	/*
	//different number of argument list
	double calcAverage(int marks1, int marks2) {
		return (marks1 + marks2)/2;
	}
	
	double calcAverage(int marks1, int marks2, int marks3) {
		return(marks1 + marks2 + marks3) / 3;
	}
	
	//different types of argument list
	double calcAverage(int marks1, double marks2) {
		return (marks1 + marks2) / 2; 
	}
	
	double calcAverage(char marks1, char marks2) {
		return (marks1 + marks2) / 2;
	}
	*/
	
	//different position of argument list
	double calcAverage(double marks1, char marks2) {
		return (marks1 + marks2) / 2;
	}
	
	double calcAverage(char marks1, double marks2) {
		return (marks1 + marks2) / 2;
	}
	
	
	//ambiguous parameter list
	double calcAverage(int marks1, double marks2) {
		return (marks1 + marks2) / 2;
	}
	
	double calcAverage(double marks1, int marks2) {
		return (marks1 + marks2) / 2;
	}
	
	
	
}

public class TestOverloading{
	public static void main(String[] args) {
		
		Overloading o1 = new Overloading();
		o1.calcAverage(10, 20);//ambiguous parameters
		
	}
}