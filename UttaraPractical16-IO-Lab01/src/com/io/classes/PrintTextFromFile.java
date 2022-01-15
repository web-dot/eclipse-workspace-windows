package com.io.classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class PrintTextFromFile {
	public static void printTextFromFile(String path) {
		if(path == null) {
			throw new NullPointerException();
		}
		File f = new File(path);
		if(f.exists() && f.isDirectory()) {
			File[] fa = f.listFiles();
			for(File file : fa) {
				if(file.exists() && file.isFile() && file.getName().endsWith(".txt")) {
					LineNumberReader lr = null;
					try {
						lr = new LineNumberReader(new BufferedReader(new FileReader(file)));
						String line;
						while((line = lr.readLine()) != null) {
							System.out.println("line number : " + lr.getLineNumber() + " line : " + line);
						}
					}catch(IOException e) {
						e.printStackTrace();
					}
					finally {
						if(lr != null) {
							try {
								lr.close();
							}catch(IOException e) {e.printStackTrace();}
						}
					}
				}
			}
		}
		else {
			throw new IllegalArgumentException("path not found");
		}
	}
}
