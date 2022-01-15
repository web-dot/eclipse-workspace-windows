import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class StringOccFromFileJob implements Runnable{
	String path;
	int stringCount;
	String searchString;
	public int getStringCount() {
		return stringCount;
	}
	public StringOccFromFileJob(String path, String word) {
		this.path = path;
		this.searchString = word;
	}
	public int fileStringCount(File f) {
		//File f = new File(path);
		int count = 0;
		if(f.exists() && f.isFile() && f.getName().contains(".txt")) {
			BufferedReader bf = null;
			try {
				bf = new BufferedReader(new FileReader(f));
				String line;
				//int count = 0;
				int pos = 0;
				while((line = bf.readLine()) != null) {
					while((pos = line.indexOf(searchString, pos)) != -1) {
						count++;
						pos++;
					}
				}
				//stringCount = count;
				//return count;
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				if(bf != null) {
					try {bf.close();}catch(IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return count;
	}
	public void run() {
		if(path == null) {
			throw new IllegalArgumentException();
		}
		File f = new File(path);
		if(f.exists() && f.isFile()) {
			stringCount = fileStringCount(f);
		}
		else if(f.exists() && f.isDirectory()) {
			File[] fa = f.listFiles();
			for(File file : fa) {
				int v = fileStringCount(file);
				stringCount = stringCount + v;
			}
		}
	}
}
