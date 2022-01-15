package com.uttara.spring;

public class WASPoem implements Poem {
	
	String[] lines = {"All the world’s a stage,\r\n"
			+ "And all the men and women merely players;\r\n"
			+ "They have their exits and their entrances;\r\n"
			+ "And one man in his time plays many parts,\r\n"
			+ "His acts being seven ages."};
	@Override
	public void recite() {
		for(String l : lines) {
			System.out.println(l);
		}
	}
	
}
