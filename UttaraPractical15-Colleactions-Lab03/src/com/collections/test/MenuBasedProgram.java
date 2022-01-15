package com.collections.test;


import com.collections.classes.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MenuBasedProgram {

	public static void main(String[] args) {
		
		
		System.out.println("Your Friend List App(a menu based program)");
		System.out.println();
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int choice = 0;
		List names = new ArrayList();
		String str;
		while(choice != 9) {
			
			System.out.println("Press 1 to add friend names");
			System.out.println("Press 2 to list friend names");
			System.out.println("Press 3 to sort friend names");
			System.out.println("Press 4 to search friend names");
			System.out.println("Press 5 to search part of friends names");
			System.out.println("Press 6 to display unique friend names");
			System.out.println("Press 7 to display non-repeating friend names");
			System.out.println("Press 8 to sort friend names based on length of the names");
			System.out.println("Press 9 to get lost");
			System.out.println("");
			choice = sc1.nextInt();
			
			System.out.println("choice entered = " + choice);
			switch(choice) 
			{
					case 1:	
							System.out.println("Enter friend name");
							str = sc2.nextLine();
							names.add(str);
							System.out.println(names);
							break;
					case 2:
							System.out.println(names);
							break;
					case 3:
							Set ts = new TreeSet(names);
							System.out.println(ts);
							break;
					case 4:
							System.out.println("Enter name to search");
							str = sc2.nextLine();
							System.out.println("checking if " + str + " present in " + names + " = " + names.contains(str));
							break;
					case 5:
							System.out.println("Enter part name to search");
							str = sc2.nextLine();
							for(Object o : names) {
								String s = (String)o;
								if(s.contains(str)) {
									System.out.println("math found " + s);
								}
							}
							break;
					case 6:
							Set hs = new HashSet(names);
							System.out.println(hs);
							break;
					case 7:
							Set nonDupli = new HashSet();
							Set removeSet = new HashSet();
							for(Object o : names) {
								if(nonDupli.add(o) == false) {
									removeSet.add(o);
								}
							}
							nonDupli.removeAll(removeSet);
							System.out.println("unique names in list are :" +  nonDupli);
							break;
					case 8:
							System.out.println("sorting based on length of names");
							Collections.sort(names, new NameLengthComparator());
							System.out.println("sorted names = " + names);
							break;
					case 9:
							System.out.println("Exit");
							break;
					default:
							System.out.println("Yakappa, enter only 1-9");
							break;
			}
		}
	}

}







