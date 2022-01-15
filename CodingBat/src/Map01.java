import java.util.HashMap;
import java.util.Map;

public class Map01 {

	//given a array of strings return a Map<String, Integer> containing a key 
	//for different string int the array
	
	public static Map<String, Integer> word0(String[] strings){
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < strings.length; i++) {
			if(!map.containsKey(strings[i])) {
				map.put(strings[i], 0);
			}
		}
		return map;
	}
	
	//given an array of strings, return a Map<String, Integer> containing
	//a key for every different string in the array, and the value is that
	//string's 	length
	
	public static Map<String, Integer> wordLen(String[] strings){
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0; i < strings.length; i++) {
			if(!map.containsKey(strings[i])) {
				map.put(strings[i], strings[i].length());
			}
		}
		return map;
	}
	
	
	//given an array of empty strings, create and return a Map<String, String> as foll:
	//for each string add its first character as a key with its last character as the value
	public static Map<String, String> pairs(String[] strings){
		Map<String, String> map = new HashMap<String, String>();
		for(int i = 0; i < strings.length; i++) {
			if(!map.containsKey(strings[i])) {
				map.put(strings[i].substring(0,1), strings[i].substring(strings[i].length()-1, strings[i].length()));
			}
		}
		return map;
	}
	
	
	//given an array of strings, return a Map<String, Integer>
	//with a key for each different string,with the value the number of times
	//the string appears in the array
	public static Map<String, Integer> wordCount(String[] strings){
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < strings.length; i++) {
			if(map.containsKey(strings[i])) {
				map.put(strings[i], map.get(strings[i]) + 1);
			}
			else {
				map.put(strings[i], 1);
			}
		}
		return map;
	}
	
	//given an array of non-empty strings, return a Map<String,String> with a key 
	//for every different first character seen, with the value of all the strings 
	//starting with that character appended together in the order they appear in the array
	
	
	public static Map<String, String> firstChar(String[] strings){
		
		Map<String, String> map = new HashMap<String, String>();
		for(int i = 0; i < strings.length; i++) {
			if(!map.containsKey(strings[i].substring(0,1))) {
				System.out.println(strings[i]);
				map.put(strings[i].substring(0,1), strings[i]);
			}
			else if(map.containsKey(strings[i].substring(0,1))) {
				System.out.println("hello");
				map.put(strings[i].substring(0,1), map.get(strings[i].substring(0,1)).concat(strings[i]));
			}
		}
		return map;
	}
	
	//if string appear 2nd, 4th, 6th time then append string
	//to the result.
	//re-factor
	public static String wordAppend(String[] strings) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < strings.length; i++) {
			int count = 0;
			for(int j = 0; j < strings.length; j++) {
				if(strings[i].equals(strings[j])) {
					count++;
				}
			}
			if(count%2 == 0) {
				sb.append(strings[i]);
			}
			if(sb.length() == 2) {
				break;
			}
		}
		return sb.toString();
	}
	
	/*
	Given an array of strings, return a Map<String, Boolean> where each different string 
	is a key and its value is true if that string appears 2 or more times in the array.
	*/
	
	public static Map<String, Boolean> wordMultiple(String[] strings){
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < strings.length; i++) {
			//System.out.println(strings[i]);
			if(map.containsKey(strings[i])) {
				map.put(strings[i], map.get(strings[i]) + 1);
			}
			else {
				map.put(strings[i], 1);
			}
		}
		System.out.println(map);
		Map<String, Boolean> map1 = new HashMap<String, Boolean>();
		
		for(String s : map.keySet()) {
			//System.out.println(map.get(s));
			if(map.get(s) >= 2) {
				map1.put(s, true);
			}
			else {
				map1.put(s, false);
			}
		}
		return map1;
	}
	
	
	/*
	 * We'll say that 2 strings "match" if they are non-empty and their first chars are the same. 
	 * Loop over and then return the given array of non-empty strings as follows: if a string matches 
	 * an earlier string in the array, swap the 2 strings in the array. When a position in the array has 
	 * been swapped, it no longer matches anything. Using a map, this can be solved making just one pass 
	 * over the array.
	 * 
	 * */
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		
		String[] str1 = {"a", "b", "a", "c", "b"};
		Map<String, Boolean> map = wordMultiple(str1);
		System.out.println(map);
		
		/*
		String[] s1 = {"a", "b", "a", "b"};
		String[] s2 = {"a", "b", "a", "c", "b"};
		System.out.println(word0(s1));
		System.out.println(word0(s2));
		
		String[] s3 = {"this", "and", "that", "and"};
		String[] s4 = {"mary", "had", "a", "little", "lamb"};
		System.out.println(wordLen(s3));
		System.out.println(wordLen(s4));
		
		String[] s5 = {"man", "moon", "good", "night"};
		System.out.println(pairs(s5));
		
		String[] s6 = {"a", "b", "a", "c", "b"};
		String[] s7 = {"c", "b", "a"};
		String[] s8 = {"c", "c", "c", "c"};
		System.out.println(wordCount(s6));
		System.out.println(wordCount(s7));
		System.out.println(wordCount(s8));
		*/
		
		/*
		String[] s9 = {"salt", "tea", "soda", "toast"};
		String[] s10 = {"aa", "bb", "cc", "aAA", "cCC", "d"};
		System.out.println(firstChar(s9));
		System.out.println(firstChar(s10));
		*/
		
		/*
		String[] s11 = {"a", "b", "a"};
		String[] s12 = {"a", "b", "a", "c", "a", "d", "a"};
		System.out.println(wordAppend(s11));
		System.out.println(wordAppend(s12));
		*/
	}

}
