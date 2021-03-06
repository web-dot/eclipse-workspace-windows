package com.arunsir.problems;

import java.util.Arrays;

public class Task03 {
	
	//Task 3
	public static String reverseOrder(String s) {
		//get an String array
		String[] strArr = s.split(" ");
		
		//create an empty string
		String newStr = "";
		
		//check if the string has more than one char
		if(strArr.length <= 1) {
			System.out.println("The string has either only one word or it is a empty string");
		}
		else {
			for(int i = strArr.length-1; i >= 0; i--) {
				//check if there are blank spaces in the string, concat to newStr
				if(!strArr[i].isBlank()) {
					newStr = newStr + strArr[i].trim() + " ";
				}
			}
		}
		return newStr.trim();
	}
	

	public static void main(String[] args) {
		
		String s1 = "the sky is blue";
		String s2 = "hello     world";
		
		System.out.println(reverseOrder(s1));
		System.out.println(reverseOrder(s2));
	}

}
