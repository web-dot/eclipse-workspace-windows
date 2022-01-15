package com.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestFriendsName {

	public static void main(String[] args) throws IOException {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a path");
		String path = sc.nextLine();
		
		File f = new File(path);
		if(f.exists() && f.isDirectory()) {
			File[] fa = f.listFiles();
			for(File file : fa) {
				if(file.exists() && file.isFile() && file.getName().endsWith(".txt")) {
					BufferedReader br2 = null;
					BufferedWriter bw = null;
					String line;
					List<String> list = new ArrayList<String>();
					try {
						br2 = new BufferedReader(new FileReader(file));
						while((line = br2.readLine()) != null) {
							String[] sa = line.split(" ");
							for(String s : sa) {
								System.out.println(s);
								System.out.println("Enter name to edit");
								String nameToEdit = br2.readLine();
								System.out.println("Enter new name");
								String newName = br2.readLine();
								List<String> contents = new ArrayList<String>();
								for(String name : sa) {
									if(!name.equals(nameToEdit)) {
										list.add(name);
									}
								}
								br2.close();
								br2 = null;
								list.add(newName);
								bw = new BufferedWriter(new FileWriter(file));
								for(String str : contents) {
									bw.write(str);
									bw.newLine();
								}
								bw.flush();
							}
						}
					}catch(IOException e) {
						e.printStackTrace();
					}finally {
						if(bw != null) {
							try {bw.close();}catch(IOException e) {e.printStackTrace();}
						}
					}
				}
			}
		}

	}

}
