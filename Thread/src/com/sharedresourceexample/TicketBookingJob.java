package com.sharedresourceexample;

public class TicketBookingJob implements Runnable{
	MovieTicketCounter tc;
	String name;
	int tickets;
	
	public TicketBookingJob(MovieTicketCounter m, String name, int tickets) {
		this.tc = m;
		this.name = name;
		this.tickets = tickets;
	}
	@Override
	public void run() {
		tc.bookTickets(name, tickets);
	}
}
