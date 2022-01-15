package com.io.classes;

import java.io.File;

public class PrintTextFileNames {
	public static void printFileNames(String path) {
		if(path == null) {
			throw new NullPointerException();
		}
		File f = new File(path);
		if(f.exists() && f.isDirectory()) {
			File[] files = f.listFiles();
			for(File file : files) {
				if(file.exists() && file.isFile() && file.getName().endsWith(".txt")) {
					System.out.println(file.getName());
				}
			}
		}
	}
}
