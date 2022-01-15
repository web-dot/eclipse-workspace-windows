package com.collections.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CountryAndCapitals {

	public static void main(String[] args) {

		System.out.println("Country and Capital app");

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		int choice = 0;
		Map<String, String> map = new TreeMap<String, String>();
		String token;
		
		while (choice != 6) {

			System.out.println("Press 1 to Enter Country and Capital");
			System.out.println("Press 2 to display Country and Capitals");
			System.out.println("Press 3 to enter Country to search Capital");
			System.out.println("Press 4 to sort based on Country(key)");
			System.out.println("Press 5 to sort based on Capital(value)");
			System.out.println("Press 6 to exit app");
			choice = sc1.nextInt();
			
			switch (choice) 
			{

			case 1:
					System.out.println(
					        "Enter Country name follwed by space followed by Capital name, do not reverse order or things will go bonkers!");
					token = sc2.nextLine();
					String sa[] = token.split(" ");
					map.put(sa[0], sa[1]);
					System.out.println(map);
					break;
			case 2:
					for (String s : map.keySet()) {
						String con = s;
						String cap = map.get(s);
						System.out.println(con + " : " + cap);
					}
					break;
			case 3:
					System.out.println("Enter country name to search capital");
					token = sc2.nextLine();
					for (String s : map.keySet()) {
						String con = s;
						if (s.equals(token)) {
							System.out.println("capital of " + s + " is, " + map.get(s));
						}
					}
					break;
			case 4:
					System.out.println("sorting based on Country name");
					System.out.println(map);
					break;
			case 5:
					System.out.println("sorting based on capital");
					Set<String> set = new TreeSet<String>();
					for(String s : map.values()) {
						String cap = s;
						set.add(s);
					}
					Map<String, String> map2 = new HashMap<String, String>();
					Set<String> set2 = map.keySet();
					for(String str : set) {
						String cap = str;
						for(String str2 : set2) {
							String con = str2; 
							if(str == map.get(str2)) {
								map2.put(str, str2);
							}
						}
					}
					for(String s : map2.keySet()) {
						String con = map2.get(s);
						String cap2 = s;
						System.out.println("countr : " + con + " and " + " capital : " + cap2);
					}
					
					
					break;
			case 6: 
					System.out.println("Exiting App, Thank you for using!!");
					break;
			default:
					System.out.println("Enter a number between 1 and 6, no more no less!!");
					break;
			}
		}
	}
}
