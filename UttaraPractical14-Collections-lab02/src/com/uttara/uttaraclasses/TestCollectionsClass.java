package com.uttara.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollectionsClass {

	public static void main(String[] args) {
		
		List songs = new ArrayList();
		
		songs.add("HammaHamma");
		songs.add("HumTum");
		songs.add("HumTum");
		songs.add("HumTum");
		songs.add("Dilwale...");
		songs.add("Chaiya Chaiya");
		songs.add("ApunTupunKoPyarKarega");
		
		String s1 = new String("Chaiya Chaiya"); 
				
		boolean b = songs.contains(s1);// implements linear seq search
		
		System.out.println("before sorting songs = "+songs);
		
		Collections.sort(songs);

		System.out.println("after sorting songs = "+songs);
		
		System.out.println("bin search for s1 = "+Collections.binarySearch(songs, "Hum"));
		
		Collections.shuffle(songs);
		
		System.out.println("after shuffling songs = "+songs);
		
		Collections.reverse(songs);
		
		System.out.println("after reversing songs = "+songs);
	
		String s2 = new String("HumTum");
		
		System.out.println("num of times s2 exists in songs coll = "+Collections.frequency(songs, s2));
	
		System.out.println("songs before rotation "+songs);
		Collections.rotate(songs, 2);
		System.out.println("songs after rotation "+songs);
		
	}

}







