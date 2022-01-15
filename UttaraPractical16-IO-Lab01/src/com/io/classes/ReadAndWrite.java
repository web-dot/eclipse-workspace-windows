package com.io.classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
	public static void readWrite(String filePath, String writePath) {
		if(filePath == null || writePath == null) {
			throw new NullPointerException();
		}
		File f = new File(filePath);
		if(f.exists() && f.isDirectory()) {
			File[] files = f.listFiles();
			for(File file : files) {
				if(file.exists() && file.isFile() && file.getName().endsWith(".txt")) {
					BufferedReader br = null;
					BufferedWriter bw = null;
					boolean result;
					try {
						br = new BufferedReader(new FileReader(file));
						List<String> list = new ArrayList<String>();
						String line;
						while((line = br.readLine()) != null) {
							list.add(line);
						}
						br.close();
						br = null;
						File f2 = new File(writePath+ "/newFile.txt");
						result = f2.createNewFile();
						bw = new BufferedWriter(new FileWriter(f2));
						if(result) {
							for(String str : list) {
								bw.write(str);
								bw.newLine();
							}
							bw.flush();
						}
					}catch(IOException e) {
						e.printStackTrace();
					}
					finally {
						if(bw != null) {
							try {
								bw.close();
							}
							catch(IOException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
		}
	}
}
