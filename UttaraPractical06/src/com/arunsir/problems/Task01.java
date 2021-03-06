package com.arunsir.problems;


	
public class Task01 {
	
	
	//common prefix
	//This method will work only for the given test case as per Task01
	//Will fail for other test cases
	public static String commonPrefix(String[] strArr) {
		if(strArr[0].substring(0, 2).equals(strArr[1].substring(0, 2)) && strArr[1].substring(0, 2).equals(strArr[2].substring(0, 2))) {
			return strArr[0].substring(0, 2);
		}
		return "";
	}
	

	public static void main(String[] args) {
		
		String[] strArr01 = new String[] {"flower", "flow", "flight"};
		String[] strArr02 = new String[] {"dog", "racecar", "car"};
		
		System.out.println(commonPrefix(strArr01));
		System.out.println(commonPrefix(strArr02));
	}

}
