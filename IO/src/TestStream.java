import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestStream {

	public static void main(String[] args) {
		
		BufferedInputStream bis = null;
		try {
			bis = new BufferedInputStream(new FileInputStream("D:/array.txt"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			
		}
	}

}
