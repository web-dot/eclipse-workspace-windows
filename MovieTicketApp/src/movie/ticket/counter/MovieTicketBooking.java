package movie.ticket.counter;

public class MovieTicketBooking {
	int availableTickets = 5;
	String pname;
	public synchronized void bookTickets(String pname, int numOfTickets) {
		if(availableTickets >= numOfTickets && numOfTickets > 0) {
			System.out.println("Hi, " + pname + " : " + numOfTickets + " tickets booked");
			availableTickets = availableTickets -  numOfTickets;
			System.out.println("after " + Thread.currentThread().getName() + " : " + availableTickets);
		}
		else {
			System.out.println("Hi, " + pname + " :tickets not available");
		}
	}
}
