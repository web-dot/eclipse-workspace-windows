package com.recap.io.methods;


import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;



public class IOMethods {
	
	//print text file contents
	public static void printTextFileContents(String path) {
		if(path == null) {
			throw new NullPointerException();
		}
		File f = new File(path);
		if(f.exists() && f.isDirectory()) {
			File[] fa = f.listFiles();
			for(File file : fa) {
				if(file.exists() && file.isFile() && file.getName().endsWith(".txt")) {
					//System.out.println(file);
					LineNumberReader lineReader = null;
					try {
						lineReader = new LineNumberReader(new BufferedReader(new FileReader(file)));
						String line;
						while((line = lineReader.readLine()) != null) {
							System.out.println("Line number " + lineReader.getLineNumber() + " line: " + line);
						}
					}catch(IOException e) {
						e.printStackTrace();
						}finally {
							if(lineReader != null) {
								try{lineReader.close();}catch(IOException e) {e.printStackTrace();}
							}
						}
				}
			}
			
		}
	}
	
	
	//find number of occurance of a string in a file
	public static void countString(String path, String srchString) {
		if(path == null) {
			throw new NullPointerException();
		}
		File file = new File(path);
		if(file.exists() && file.isDirectory()) {
			File[] filesArr = file.listFiles();
			for(File f : filesArr) {
				if(f.exists() && f.isFile() && f.getName().endsWith("txt")) {
					//System.out.println(f);
				LineNumberReader lineReader = null;
				try {
					lineReader = new LineNumberReader(new BufferedReader(new FileReader(f)));
					String l;
					int count = 0;
					int pos = 0;
					while((l = lineReader.readLine()) != null) {
						while((pos = (l.indexOf(srchString, pos))) != -1) {
							count++;
							pos++;
						}
					}
					System.out.println("number of occurance = " + count);
				}catch(IOException e) {
					e.printStackTrace();
					}finally {
						
					}
				}
				
			}
		}else {
			throw new IllegalArgumentException("file does not exist");
		}
	}
	
	//sort, reverse sort words in a file
	public static void sortWords(String path) {
		if(path == null) {
			//throw statement is used to throw an exception.
			//throw statement requires a single argument : a Throwable object
			//Throwable objects are instances of any subclass of the Throwable class
			//here "new NullPointerException()" creates an instance of the NulPointerException class which is a subclass of Throwable
			throw new NullPointerException(); 
		}
		File f = new File(path);
		if(f.exists() && f.isDirectory()) {
			File[] files = f.listFiles();
			for(File file : files) {
				if(file.exists() && file.isFile() && file.getName().endsWith(".txt")) {
					BufferedReader br = null;
					try {
						br = new BufferedReader(new FileReader(file));
						String s;
						List<String> list = new ArrayList<String>();
						while((s = br.readLine()) != null) {
							String[] sa = s.split(" ");
							//System.out.println(Arrays.toString(sa));
							for(String string : sa) {
								list.add(string);
							}
						}
						Collections.sort(list);
						System.out.println("sorted list = " + list);
						Collections.reverse(list);
						System.out.println("reverse sorted list = " + list);
					}catch(IOException e) {
						e.printStackTrace();
					}finally {
						if(br != null) {
							try{br.close();}catch(IOException e) {e.printStackTrace();}
						}
					}
				}
			}
			
		}else {
			throw new IllegalArgumentException();
		}
	}
	
