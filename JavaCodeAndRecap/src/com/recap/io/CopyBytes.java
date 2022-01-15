package com.recap.io;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopyBytes {

	public static void main(String[] args) {
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("D:\\JAVA_RECAP\\IO\\xanadu.txt");
			out = new FileOutputStream("D:\\JAVA_RECAP\\IO\\outagain.txt");
			int c;
			while((c = in.read()) != -1) {
				out.write(c);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(in != null) {
				try{in.close();}catch(IOException e) {e.printStackTrace();}
			}
			if(out != null) {
				try{out.close();}catch(IOException e) {e.printStackTrace();}
			}
		}

	}

}
