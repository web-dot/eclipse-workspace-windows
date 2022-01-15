package com.inputstream;
import java.io.*;
public class InputStream {
	public static void main(String[] args) {
		byte[] array = new byte[100];
		
		try {
			InputStream input = new FileInputStream("input.txt");
			System.out.println("Available bytes in the file: " + input.available)
		}catch() {}
	}
}