	//replace with string
	//do not replace if the other strings contains the newString
	//only replace if the oldString equals newString
	public static void replaceWithString(String path, String oldString, String newString) {
		if(path == null) {
			throw new NullPointerException();
		}
		File f = new File(path);
		if(f.exists() && f.isDirectory()) {
			File[] files = f.listFiles();
			for(File file : files) {
				if(file.exists() && file.isFile() && file.getName().endsWith(".txt")) {
					BufferedReader br = null;
					BufferedWriter bw = null;
					try {
						br = new BufferedReader(new FileReader(file));
						List<String> list = new ArrayList<String>();
						String line;
						String[] sa = null;
						while((line = br.readLine()) != null) {
							sa = line.split(" ");
						}
						for(String string : sa) {
							list.add(string);
						}
						for(int i = 0; i < list.size(); i++) {
							if(list.get(i).equals(oldString)) {
								list.remove(i);
								list.add(i, newString);
							}
						}
						br.close();
						br = null;
						bw = new BufferedWriter(new FileWriter(file));
						for(String string : list) {
							bw.write(string + " ");
						}
						}catch(IOException e) {
						e.printStackTrace();
					}finally {
						if(bw != null) {
							try{bw.close();}catch(IOException e) {e.printStackTrace();}
						}
					}
				}
			}
		}
	}
	//find occurance of every word in a file
	public static void allWordOccurance(String path) {
		if(path == null) {
			throw new NullPointerException();
		}
		File f = new File(path);
		if(f.exists() && f.isDirectory()) {
			File[] files = f.listFiles();
			for(File file : files) {
				if(file.exists() && file.isFile() && file.getName().endsWith(".txt")) {
					BufferedReader br = null;
					try {
						br = new BufferedReader(new FileReader(file));
						Map<String, Integer> map = new HashMap<String, Integer>();
						String s;
						//String[] sa = null;
						int count = 0;
						while((s = br.readLine()) != null) {
							//System.out.println(s);
							String[] sa = s.split(" ");
							//System.out.println(Arrays.toString(sa));
							for(String word : sa) {
								if(map.get(word) != null) {
									map.put(word, map.get(word) + 1);
								}
								else {
									map.put(word, 1);
								}
							}
						}
						Set<Map.Entry<String, Integer>> entries = map.entrySet();
						for(Map.Entry<String, Integer> entry : entries) {
							String word = entry.getKey();
							int countOf = entry.getValue();
							System.out.println(word + " = " + countOf);
						}
						
					}catch(IOException e) {
						e.printStackTrace();
						}finally {
							if(br != null) {
								try{br.close();}catch(IOException e) {e.printStackTrace();}
							}
						}
				}
			}
		}
	}
	
