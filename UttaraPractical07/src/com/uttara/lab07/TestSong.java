package com.uttara.lab07;


public class TestSong {

	public static void main(String[] args) {
		
		//Song s1 = new Song();
		//Song s2 = new Song();
		
		/*
		s1.setName("ABC");
		s1.setLyrics("this is s1 lyrics");
		
		s2.setName("XYZ");
		s2.setLyrics("this is s2 lyrics");
		
		s1.play();
		s2.play();
		
		s1.setLyrics("changed lyrics for s1");
		s2.setLyrics("changed lyrics for s2");
		
		s1.play();
		s2.play();
		*/
		
		
		
		//Song s3 = new Song("S3 NAME", "");
		Song s4 = new Song("S4 NAME", "s4 LYRICS");
		
		//s3.play();
		s4.play();
		
		
		//set only name song
		
		
		Song s5 = new Song("s5 NAME");
		s5.play(); //prints NULL as the value for the instance variable was never set and y default the value is NULL
		
		
		s5.setLyrics("s5 LYRICS");
		
		s5.play();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}