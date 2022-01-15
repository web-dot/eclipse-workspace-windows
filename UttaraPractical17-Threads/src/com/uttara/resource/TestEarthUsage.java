package com.uttara.level3;


class EarthThread extends Thread
{
	@Override
	public void run() {
		
		Earth e = Earth.getInstance();
		System.out.println(e);
	}
}

public class TestEarthUsage {

	public static void main(String[] args) {
		
		for(int i = 0 ; i < 1000 ; i++)
			new EarthThread().start();
			
	}

}
