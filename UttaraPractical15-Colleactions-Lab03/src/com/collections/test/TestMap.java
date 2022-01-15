package com.collections.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		//putting entries
		map.put("java", "spring");
		map.put("node", "express");
		map.put("python", "flask");
		map.put("php", "laravel");
		
		//getting value
		System.out.println(map.get("java"));
		System.out.println(map.get("python"));
		
		//removing entry
		map.remove("php");
		System.out.println(map);
		
		//keyset
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		////values
		Collection<String> values = map.values();
		System.out.println(values);
		
		
		
	}

}
