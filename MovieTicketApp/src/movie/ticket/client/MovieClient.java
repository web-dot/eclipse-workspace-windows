package movie.ticket.client;
import movie.ticket.counter.*;
public class MovieClient {

	public static void main(String[] args) {
		MovieTicketBooking m1 = new MovieTicketBooking();
		MovieTicketThread t1 = new MovieTicketThread(4, "peter", m1);
		MovieTicketThread t2 = new MovieTicketThread(4, "carl", m1);
		t1.start();
		t2.start();
	}

}
