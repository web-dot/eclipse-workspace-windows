import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;





public class PrintText {
	//printTextFileContents
	public static void printTextFileContents(String path) {
		if(path == null) {
			throw  new NullPointerException();
		} 
		File f = new File(path);
		if(f.exists() && f.isDirectory()) {
			File[] fa = f.listFiles();
			for (File fi : fa) {
				if(fi.exists() && fi.isFile() && fi.getName().endsWith(".txt")) {
					System.out.println(fi);
					//BufferedReader br = null;
					LineNumberReader br = null;
					try {
						br = new LineNumberReader(new BufferedReader(new FileReader(fi)));
						String line;
						while((line = br.readLine()) != null) {
							System.out.println("Line Number : " + br.getLineNumber() + " line : " + line);
						}
					}catch(IOException e) {
						e.printStackTrace();
					}finally {
						if(br != null) {
							try {
							br.close();
							}catch(IOException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
		} else {
			throw new IllegalArgumentException("path is not legal");
		}
}
	
	//searchTextFileContentsWithLineNumbers
	public static void searchTextFileContentsWithLineNumbers(String path, String word) {
		if(path == null) {
			throw new NullPointerException();
		}
		
		File f = new File(path);
		if(f.exists() && f.isDirectory()) {
			File[] fa = f.listFiles();
			for (File fi : fa) {
				//start reading from each file
				LineNumberReader br = null;
				try {
					br = new LineNumberReader(new BufferedReader(new FileReader(fi)));
					String line;
					int count = 0;
					int pos = 0;
					while((line = br.readLine()) != null) {
						while((pos = (line.indexOf(word, pos))) != -1) {
							count++;
							pos++;
						}
					}
					System.out.println("Number of occ : " + count);
				}catch(IOException e) {
					e.printStackTrace();
				}finally {
					
				}
			}
		}
	}//
	
	public static void printSortedWordFileContent(String path) {
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
						List<String> words = new ArrayList<String>();
						Set<String> sortedSet = new TreeSet<String>();
						String line;
						while((line = br.readLine()) != null) {
							String[] sa = line.split(" ");
							for (String w : sa) {
								words.add(w);
								sortedSet.add(w);
							}
						}
						//sort
						Collections.sort(words); //List
						//System.out.println("with dupli : " + words);
						//System.out.println("without dupli : " + sortedSet);
						
						//reverse sort using Comparator class which impliments Comparator interface
						Collections.sort(words, new StringDescComparator());
						//using Collection.reverse()
						//Collections.reverse(words);
						System.out.println("in reverse order " + words);
					
					}catch(IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	
	public static void  replaceCharInFile(String path, String strToRepl, String replWithStr) {
		if(path == null) {
			throw new IllegalArgumentException();
		}
		File f = new File(path);
		if(f.exists() && f.isDirectory()) {
			//System.out.println(f.getName());
			File[] fa = f.listFiles();
			for (File file : fa) {
				System.out.println(file.getPath());
				if(file.exists() && file.isFile() && file.getName().endsWith(".txt")) {
					//System.out.println(file.getName());
					BufferedReader br = null;
					BufferedWriter bw = null;
					try {
						br = new BufferedReader(new FileReader(file));
						List<String> contents = new ArrayList<String>();
						String line;
						while((line = br.readLine()) != null) {
							if(line.contains(strToRepl)) {
								line = line.replace(strToRepl, replWithStr);
								}
								contents.add(line);
							}
						br.close();
						br = null;
						bw = new BufferedWriter(new FileWriter(file));
						//bw = new BufferedWriter(new FileWriter(file));//this will append
						for (String str : contents) {
							bw.write(str);
							bw.newLine();
							}
						bw.flush();
						}
					catch(IOException e) {
						e.printStackTrace();
					}finally {
						if(bw != null) {
							try {bw.close();
							}catch(IOException e) {
								e.printStackTrace();
							}
						}
						if(br != null) {
							try {
								br.close();
							}catch(IOException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
		}
	}
	
	public static void findAllWordOccuranceInFile(String path)
	{
		if(path == null) {
			throw new IllegalArgumentException();
		}
		File f = new File(path);
		if(f.exists() && f.isDirectory()) {
			File[] fa = f.listFiles();
			for (File file : fa) {
				//System.out.println(file);
				if(file.exists() && file.isFile() && file.getName().endsWith(".txt")) {
					//System.out.println(file);
					BufferedReader br = null;
					try {
						br = new BufferedReader(new FileReader(file));
						Map<String , Integer> wordOcc = new HashMap<String, Integer>(); 
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
						System.out.println("no of occ = " + wordOcc);
						
					}catch(IOException e) {e.printStackTrace();}
				} 
			}
		}
	}
	
	

	public static void main(String[] args) {
		
		/*
		//printTextFileContents/findAllWordOccuranceInFile
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a path of file");
		String path = sc.nextLine();
		PrintText.findAllWordOccuranceInFile(path);
		*/
		/*
		//searchTextFileContentsWithLineNumbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a path of file");
		String path = sc.nextLine();
		System.out.println("Enter word to find line number");
		String word = sc.nextLine();
		searchTextFileContentsWithLineNumbers(path, word);
		*/
		
		/*
		//find occurance of a string in anathor string using split()
		String str1 = "The servants have an\r\n"
				+ "air of eagerness proportioned to the value of their New-Year's gifts,\r\n"
				+ "received or expected. I see the master of the house crossing the court\r\n"
				+ "with the morose look of a man who is forced to be generous; and the\r\n"
				+ "visitors increase, followed by shop porters who carry flowers, bandboxes,\r\n"
				+ "or toys. Suddenly the great gates are opened, and a new carriage, drawn\r\n"
				+ "by thoroughbred horses, draws up before the doorsteps. They are, without\r\n"
				+ "doubt, the New-Year's gift presented to the mistress of the house by her\r\n"
				+ "husband; for she comes herself to look at the new equipage.";
		
		String str2 = "and";
		
		String[] strArr = str1.split("the");
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(i + " : " + strArr[i]);
		}
		System.out.println(strArr.length);
		*/
		
		
		
		//sortTextContent
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter path of txt file");
		String path = sc.nextLine();
		System.out.println("Enter word to be replaced");
		String strToRepl = sc.nextLine();
		System.out.println("Enter replacing word");
		String replWithStr = sc.nextLine();
		PrintText.replaceCharInFile(path, strToRepl, replWithStr);

	}

}

class StringDescComparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		
		return o2.compareTo(o1);
	}
}



