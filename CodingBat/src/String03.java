import java.util.Arrays;

public class String03 {
	
	//count the number of words ending with y or z
	/*
	public static int countYZ(String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(Character.isLetter(str.charAt(i))) {
				System.out.println(str.charAt(i));
			}
		}
		return count;
	}
	*/
	
	//base remove
	public static String withoutString(String base, String remove) {
		for(int i = 0; i < base.length(); i++) {
			if(base.toLowerCase().contains(remove.toLowerCase())) {
				base = base.replace(remove.toLowerCase(), "");
			}
			if(base.contains(remove.toUpperCase())) {
				base = base.replace(remove.toUpperCase(), "");
			}
		}
		if(base.contains(remove)) {
			base = base.replace(remove, "");
		}
		return base;
	}
	//return true if number of appearance of "is" is equal to number of appearance of "not"(case sensitive)
	public static boolean equalIsNot(String str) {
		String s1 = "is";
		int count = 0;
		int pos = 0;
		for(int i = 0; i < str.length(); i++) {
			//int count = 0;
			while((pos = (str.indexOf(s1, pos))) != -1) {
				count++;
				pos++;
			}
			
		}
		System.out.println(count);
		return true;
	}
	
	//given a string count the number of words ending in 'y' or 'z'
	//fails for some cases
	//REFACTOR
	public static int countYZ(String str) {
		char x = ' ';
		String s = "";
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(!Character.isLetter(str.charAt(i))) {
				x = str.charAt(i);
				s = Character.toString(x);
			}
		}
		String[] sa = str.split(s);
		System.out.println(Arrays.toString(sa));
		for(int i = 0; i < sa.length; i++) {
			if(sa[i].charAt(sa[i].length()-1) == 'y' || sa[i].charAt(sa[i].length()-1) == 'z') {
				count++;
			}
		}
		return count;
	}
	
	//return true if number of appearances of "is" anywhere n the string
	//is equal to the number of appearances of "not" anywhere in the string
	public static boolean equalIsNot(String str) {
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(countYZ("!!day--yaz!!"));
		
		
		//boolean r = equalIsNot("This is notnot");
		//System.out.println(r);

	}

}
