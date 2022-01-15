package com.ticketcounter;

public class Test {

	public static void main(String[] args) {
		TicketCounter tc = new TicketCounter();
		
		TicketBookingThread t1 = new TicketBookingThread(tc, "John", 2);
		TicketBookingThread t2 = new TicketBookingThread(tc, "John", 2);
		
		t1.start();
		t2.start();
	}

}
