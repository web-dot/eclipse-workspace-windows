package com.uttara.test;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class TestMaps {

	public static void main(String[] args) {
		
		Map<String,String> friends = new LinkedHashMap<String,String>();
		
		System.out.println("adding entry to map..."+friends.put("anand", "monu"));
		System.out.println("adding entry to map..."+friends.put("ameeth", "sonu"));
		System.out.println("adding entry to map..."+friends.put("vinay","binnz"));
		System.out.println("adding entry to map..."+friends.put("nandan","endo"));
		System.out.println("adding entry to map..."+friends.put("Jnanesh","jnans"));
		
		System.out.println(friends);
		System.out.println("adding duplicate entry to map..."+friends.put("vinay","binnybonds"));
		friends.remove("ameeth");
		System.out.println(friends);
		
		System.out.println("size = "+friends.size() );
		
		String input="";
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		/*
		while(!input.equals("done"))
		{
			System.out.println("Existing friends "+friends);
			System.out.println("Enter name of friend(done to end)");
			input = sc2.nextLine();
			
			System.out.println("Existing petName for "+input  + " = "+friends.get(input));
			if(friends.get(input)==null)
			{
				System.out.println("Enter petname of friend");
				String pN = sc2.nextLine();
				friends.put(input, pN);
			}
			
		}
		*/
		
		Set<Entry<String,String>> entries = friends.entrySet();
		
		for(Entry e : entries)
		{
			System.out.println("key = "+e.getKey() + " value = "+e.getValue());
		}
		
		System.out.println("enter name to search...");
		String in = sc2.nextLine();
		
		System.out.println("search ouput in keys = "+friends.containsKey(in)+" "+(friends.containsKey(in)?friends.get(in):null));
		
		System.out.println("enter petname to search");
		in = sc2.nextLine();
		
		System.out.println("searching in petnames = "+friends.containsValue(in));
		
		System.out.println("Give input of part name to search");
		in = sc2.nextLine();
		
		Set<Entry<String,String>> en = friends.entrySet();
		for(Entry<String,String> e : en)
		{
			String name = e.getKey();
			String pn = e.getValue();
		
			if(name.contains(in))
				System.out.println("Match found "+name + " "+pn);
		}
		
		Set<String> names = friends.keySet();
		Collection<String> petNames = friends.values();
		
		
	}
}








