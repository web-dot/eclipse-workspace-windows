import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountWords implements Runnable{
	private String path;
	private int wordCount;
	public CountWords(String path){
		this.path = path;
	}
	public int getCount() {
		return wordCount;
	}
	public static int countWords(File f) {
		int count = 0;
		if(f.exists() && f.isFile() && f.getName().contains(".txt")) {
			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(f));
				String line;
				//int count = 0;
				while((line = br.readLine()) != null) {
					String [] arr = line.split(" ");
					count = count + arr.length;
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
		return count;
	}
	
	@Override
	public void run() {
		if(path == null) {
			throw new IllegalArgumentException();
		}
		File f = new File(path);
		if(f.exists() && f.isFile() && f.getName().contains(".txt")) {
			wordCount = countWords(f);
		}else if(f.exists() && f.isDirectory()) {
			File[] fa = f.listFiles();
			for(File file : fa) {
				int v  = countWords(file);
				wordCount += v;
			}
		}
		
	}
}
