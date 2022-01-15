package com.uttara.practical04;


class TV{
	String name;
	private int channel;
	private int volume;
	boolean isOn = false;
	
	public void on() {
		System.out.println("TV is on");
		isOn = true;
	}
	
	
	public void changeChannel(int channel) {
		if(isOn) {
			this.channel = channel;
			System.out.println("cahnnel changed to " + this.channel);
		}
		else {
			System.out.println("you cant change channels if the TV is off");
		}
	}
	
	public void display() {
		if(isOn) {
			System.out.println("TV is diplaying channel number : " + channel + "and has volume : " + volume);	
		}
		else {
			System.out.println("Please turn the tv on to display");
		}
	}
	
	public void turnOff() {
		System.out.println("tv is turning off");
		isOn = false;
	}

	public void setChannel(int channel) {
		if(isOn == false) {
			System.out.println("please turn the tv on to set channel");
		}
		else {
			this.channel = channel;
			System.out.println("channel set to " + this.channel);
		}
	}

	public void setVolume(int volume) {
		if(isOn == false) {
			System.out.println("please turn the tv on to set volume");
		}
		else {
			this.volume = volume;
			System.out.println("volume set to " + this.volume);
		}
	}
}




public class TestTV {

	public static void main(String[] args) {
		
		TV t1 = new TV();
		t1.setChannel(10);
		t1.on();
		t1.turnOff();
		
		t1.display();
		
		t1.on();
		
		t1.setChannel(30);
		t1.setVolume(20);
		
		t1.display();
		t1.turnOff();
		t1.changeChannel(0);
		t1.on();
		t1.changeChannel(12);
	}

}
