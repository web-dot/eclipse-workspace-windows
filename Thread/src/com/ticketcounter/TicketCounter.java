package com.ticketcounter;

//shared resource
public class TicketCounter {
	int availabletickets = 3;

	public void book(String name, int ticketsrequired) {
		if(availabletickets >= ticketsrequired && ticketsrequired > 0) {
			System.out.println(" Hi, " + name + " : " + ticketsrequired + " tickets booked successfully");
			availabletickets = availabletickets - ticketsrequired;
			System.out.println(" after : " + Thread.currentThread().getName() +  " has booked availabletickets = " +  availabletickets);
		}
		else {
			System.out.println(" hi, " + name + " tickets not available");
		}
	}
}
