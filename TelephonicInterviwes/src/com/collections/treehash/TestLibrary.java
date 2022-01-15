package com.collections.treehash;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

public class TestLibrary {

	public static void main(String[] args) {	
		
		//TreeSet<> -> Implementation -> Binary sorted Tree
		//[1]Set  ->  no duplicates
		//[2]Tree->   ascending order sorted : 
		//	[A]implement Comparable<T> and override compareTo() method else ClassCastException  -> MANDATORY else
		//	[B]pass Comparator<T> object as parameter to the TreeSet Constructor				-> MANDATORY
		//[3]running time of algorithm -> log time
		//[4]value ordered iteration
		Set<Library> tset = new TreeSet<Library>(new LibraryCopiesComparator());
		
		Library l1 = new Library("JavaCoding", 23);;
		Library l2 = new Library("DSA", 33);
		Library l3 = new Library("CoreJava", 105);
		Library l4 = new Library("OOD", 47);
		Library l5 = new Library("OOP", 72);
		Library l6 = new Library("DSA", 33);
		
		tset.add(l1);
		tset.add(l2);
		tset.add(l3);
		tset.add(l4);
		tset.add(l5);
		
		for(Library lib : tset) {
			String name = lib.bookName;
			int copies = lib.copies;
			System.out.println(name + " : " + copies);
		}
		
		System.out.println();

		//HashSet
		//hash table(implementation)
		//no duplicates -> override hashCCode(), equals;
		//random order/ random iteration 
		//constant time
		
		Set<Library> hset = new HashSet<Library>();
		
		hset.add(l2);
		hset.add(l4);
		hset.add(l3);
		hset.add(l6);
		for(Library lib : hset) {
			String name = lib.bookName;
			int copy = lib.copies;
			System.out.println(name + " : " + copy);
		}
		
		System.out.println();
		
		//TreeMap
		//binary sorted tree
		//no duplicates
		//value based order/iteration -> implement Comparable or pass Comparator as constructor
		//ascending sorted order
		//log time 
		Map<Library, Integer> tmap1 = new TreeMap<Library, Integer>();
		
		Library l7 = new Library("history book", 13, 200);
		Library l8 = new Library("history book", 13, 200);
		
		tmap1.put(l8, l8.pages);
		tmap1.put(l7, l7.pages);
				
		Set<Library> set1 = tmap1.keySet();
				
		for(Library lib : set1) {
			String name = lib.bookName;
			System.out.println(name);
		}
		
		System.out.println();
		
		//[1]TreeMap -> key/value associations
		//[2]binary sorted tree
		//[3]no duplicate keys -> MUST implement Comparable or pass Comparator as constructor or ClassCastEx
		//[4]key/value associations sorted based on the value of the key
		//[5]value ordered iteration
		//[6]ascending sorted order
		//[7]log time
		
		//TreeMap -> binary sorted tree -> key/value associations -> no duplicate keys -> k/v associations 
		//sorted based on keys -> object of class must implement Comparable and override compareTo() or
		// a Comparator object must be passed to the TreeMap constructor
		Map<Laboratory, String> tmap2 = new TreeMap<Laboratory, String>(new LaboratoryStockComparator().thenComparing(new LaboratoryMedNameComparator()));

		
		Laboratory la1 = new Laboratory("painkiller", 100, "200mg");
		Laboratory la2 = new Laboratory("analgesic", 102, "150mg");
		Laboratory la3 = new Laboratory("sleep med", 150, "300mg");
		Laboratory la4 = new Laboratory("coughcold", 200, "300mg");
		
		tmap2.put(la1, la1.power);
		tmap2.put(la2, la2.power);
		tmap2.put(la3, la3.power);
		tmap2.put(la4, la4.power);
		
		Set<Laboratory> set2 = tmap2.keySet();
		for(Laboratory lab : set2) {
			String name = lab.medName;
			String power = lab.power;
			int stock = lab.stock;
			System.out.println(lab.medName + " : " + lab.power + " : " + stock);
		}
		
		System.out.println("hashmap");
		
		
		//HashMap
		//key/value associations
		//linked list running through hash table(implementation)
		//no duplicates -> override hashCCode(), equals;
		//random order/ random iteration 
		//constant time
		

		//HashMap -> linked list running through hash table -> key/value associations -> no duplicate keys -> no order 
		// -> override hashCode() and equals() inside object class ->
		Map<Laboratory, String> hmap1 = new HashMap<Laboratory, String>();
		
		hmap1.put(la4, la4.power);
		hmap1.put(la3, la3.power);
		hmap1.put(la2, la2.power);
		hmap1.put(la1, la1.power);
		hmap1.put(la1, la1.power);
		
		Set<Laboratory> set3 = hmap1.keySet();
		for(Laboratory lab : set3) {
			String name = lab.power;
			String power = lab.power;
			int stock = lab.stock;
			System.out.println(lab.medName + " : " + lab.power + " : " + stock);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
