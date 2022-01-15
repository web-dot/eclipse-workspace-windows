package com.uttara.practical05;



public class TestSong {

	public static void main(String[] args) {
		
		Song s1 = new Song();
		Song s2 = new Song();
		
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
		
		
		//set only name song
		
		
		Song s3 = new Song();
		s3.setName("NAME OF S3 SONG");
		s3.play(); // instance variable set to null if not initialied
		
		s3.setLyrics("LYRICS FOR S3");
		s3.play();
	}

}
