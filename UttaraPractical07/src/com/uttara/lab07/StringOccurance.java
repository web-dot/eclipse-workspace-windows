package com.uttara.lab07;

public class StringOccurance {

	
	public static int countOccurance(String inptString, String strToSearch) {
		int count = 0;
		int pos = 0;
		while((pos = (inptString.indexOf(strToSearch, pos))) != -1) {
			++count;
			++pos;
		}
		return count;
	}
	
	
	public static void main(String[] args) {
			
		
		System.out.println(countOccurance("this is a good day", "is"));
		System.out.println(countOccurance("But Buck was neither house-dog nor kennel-dog. The whole realm\r\n"
				+ "was his. He plunged into the swimming tank or went hunting with\r\n"
				+ "the Judge's sons; he escorted Mollie and Alice, the Judge's\r\n"
				+ "daughters, on long twilight or early morning rambles; on wintry\r\n"
				+ "nights he lay at the Judge's feet before the roaring library fire;\r\n"
				+ "he carried the Judge's grandsons on his back, or rolled them in\r\n"
				+ "the grass, and guarded their footsteps through wild adventures\r\n"
				+ "down to the fountain in the stable yard, and even beyond, where\r\n"
				+ "the paddocks were, and the berry patches. Among the terriers he\r\n"
				+ "stalked imperiously, and Toots and Ysabel he utterly ignored, for\r\n"
				+ "he was king,--king over all creeping, crawling, flying things of\r\n"
				+ "Judge Miller's place, humans included.", "he"));
		System.out.println(countOccurance("hello worlld", "ll"));
		

	}

}
