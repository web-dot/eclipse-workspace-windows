package com.control;

public class StringRecap {

	public static void main(String[] args) {
		char[] a = new char[] {'c', 'a', 'r'};
		String str = new String(a); //char array as param to String constructor
		System.out.println(str);
		
		StringBuilder sb = new StringBuilder("hello");
		String str2 = new String(sb);
		System.out.println(str2); //stringbuilder object as param to String constructor
		
		StringBuffer sbf = new StringBuffer("hello2");
		String str3 = new String(sbf);
		System.out.println(str3);
		
		//String methods
		//indexOf()
		String st = "jpvaapi";
		System.out.println(st.indexOf("aa"));
		System.out.println(st.indexOf("p", 4));
		
		//substring()
		System.out.println(st.substring(2));
		System.out.println(st.substring(4));
		System.out.println(st.substring(1, 3));
		
		//startsWith()
		System.out.println(st.startsWith("p", 5));
		
		//endsWith()
		System.out.println(st.endsWith("i"));
		
		
		//method chaining
		System.out.println(st.replace("a", "o").substring(3).trim());
		
		
		
		
		
		
		
		
	}

}
