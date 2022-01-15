import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

 class Sort {
	 //print words in sorted manner with dupli(Collections -> List<T> -> ArrayList<T>)
	//print words in sorted manner without dupli(Collections -> Set<T> -> TreeSet<T>)
	 //print words in rev sorted manner
	public static void wordSort(String path) {
		if(path == null) {
			throw new IllegalArgumentException();
		}
		File f = new File(path);
		if(f.exists() && f.isDirectory()) {
			File[]  fa = f.listFiles();
			for (File file : fa) {
				if(file.exists() && file.isFile() && file.getName().endsWith(".txt")) {
					BufferedReader br = null;
					try {
						br = new BufferedReader(new FileReader(file));
						String line;
						List<String> wordList = new ArrayList<String>();
						Set<String> wordSet = new TreeSet<String>();
						while((line = br.readLine()) != null) {
							String[] words = line.split(" "); 
							for (String s : words) {
								wordList.add(s);
								wordSet.add(s);
								
								/*SORT IN LIST*/
								Collections.sort(wordList);
								/*REVERSE SORT IN LIST*/
								//Collections.sort(wordList, new StringComparator());
							}
						}
						System.out.println("sorted in List(with dupli) = " + wordList);
						System.out.println("sorted in TreeSet(without dupli)" + wordSet);
					}catch(IOException e) {
						e.printStackTrace();
					}finally {
						
					}
				}
			}
		}
	}
}
 
 
 //num of occurance of one word in a file(.indexOf())
 //num of occurence of every word in a file(ArrayList<String>)
 class Search{
	 
	 public static void oneWordCount(String path, String srchString) {
		 if(path == null) {
			 throw new IllegalArgumentException();
		 }
		 File f = new File(path);
		 if(f.exists() && f.isDirectory()) {
			 File[] fa = f.listFiles();
			 for (File file : fa) {
				if(file.exists() && file.isFile() && file.getName().endsWith(".txt")) {
					BufferedReader br = null;
					try {
						br = new BufferedReader(new FileReader(file));
						String line;
						int count = 0;
						int pos = 0;
						while((line = br.readLine()) != null) {
							//System.out.println(line);
							while((pos = line.indexOf(srchString, pos)) != -1) {
								++count;
								++pos;
							}
						}
						System.out.println(count);
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
	 
	 public static void allWordCount(String path) {
		 if(path == null) {
			 throw new IllegalArgumentException();
		 }
		 File f = new File(path);
		 if(f.exists() && f.isDirectory()) {
			 File[] fa = f.listFiles();
			 for (File file : fa) {
				BufferedReader br = null;
				try {
					br = new BufferedReader(new FileReader(file));
					Map<String, Integer> wordOcc = new HashMap<String, Integer>();
					String line;
					while((line = br.readLine()) != null) {
						String[] words = line.split(" ");
						for (String w : words) {
							if(wordOcc.get(w) != null) {
								wordOcc.put(w, wordOcc.get(w) + 1);
							}else {
								wordOcc.put(w, 1);
							}
						}
					}
					System.out.println("occurance of each word = " + wordOcc);
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
	 
	 public static void searchAndReplace(String path, String strToRepl, String replString) {
		 if(path == null) {
			 throw new IllegalArgumentException();
		 }
		 File f = new File(path);
		 if(f.exists() && f.isDirectory()) {
			 File[] fa = f.listFiles();
			 for (File file : fa) {
				 //System.out.println(file);
				 
				if(file.exists() && file.isFile() && file.getName().endsWith(".txt")) {
					BufferedReader br = null;
					BufferedWriter bw = null;
					try {
						br = new BufferedReader(new FileReader(file));
						String line;
						List<String> content = new ArrayList<String>();
						while((line = br.readLine()) != null){
							//System.out.println(line);
							if(line.contains(strToRepl)) {
							line = line.replace(strToRepl, replString);
							System.out.println(line);
							content.add(line);
							}
						}
						System.out.println(content);
						br.close();
						br = null;
						bw = new BufferedWriter(new FileWriter(file));
						for (String line2 : content) {
							bw.write(line2);
						}
					}catch(IOException e ) {
						e.printStackTrace();
					}finally {
						if(br != null) {
							try {br.close();}catch(IOException e) {e.printStackTrace();}
						}
						if(bw != null) {
							try {bw.close();}catch(IOException e) {e.printStackTrace();}
						}
					}
				}
			}
		 }
	 }
 }
 
 class PrimitiveTest{
	 public static void testPrimitivesUsingStreams(String path) {
		 if(path == null) {
			 throw new IllegalArgumentException();
		 }
		 File f = new File(path);
		 if(f.exists() && f.isDirectory()) {
			 File[] fa = f.listFiles();
			 for (File file : fa) {
				if(file.exists() && file.isFile() && file.getName().endsWith(".txt")) {
					BufferedReader br = null;
					try{
						br = new BufferedReader(new FileReader(file));
						String line;
						List<Integer> intList = new ArrayList<Integer>();
						while((line = br.readLine()) != null) {
							int i = Integer.parseInt(line);
							intList.add(i);
							//System.out.println(i);
						}System.out.println(intList);
						int max = intList.get(0);
						for (int i = 0; i < intList.size(); i++) {
							if(intList.get(i) > max) {
								max = intList.get(i);
								}
							}
						System.out.println(max);
					}catch(IOException e) {
						e.printStackTrace();
					}finally {
						if(br != null) {
							try {br.close();}catch(IOException e) {e.printStackTrace();}finally {}
						}
					}
				}
			}
		 }
	 }
 }
 
 class StringComparator implements Comparator<String>{
	 @Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
 }

public class TestIOpgms{
	public static void main(String[] args) {
		/*
		//class SORT
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a path");
		String path = sc.nextLine();
		Sort.wordSort(path);
		*/
		
		/*
		//class SEARCH
		
		//oneWordCount
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a path");
		String path = sc.nextLine();
		System.out.println("Enter a word");
		String srchString = sc.nextLine();
		Search.oneWordCount(path, srchString);
		*/
		
		/*
		//allWordCount
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a path");
		String path = sc.nextLine();
		Search.allWordCount(path);
		*/
		
		/*
		 //TEST PRIMITIVES
		//search and replace
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a path");
		String path = sc.nextLine();
		//sc.close();
		System.out.println("Enter string to replace");
		String strToRepl = sc.nextLine();
		System.out.println("Enter new string");
		String replString = sc.nextLine();
		Search.searchAndReplace(path, strToRepl, replString);
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter File Path");
		String path = sc.nextLine();
		PrimitiveTest.testPrimitivesUsingStreams(path);
		/*
		String str1 = "he will be therewhen he is there";
		str1.replace(he, she);*/
		
	}
}
