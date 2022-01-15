package com.io.classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {
	public void removeDuplicates(String path1, String path2) {
		if (path1 == null || path2 == null) {
			throw new NullPointerException();
		}
		File f1 = new File(path1);
		File f2 = new File(path2);
		if (f1.exists() && f2.exists() && f1.isDirectory() && f2.isDirectory()) {
			File[] fa1 = f1.listFiles();
			File[] fa2 = f2.listFiles();
			Map<String, Integer> map = new HashMap<String, Integer>();
			for (File f : fa1) {
				if (f.exists() && f.isFile() && f.getName().endsWith(".txt")) {
					BufferedReader br = null;
					try {
						br = new BufferedReader(new FileReader(f));
						//Map<String, Integer> map = new HashMap<String, Integer>();
						String line;
						while ((line = br.readLine()) != null) {
							String[] sa = line.split(" ");
							for (String s : sa) {
								if (map.containsKey(s)) {
									map.put(s, map.get(s) + 1);
								} else {
									map.put(s, 1);
								}
							}
						}

					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			for (File f : fa2) {
				if (f.exists() && f.isFile() && f.getName().endsWith(".txt")) {
					BufferedReader br = null;
					try {
						br = new BufferedReader(new FileReader(f));
						//Map<String, Integer> map = new HashMap<String, Integer>();
						String line;
						while ((line = br.readLine()) != null) {
							String[] sa = line.split(" ");
							for (String s : sa) {
								if (map.containsKey(s)) {
									map.put(s, map.get(s) + 1);
								} else {
									map.put(s, 1);
								}
							}
						}
						for(String s : map.keySet()) {
							int val = map.get(s);
							if(val == 1) {
								System.out.println(s);
							}
						}

					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
