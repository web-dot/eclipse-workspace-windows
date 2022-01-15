package com.sharedresourceexample;

public class TestBookings {

	public static void main(String[] args) {
		MovieTicketCounter mt = new MovieTicketCounter();
		TicketBookingJob tJob01 = new TicketBookingJob(mt, "Pauli", 4);
		TicketBookingJob tJob02 = new TicketBookingJob(mt, "Mac", 4); 
		
		Thread t1 = new Thread(tJob01);
		Thread t2 = new Thread(tJob02);
		
		t1.start();
		t2.start();
	}

}
