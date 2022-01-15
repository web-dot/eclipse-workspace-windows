package com.uttara.classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LetterCountJob implements Runnable{
	
	String path;
	int count;
	
	public LetterCountJob(String path) {
		this.path = path;
	}
	
	@Override
	public void run() {
		if(path == null) {
			throw new IllegalArgumentException("path is invalid");
		}
		File f = new File(path);
		if(f.exists() && f.isDirectory()) {}
			File[] files = f.listFiles();
			for(File file : files) {
				if(file.exists() && file.isFile() && file.getName().endsWith(".txt")) {
					BufferedReader br = null;
					String line;
					try {
						br = new BufferedReader(new FileReader(file));
						while((line = br.readLine()) != null) {
							for(int i=0; i<line.length(); i++) {
								char c = line.charAt(i);
								if(c >= 65 && c <= 90 || c >= 97 && c <= 122) {
									count++;
								}
							}
						}
					}catch(IOException e) {
						e.printStackTrace();
					}finally {
						try {
							if(br != null) {
							br.close();
							}
						}catch(IOException e) {e.printStackTrace();}
					}
				}
			}
		}
	
	
	public int getCount() {
		return count;
	}
	
	
	
	
	
	
	
	
}
