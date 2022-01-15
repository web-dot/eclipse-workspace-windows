package com.drive.techround01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ListSetUse01 {
	//given 2 array, return new array containing middle elements
	public static List<Integer> returnMiddle(List<Integer> list1, List<Integer> list2){
		int m1 = list1.get(list1.size()/2);
		int m2 = list2.get(list2.size()/2);
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(m1);
		list.add(m2);
		
		return list;
	}
	
	
	//return  "count" even numbers from the given array
	public static List<Integer> returnCountEven(List<Integer> list, int count){
		List<Integer> newlist = new ArrayList<Integer>();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) % 2 == 0 && newlist.size() < count) {
				newlist.add(list.get(i));
			}
		}
		return newlist;
	}
	
	//return min from list using TreeSet
	public static int findMin(List<Integer> list) {
		
		//create treeset obj
		Set<Integer> set = new TreeSet<Integer>();
		//put elements of list in treeset
		for(Integer i : list) {
			set.add(i);
		}
		
		//create iterator object
		Iterator<Integer> iter = set.iterator();
		//initialize local variable to hold min value
		Integer a = 0;
		//iterate the set only once using for loop to get the first element(iterate twice to get second element)
		for(int i = 0; i < 1; i++) {
			a = iter.next();
		}
		//call intValue on object to convert to int and return
		return a.intValue();
	}
	
	//return min from list using Collections.sort()
	public static int findMinCollSort(List<Integer> list) {
		Collections.sort(list);
		Integer n = list.get(0);
		return n.intValue();
	}
	
	//return second largest from list
	public static int getSecLar(List<Integer> list) {
		Collections.sort(list);
		Integer n = 0;
		n = list.get(list.size()-2);
		return n.intValue();
	}
	
	
	//return unique elements
	public static List<Integer> returnUnique(List<Integer> list){
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		
		for(Integer i : list) {
			if(set1.add(i) == false) {
				set2.add(i);
			}
		}
		set1.removeAll(set2);
		List<Integer> list2 = new ArrayList<Integer>();
		for(Integer i : set1) {
			list2.add(i);
		}
		return list2;
	}
	
	//remove repeating elements
	public static List<Integer> returnRepeating(List<Integer> list){
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		
		for(Integer i : list) {
			if(set1.add(i) == false) {
				set2.add(i);
			}
		}
		List<Integer> list1 = new ArrayList<Integer>();
		for(Integer i : set2) {
			list1.add(i);
		}
		list.removeAll(set2);
		return list;
	}
	
	//return count of each element
	public static void printCount(List<Integer> list) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(Integer i : list) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			}
			else {
				map.put(i, 1);
			}
		}
		System.out.println(map);
	}
	
	//remove with listIterator
	public static void removeListIterator(List<Integer> list) {
		//remove second largest in list
		Collections.sort(list);
		System.out.println(list);
		
		ListIterator<Integer> listIter = list.listIterator();
		while(listIter.hasNext()) {
			Integer i = listIter.next();
			if(i == 7) {
				listIter.remove();
			}
		}
		System.out.println(list);
	}
	
	
	public static void main(String[] args) {
		
		//return middle
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(2,3,4));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(4,5,6));
		System.out.println(returnMiddle(list1, list2));
		
		//return "count" evens from list
		List<Integer> list3 = new ArrayList<Integer>(Arrays.asList(3, 2, 4, 5, 8));
		System.out.println(returnCountEven(list3, 3));
		
		//return mininimum using treeset
		System.out.println(findMin(list3));
		
		//return minimum using Collections.Sort()
		System.out.println(findMinCollSort(list3));
		
		//get second largest
		System.out.println(getSecLar(list3));
		
		//return unique elements from list in new list 
		List<Integer> list4 = new ArrayList<Integer>(Arrays.asList(2,7,3,7,1,9,3));
		System.out.println(returnUnique(list4)); 
		
		//remove repeating elements from same list
		System.out.println(returnRepeating(list4)); 
		
		//get count of each element
		List<Integer> list5 = new ArrayList<Integer>(Arrays.asList(2,7,3,7,1,9,3));
		printCount(list5); 
		
		//remove using listIterator
		removeListIterator(list5);
		
		//get second largest using iteration
		List<Integer> list6 = new ArrayList<Integer>(Arrays.asList(5,7,9));
		
		int max = 0;
		int smax = 0;
		for(Integer i : list6) {
			if(i > max) {
				max = i;
			}
		}
		for(Integer i : list6) {
			if(i > smax && i != max) {
				smax = i;
			}
		}
		System.out.println("smax = " + smax);
		
		
		
		
		
		
	}

}
