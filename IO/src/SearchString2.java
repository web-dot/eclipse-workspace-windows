import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SearchString2 {

	public static void main(String[] args) {
			//[1]take user input using scanner
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a path");
			String path = sc.nextLine();
			System.out.println("Enter a word");
			String srchString = sc.nextLine();
			
			//[2]create file instance which takes a path instance as paramete
			File f = new File(path);
			//[3]call .exists() and .isDirectory() on f
			if(f.exists() && f.isDirectory()) {
				//[4]call .listFiles which returns filearray
				File[] fa = f.listFiles();
				//System.out.println(fa[0]);
				int count = 0;
				//[5]loop over elements of file array
				for (File fi : fa) {
					//[6]check if an element is a text file
					if(fi.exists() && fi.isFile() && fi.getName().endsWith(".txt")) {
						//[7]to read from file create a buffered reader reference which points to null
						BufferedReader br = null;
						try {
							//intantiate buffered reader which takes a Filereader instance as argument which
							//in turn takes a elemnt of file array which is a path as instance
							br = new BufferedReader(new FileReader(fi));
							String line;
							int pos = 0;
							//[7]loop over lines
							while((line = br.readLine()) != null) {
								//[8]call indexOf on each line to check if the string exists
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
								} catch (Exception e2) {
									e2.printStackTrace();
								}
							}
						}
					}
				}
				System.out.println(count);
			}
	}
			
}
