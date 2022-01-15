package UttaraTest01;

public class TestPalindrome {

	
	public static String findLargestPalindrome(String str) {
		
		StringBuilder sb = new StringBuilder();
		
		char[] ca = str.toCharArray();
		
		for(int i = 0; i < ca.length-1; i++) {
			sb.append(ca[i]);
			if(ca[i] == ca[i+1]) {
				break;
			}
			
		}
		
		return sb.toString();
	}
	
	
	
	
	public static void main(String[] args) {
		
										  //abababa
		String str = findLargestPalindrome("abababaab");
		System.out.println(str);
		//abababaab

	}

}
