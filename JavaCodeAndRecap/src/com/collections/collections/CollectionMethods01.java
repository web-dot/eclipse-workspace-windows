package com.collections.collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionMethods01 {
	
	
	public static void main(String[] args) {
		
		ArrayList coll = new ArrayList();
		
		for(String str : args) {
			coll.add(str);
		}
		System.out.println("size = " + coll.size());
		System.out.println("coll = " + coll.toString());
		
//		for(Object o : coll) {
//			String str = (String)o;
//			System.out.println(str);
//		}
		
		System.out.println(coll.contains("long"));
		System.out.println(coll.remove("long"));
		System.out.println("coll = " + coll.toString());
		System.out.println(coll.size());
		System.out.println(coll.isEmpty());
		Object[] arr = coll.toArray();
		System.out.println(arr);
		
		
		
	}
}
