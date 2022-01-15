package com.sharedresourceexample;

public class MovieTicketCounter {
	int availableTickets = 4;
	public void bookTickets(String name, int noOfTickets) {
		if(availableTickets >= noOfTickets && noOfTickets > 0) {
			System.out.println("Hi, " + name  + " : tickets are booked");
			availableTickets = availableTickets - noOfTickets;
			System.out.println(Thread.currentThread().getName() + " available tickets = " + availableTickets);
		}
		else {
			System.out.println("Hi, " + name + " tickets are not available");
		}
	}
}
