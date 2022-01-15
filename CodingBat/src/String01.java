
public class String01 {

	//return without first two chars, keep if 'a' or 'b'
			public static String deFront(String str) {
				if(str.charAt(0) == 'a' && str.charAt(1) == 'b') {
					return str;
				}
				if(str.charAt(0) == 'a') {
					return str.substring(0,1) + str.substring(2, str.length());
				}
				if(str.charAt(1) == 'b') {
					return str.substring(1,str.length());
				}
				return str.substring(2, str.length());
			}
			//return without beginning substring
			public static String without2(String str) {
				if(str.length() == 2 || str.length() == 1 || str.length() == 0) {
					return "";
				}
				if(str.substring(0,2).equals(str.substring(str.length()-2, str.length()))) {
					String s = str.substring(0,2);
					str = str.replace(s, "") + s;
				}
				return str;
			}
			
			//return string made of 3 copies of first 2 chars
			public static String extraFront(String str) {
				if(str.length() == 1) {
					return str+str+str;
				}
				if(str.length() == 0) {
					return "";
				}
				if(str.length() > 1) {
				String s = str.substring(0, 2);
				return s + s + s;
				}
				return str;
			}
			
			//return same length concateneated of two strings
			public static String minCat(String a, String b) {
				int lenA = a.length();
				int lenB = b.length();
				String str = "";
				if(lenA < lenB) {
					String subB = b.substring(b.length()-lenA, b.length());
					str = a + subB;
				}
				if(lenA > lenB) {
					String subA = a.substring(a.length()-lenB, a.length());
					str = subA + b;
				}
				if(lenA == lenB) {
					str = a + b;
				}
				return str;
			}
			
			//return true if first two chars repeat at end
			public static boolean frontAgain(String str) {
				if(str.length() == 2) {
					return true;
				}
				if(str.length() < 2){
					return false;
				}else {
					return str.substring(0, 2).equals(str.substring(str.length()-2, str.length()));
				}
			}
			
			//return color string if begins with red or blue else return empty string
			public static String seeColor(String str) {
				if(str.length() < 3) {
					return "";
				}
				if(str.length() == 3 && !str.substring(0, 3).equals("red")) {
					return "";
				}
				if(str.length() >= 3) {
					if(str.substring(0, 3).equals("red")) {
						return "red";
					}
					if(str.substring(0, 4).equals("blue")) {
						return "blue";
					}
					}
				return "";
				}
				
			//last two chars swapped
			public static String lastTwo(String str) {
				if(str.length() == 1) {
					return str;
				}
				if(str.length() == 0) {
					return "";
				}
				StringBuilder sb = new StringBuilder(str.substring(0, str.length()-2));
				sb.append(str.substring(str.length()-1)).append(str.substring(str.length()-2, str.length()-1));
				return sb.toString();
			}
			
			//last chars
			public static String lastChars(String a, String b) {
				
				if(a.equals("") && b.equals("")) {
					return "@" + "@";
				}
				else if(a.equals("")) {
					return "@" + b.substring(b.length()-1, b.length());
				}
				else if(b.equals("")) {
					return a.substring(0,1) + "@";
				}
				else {
				String str = a.substring(0, 1) + b.substring(b.length()-1, b.length());
				return str;
				}
			}
			
			//first two
			public static String atFirst(String str) {
				if(str.equals("")) {
					return "@@";
				}
				if(str.length() < 2) {
					return str.substring(0,1) + "@";
				}
				return str.substring(0, 2);
			}
			
			
			
			//hasBad
			
			public static boolean hasBad(String str) {
				if(str.length() < 3) {
					return false;
				}
				else if(str.length() == 3 && str.equals("bad")) {
					return true;
				}
				else if(str.length() > 3) {
				for(int i = 0; i < 4; i++) {
					if(str.substring(0, 4).contains("bad")) {
						return true;
						}
					}
				}
				return false;
			}
			
			//return middle 3
			public static String middleThree(String str) {
				if(str.length() == 3) {
					return str;
				}
				return str.substring(str.length()/2 - 1, str.length()/2 + 2);
			}
			
			//return string of length 2 starting at given index
			public static String twoChar(String str, int index) {
				if(str.length() <= 2 && str.length() <= index + 2) {
					return str;
				}
				if(str.length() < index + 2) {
					return str.substring(0, 2);
				}
				if(index < 0) {
					return str.substring(0, 2);
				}
				return str.substring(index, index+2);
			}
				
	public static void main(String[] args) {
		String r = twoChar("java", -1);
		System.out.println(r);
		
		String s = null;
		
		System.out.println(s.length());
		
	}

}





