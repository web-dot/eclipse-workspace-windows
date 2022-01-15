package com.uttara.practical03;

import java.util.List;
import java.util.ArrayList;

public class CheckIfSame {
	
	//WAP to check if two numbers has same digits
	public static void checkIfSame(int a, int b) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		int count1 = 0;
		while(a > 0) {
			int rem1 = a % 10;
			int rem2 = b % 10;
			list1.add(rem1);
			list2.add(rem2);
			a = a / 10;
			b = b / 10;
			count1++;
		}
		int count2 = 0;
		for(int i = 0; i < count1; i++) {
			for(int j = 0; j < list2.size(); j++) {
				if(list1.get(i) == list2.get(j)) {
					count2++;
				}
			}
		}
		System.out.println(count1);
		System.out.println(count2);
		if(count2 >= (count1)) {
			System.out.println("same digits");
		}
		else {
			System.out.println("different digits");
		}
	}
	public static void main(String[] args) {
		
		checkIfSame(112, 122);
		checkIfSame(3745, 3745);
	}

}
