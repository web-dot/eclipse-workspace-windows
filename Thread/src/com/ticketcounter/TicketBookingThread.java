package com.ticketcounter;

public class TicketBookingThread extends Thread {
	TicketCounter tc;
	String name;
	int numOfTickets;
	public TicketBookingThread(TicketCounter tc, String name, int numOfTickets) {
		this.tc = tc;
		this.name = name;
		this.numOfTickets = numOfTickets;
	}
	public void run() {
		tc.book(name, numOfTickets);
	}
}
