package com.uttara.lab07;

public class TestRandomStrings {

	
	public static void genRandomStr() {
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 6; j++) {
				double d = Math.floor(Math.random()*10);
				char c1 = (char)('a' + d);
				//System.out.println(c1);
				sb.append(c1);
			}
			System.out.println("Random String " + i + " = " + sb.toString());
			System.out.println();
			sb.delete(0, 6);
		}
	}
	
	public static void main(String[] args) {
		
		genRandomStr();
	}

}
