package com.io.classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortWordsInFile {
	public void sortWords(String path) {
		if(path == null) {
			throw new NullPointerException();
		}
		File f = new File(path);
		if(f.exists() && f.isDirectory()) {
			File[] files = f.listFiles();
			for(File file : files) {
				if(file.exists() && file.isFile() && file.getName().endsWith(".txt")) {
					BufferedReader br = null;
					String line;
					try {
						br = new BufferedReader(new FileReader(file));
						List<String> list = new ArrayList<String>();
						Set<String> set = new TreeSet<String>();
						while((line = br.readLine()) != null) {
							String[] sa = line.split(" ");
							for(String s : sa) {
								list.add(s);
								set.add(s);
							}
							Collections.sort(list);
							System.out.println("words sorted with dupli : " + list);
							System.out.println("words sorted without dupli : " + set);
						}
						
					}catch(IOException e) {
						e.printStackTrace();
					}finally {
						if(br != null) {
							try {
								br.close();
							}catch(IOException e) {e.printStackTrace();}
						}
					}
				}
			}
		}
	}
}
