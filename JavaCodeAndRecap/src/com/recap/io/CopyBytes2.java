package com.recap.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class CopyBytes2 {

	public static void main(String[] args) {
		//Using Byte Streams
		//reads the input stream and writes the output stream, one byte at a time
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
			//closing streams is very important, use finally block 
			//to close resources to guarantee that both streams will be closed even if an error occurs.
			// This practice helps avoid serious resource leaks.
		}finally {
			if(in != null) {
				try {in.close();}catch(IOException e) {e.printStackTrace();}
			}
			if(out != null) {
				try {out.close();}catch(IOException e) {e.printStackTrace();}
			}
		}

	}

}
