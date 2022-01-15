package com.io.classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PrintMax {
	public void printMax(String path) {
		if(path == null) {
			throw new NullPointerException();
		}
		File f = new File(path);
		if(f.exists() && f.isDirectory()) {
			File[] fa = f.listFiles();
			for(File file : fa) {
				if(file.exists() && file.isFile() && file.getName().endsWith(".txt")) {
					BufferedReader br = null;
					try {
						br = new BufferedReader(new FileReader(file));
						Map<String, Integer> map = new HashMap<String, Integer>();
						String line;
						String maxWord = null;
						while((line = br.readLine()) != null) {
							String[] sa = line.split(" ");
							for(String word : sa) {
								if(map.containsKey(word)) {
									map.put(word, map.get(word) + 1);
								}
								else {
									map.put(word, 1);
								}
							}
							System.out.println(map);
							int max = 0;
							//String maxWord = "";
							for(String s : map.keySet()) {
								String key = s;
								Integer val = map.get(key);
								if(val > max) {
									max = val;
								}
							}
							for(String s : map.keySet()) {
								String key = s;
								if(map.get(key) == max) {
									maxWord = key;
								}
							}
						}
						System.out.println(maxWord);
					}catch(IOException e) {
						e.printStackTrace();
					}finally {
						if(br != null) {
							try {br.close();}catch(IOException e) {e.printStackTrace();}
						}
					}
				}
			}
		}
	}
}
