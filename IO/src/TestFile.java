import java.io.File;
import java.util.*;

public class TestFile {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter a path");
		String path = sc2.nextLine();
		File f = new File(path);
		System.out.println("[ .exists() : " + f.exists() + " ]");
		System.out.println("[ .isFile() : " + f.isFile() + " ]");
		System.out.println("[ .isDirectory() : " + f.isDirectory()+ " ]");
		System.out.println("[ .length() : " + f.length()+ " ]");
		System.out.println("[ .getAbsolutePath() : " + f.getAbsolutePath() + " ]");
		System.out.println("[ .exists() : " + f.canRead() + " ]");
		
		System.out.println();
		
		if(f.exists() && f.isDirectory()) {
			File[] fa = f.listFiles();//returns fileArray
			for (File fi : fa) {
				if(fi.exists() && fi.isFile() && fi.getName().endsWith(".txt")) {
					System.out.println("text match found");
				}/*
				System.out.println();
				System.out.println("[ .getName() : " + fi.getName() + " ]");
				System.out.println("[ .exists() : " + fi.exists() + " ]");
				System.out.println("[ .isFile() : " + fi.isFile() + " ]");
				System.out.println("[ .isDirectory() : " + fi.isDirectory()+ " ]");
				System.out.println("[ .length() : " + fi.length()+ " ]");
				System.out.println("[ .getAbsolutePath() : " + fi.getAbsolutePath() + " ]");
				System.out.println("[ .canRead : " + fi.canRead() + " ]");*/
			}
		}
	}
}
