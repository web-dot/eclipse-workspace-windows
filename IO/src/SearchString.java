import java.io.File;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class SearchString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a path");
		String path = sc.nextLine();
		System.out.println("Enter a word to search");
		String srchString = sc.nextLine();
		
		File f = new File(path);
		int count = 0;
		if(f.exists() && f.isDirectory()) {
			File[] fa = f.listFiles();
			for (File fi : fa) {
				if(fi.exists() && fi.isFile() && fi.getName().endsWith((".txt"))) {
					BufferedReader br = null;
					try {
						br = new BufferedReader(new FileReader(fi));
						String line;
						int pos = 0;
						while((line = br.readLine()) != null) {
							while((pos = (line.indexOf(srchString, pos))) != -1) {
								count++;
								pos++;
							}
						}
					}catch(IOException e) {
						e.printStackTrace();
					}finally {
						if(br != null) {
							try {
								br.close();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
		}
		System.out.println(count);
	}

}
