package com.recap.io;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {

	public static void main(String[] args) {
		
		FileReader inputStream = null;
		FileWriter outputStream = null;
		
		try {
			inputStream = new FileReader("D:\\JAVA_RECAP\\IO\\xanadu.txt");
			outputStream = new FileWriter("D:\\JAVA_RECAP\\IO\\characteroutput.txt");
			int c;
			while((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
		}catch(IOException e) {
			e.printStackTrace();
			}finally {
			if(inputStream != null) {
				try {inputStream.close();}catch(IOException e) {e.printStackTrace();}
			}
			if(outputStream != null) {
				try {outputStream.close();}catch(IOException e) {e.printStackTrace();}
			}
		}
	}

}
