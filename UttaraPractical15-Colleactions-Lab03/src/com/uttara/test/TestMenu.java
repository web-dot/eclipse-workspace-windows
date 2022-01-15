package com.uttara.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestMenu {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int ch = 0;
		List names = new ArrayList();
		String str;
		while(ch!=9)
		{
			System.out.println("Press 1 to add friend names");
			System.out.println("Press 2 to list friend names");
			System.out.println("Press 3 to sort friend names");
			System.out.println("Press 4 to search friend names");
			System.out.println("Press 5 to search part friend names");
			System.out.println("Press 6 to display unique friend names");
			System.out.println("Press 7 to display non-repeating friend names");
			System.out.println("Press 8 to sort friend names based on length of the names");
			System.out.println("Press 9 to get lost");
			System.out.println("");
			ch = sc1.nextInt();
			
			switch(ch)
			{
				case 1:	System.out.println("Enter friend name");
						str = sc2.nextLine();
						names.add(str);
						break;
				case 2:	
						System.out.println(names);
						break;						
				case 3:
						Set ts = new TreeSet(names);
					//	ts.addAll(names);
					/*	for(Object o : names)
						{
							String s= (String) o;
							ts.add(s);
							
						}*/
						System.out.println(ts);
					break;
				case 4:
						System.out.println("Enter name to search");
						str = sc2.nextLine();
						System.out.println("checking if "+str+" present in "+names+" = "+names.contains(str));
						break;
				case 5:
						System.out.println("Enter part name to search");
						str = sc2.nextLine();		
						// retrieve the names one at a time
						// check in each name if part-name is present
						// if yes, print it out
						
						for(Object o : names)
						{
							String s = (String) o;
							if(s.contains(str))
								System.out.println("match found "+s);
							
						}
						
						break;
				case 6:
						Set hs = new HashSet(names);
						System.out.println(hs);
						break;
				case 7:
		// abc,abc,xyz,abc => xyz
		// add each ele to set and check return value
		// abc -> true
		// abc -> false -> add this to another set removeSet
		// xyz -> true
		// abc -> true
		// [abc,xyz].removeAll([abc])
					
				Set nonDupli = new HashSet();
				Set removeSet = new HashSet();
				for(Object o : names)
				{
					if(nonDupli.add(o)==false)
					{
						removeSet.add(o);
					}
				}
				System.out.println("nonDupli = "+nonDupli);
				System.out.println("removeSet = "+removeSet);
				nonDupli.removeAll(removeSet);
				System.out.println("non-rep singular ele = "+nonDupli);
					
					
			}
		}
		

	}

}







