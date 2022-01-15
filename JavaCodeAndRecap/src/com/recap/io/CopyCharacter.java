package com.recap.io;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacter {

	public static void main(String[] args) {
		//
		FileReader inputstream = null;
		FileWriter outputstream = null;
		
		try {
			inputstream = new FileReader("D:\\JAVA_RECAP\\IO\\xanadu.txt");
			outputstream = new FileWriter("D:\\JAVA_RECAP\\IO\\characteroutput.txt");
			int c;
			
			while((c = inputstream.read()) != -1) {
				outputstream.write(c);
			}
		}catch(IOException e) {
			e.printStackTrace();
			//Closing the resources is very important. 
			//Here we have used finally block to close the resources 
			//to make that both the streams are closed even if an error occurs.
			//This practice helps in avoid serious data leaks.
		}finally {
			if(inputstream != null) {
				try {inputstream.close();}catch(IOException e) {e.printStackTrace();}
			}
			if(outputstream != null) {
				try {outputstream.close();}catch(IOException e) {e.printStackTrace();}
			}
		}
	}

}
