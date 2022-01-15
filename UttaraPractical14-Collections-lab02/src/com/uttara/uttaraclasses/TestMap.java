package com.uttara.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
		
		Map<String,String> phNums = new TreeMap<String,String>();
		phNums.put("anand", "9804395809");
		phNums.put("ameeth", "4854584985");
		phNums.put("vinay", "9980089909");
		phNums.put("hemes", "4554544555");
		
		System.out.println(phNums);

		String s = phNums.get("hemes");
		System.out.println("hemes value = "+s);
		
		phNums.put("hemes","000000000");
		
		System.out.println("hemes value = "+phNums.get("hemes"));
		
		phNums.remove("ameeth");
		System.out.println(phNums);
		
		String str = "this is a sentence is it a sentence yes it is a sentence";	
		
		Map<String,Integer> occ = new HashMap<String,Integer>();
		String[] words = str.split(" ");
		for(String w : words)
		{
			if(occ.get(w)==null)
			{
				occ.put(w, 1);
			}
			else
			{
				int val = occ.get(w);
				occ.put(w, ++val);
			}
			
		}
		System.out.println(occ);
	}

	
}







