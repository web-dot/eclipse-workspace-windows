import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jdk.internal.misc.FileSystemOption;

public class PathAndScanner {

	public static void main(String[] args) throws IOException {
		/*
		//Paths
		Path path = Paths.get("D:/java");
		System.out.println(path.toString());
		System.out.println(path.getFileName());
		System.out.println(path.getName(0));
		System.out.println(path.getNameCount());
		System.out.println(path.subpath(0, 1));
		System.out.println(path.getParent());
		System.out.println(path.getRoot());*/
		
		//Scanner -> next() nextInt()
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter name");
		//String name = sc.next();
		//System.out.println("Enter age");
		//int age = sc.nextInt();
		//System.out.println("my name is " + name + " age is " + age);
		
		//Scanner -> nextLine()
		/*
		System.out.println("Enter message");
		String line = sc.nextLine();
		System.out.println("Enter score");
		int score = sc.nextInt();
		System.out.println(line + " " + score);*/
		
		//InputStreamReader()
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter name");
		String name = br.readLine();
		System.out.println("Enter age");
		int age = Integer.parseInt(br.readLine());
		System.out.println("My name is " + name  + " and age is " + age);
		
		
		/*
		String[] str = word.split(" ");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
			
			
			Scanner sc1 = null;
			try {
				sc1 = new Scanner(new FileReader("D:/booktext.txt"));
				String s;
				while((s = sc1.nextLine()) != null) {
					//System.out.println(s);
				}
			}catch(IOException e) {
				e.printStackTrace();
			}*/
			
		}
	}


