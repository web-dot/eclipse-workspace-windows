package com.collections.collections;

import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class BulkTest {

	public static void main(String[] args) {
		
		LinkedList col = new LinkedList();
		String[] sa1 = {"ich", "ni", "san", "shi", "go", "ruk", "sichi", "hachi", "ku", "ju"};
		for(String str : sa1) {
			col.add(str);
		}
		System.out.println("col = " + col.toString());
		
		Set settu = new TreeSet();
		String[] sa2 = {"ondh", "san", "shi", "yerad"};
		for(String str : sa2) {
			settu.add(str);
		}
		System.out.println("settu = " + settu.toString());
		System.out.println();
		
		
		System.out.println("calling removeAll() before adding settu = " + col.removeAll(settu));
		col.addAll(settu);
		System.out.println("calling removeAll() after adding settu = " +col.removeAll(settu));
		
		int[][] arr = new int[3][];
		
		arr[0] = {2,3,4};
		
		

	}

}