	//number of occurances of each letter in a string
	public static void countCharacter(String str) {
		int[] arr = new int[26];
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			arr[c - 'a']++;
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
			System.out.println("count of " + (char)(i + 'a') + " = " + arr[i]);
			}
		}
	}
	
	//WAP to read from a file and count the occurance of each character
	public static void countCharFromFile(String path) {
		if(path == null) {
			throw new NullPointerException();
		}
		File f = new File(path);
		if(f.exists() && f.isDirectory()) {
			File[] fileArr = f.listFiles();
			for(File file : fileArr) {
				if(file.exists() && file.isFile() && file.getName().endsWith(".txt")) {
					BufferedReader br = null;
					try {
						br = new BufferedReader(new FileReader(file));
						String line;
						int[] arr1 = new int[26];
						int[] arr2 = new int[26];
						while((line = br.readLine()) != null) {
							for(int i = 0; i < line.length(); i++) {
								char c = line.charAt(i);
								//System.out.println((int)c);
								if((int)c >= 97 && (int)c <= 122) {
									arr1[c - 'a']++;
								}
								if((int)c >= 65 && (int)c <= 90) {
									arr2[c - 'A']++;
								}
							}
						}
						for(int i = 0; i < arr1.length; i++) {
							if(arr1[i] != 0) {
							System.out.println("count of lower case = " + (char)(i + 'a') + " = " + arr1[i]);
							}
						}
						for(int i = 0; i < arr2.length; i++) {
							if(arr2[i] != 0) {
							System.out.println("count of upper case = " + (char)(i + 'A') + " = " + arr2[i]);
							}
						}
					}catch(IOException e) {
						e.printStackTrace();
					}finally {
						if(br != null) {
							try{br.close();}catch(IOException e) {e.printStackTrace();}
						}
					}
				}
			}
		}
	}
	
	//WAP find number of occurances of each word in a file using Map
	public static void wordCountUsingMap(String path) {
		if(path == null) {
			throw new NullPointerException();
		}
		File f = new File(path);
		if(f.exists() && f.isDirectory()) {
			File[] files = f.listFiles();
			for(File file : files) {
				if(file.exists() && file.isFile() && file.getName().endsWith(".txt")) {
					BufferedReader br = null;
					try {
						br = new BufferedReader(new FileReader(file));
						Map<String, Integer> map = new HashMap<String, Integer>();
						String s;
						String wrd = "";
						//String word;
						while((s = br.readLine()) != null) {
							//System.out.println(s);
							String[] sa = s.split(" ");
							int count = 0;
							//System.out.println(Arrays.toString(sa));
							for(String word : sa) {
								if(map.get(word) != null) {
									map.put(word, map.get(word)+1);
								}
								else {
									map.put(word, 1);
								}
								wrd = word;
							}
						}
						System.out.println(map);
					}catch(IOException e) {
						e.printStackTrace();
					}finally {
						if(br != null) {
							try{br.close();}catch(IOException e) {e.printStackTrace();}
						}
					}
				}
			}
		}
	}
	
	//WAP to find number of occurances of each word across files given a path
	public static void countWordOccAcroosFiles(String path) {
		if(path == null) {
			throw new NullPointerException();
		}
		File f = new File(path);
		if(f.exists() && f.isDirectory()) {
			File[] files = f.listFiles();
			for(File file : files) {
				if(file.exists() && file.isFile() && file.getName().endsWith(".txt")) {
					BufferedReader br = null;
					try {
						br = new BufferedReader(new FileReader(file));
						Map<String, Integer> map = new HashMap<String, Integer>();
						String s;
						while((s = br.readLine()) != null) {
							String[] arr = s.split(" ");
							for(String word : arr) {
								if(map.get(word) != null) {
									map.put(word, map.get(word) + 1);
								}
								else {
									map.put(word, 1);
								}
							}
						}
						System.out.println(map);
					}catch(IOException e) {
						e.printStackTrace();
						}finally {
							if(br != null) {
								try{br.close();}catch(IOException e) {e.printStackTrace();}
							}
						}
				}
			}
		}
	}
	//WAP to search all the occurances of a given string and replace it with another given
		//input
		public static void replaceString(String path, String oldString, String newString) {
			if(path == null) {
				throw new NullPointerException();
			}
			File f = new File(path);
			if(f.exists() && f.isDirectory()) {
				File[] files = f.listFiles();
				for(File file : files) {
					if(file.exists() && file.isFile() && file.getName().endsWith(".txt")) {
						BufferedReader br = null;
						try {
							br = new BufferedReader(new FileReader(file));
							List<String> list = new ArrayList<String>();
							String s;
							while((s = br.readLine()) != null) {
								String[] sa = s.split(" ");
								for(String word : sa) {
									list.add(word);
								}
								System.out.println("old list = " + list);
							}
							for(int i = 0; i < list.size(); i++) {
								if(list.get(i).equals(oldString)) {
									//System.out.println(word);
									list.remove(i);
									list.add(i, newString);
								}
							}
							System.out.println("new list = " + list);
						}catch(IOException e) {e.printStackTrace();}finally {
						
						}
					}
				}
			}
		}
		
		//wap to search all occurances of a given string, given a path
		public static void searchString(String path, String srchString) {
			if(path == null) {
				throw new NullPointerException();
			}
			File f = new File(path);
			if(f.exists() && f.isDirectory()) {
				
				File[] files = f.listFiles();
				for(File file : files) {
					if(file.exists() && file.isFile() && file.getName().endsWith(".txt")) {
						BufferedReader br = null;
						try {
							br = new BufferedReader(new FileReader(file));
							String s;
							int count = 0;
							while((s = br.readLine()) != null) {
								if(s.contains(srchString)) {
									count++;
								}
							}
							System.out.println("count of " + srchString + " = " + count);
						}catch(IOException e) {
							e.printStackTrace();
							}finally {
								if(br != null) {
									try{br.close();}catch(IOException e) {e.printStackTrace();}
								}
							}
					}
				}
			}else {
				throw new NullPointerException("the file does not exist");
			}
		}
	public static void main(String[] args) {
		
		//printTextFileContents("D:\\JAVA_RECAP\\IO\\textfiles");
		//countString("D:\\JAVA_RECAP\\IO\\textfiles", "to");
		//sortWords("D:\\JAVA_RECAP\\IO\\sortingwords");
		//replaceWithString("D:\\JAVA_RECAP\\IO\\replaceoldstr", "to", "$$$");
		//replaceWithString("D:\\JAVA_RECAP\\IO\\replaceoldstr", "for", "###");
		//allWordOccurance("D:\\JAVA_RECAP\\IO\\eachwordoccurance");
		//countCharacter("abc");
		//countCharFromFile("D:\\JAVA_RECAP\\IO\\textfiles");
		//wordCountUsingMap("D:\\JAVA_RECAP\\IO\\sortingwords");
		//replaceString("D:\\JAVA_RECAP\\IO\\replaceoldstr", "to", "##");
		searchString("D:\\JAVA_RECAP\\IO\\countstring", "in");
	}

}
