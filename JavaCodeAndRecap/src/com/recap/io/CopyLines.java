package com.recap.io;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class CopyLines {

	public static void main(String[] args) {
		
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		
		try {
			inputStream = new BufferedReader(new FileReader("D:\\JAVA_RECAP\\IO\\xanadu.txt"));
			outputStream = new PrintWriter(new FileWriter("D:\\JAVA_RECAP\\IO\\characteroutput.txt"));
			String s;
			while((s = inputStream.readLine()) != null) {
				outputStream.println(s);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(inputStream != null) {
				try {inputStream.close();}catch(IOException e) {e.printStackTrace();}
			}
			if(outputStream != null) {
				outputStream.close();
			}
		}

	}

}
