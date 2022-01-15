import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

import jdk.internal.misc.FileSystemOption;

public class StringRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//paths
		/*
		Path path = Paths.get("D:/java");
		System.out.println(path.toString());
		System.out.println(path.getFileName());
		System.out.println(path.getName(0));
		System.out.println(path.getNameCount());
		System.out.println(path.subpath(0, 1));
		System.out.println(path.getParent());
		System.out.println(path.getRoot());*/
		
		//next() nextInt()
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter name");
		//String name = sc.next();
		//System.out.println("Enter age");
		//int age = sc.nextInt();
		//System.out.println("my name is " + name + " age is " + age);
		
		//nextLine()
		System.out.println("Enter message");
		String line = sc.nextLine();
		System.out.println("Enter score");
		int score = sc.nextInt();
		System.out.println(line + " " + score);
		
		
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


