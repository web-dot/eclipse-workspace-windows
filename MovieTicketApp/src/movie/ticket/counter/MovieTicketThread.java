package movie.ticket.counter;

public class MovieTicketThread extends Thread {
	private int numOfTickets;
	private String pname;
	MovieTicketBooking movieTicketBooking;
	public MovieTicketThread(int numOfTickets, String pname, MovieTicketBooking movieTicketBooking) {
		super();
		this.numOfTickets = numOfTickets;
		this.pname = pname;
		this.movieTicketBooking = movieTicketBooking;
	}
	@Override
	public void run() {
		movieTicketBooking.bookTickets(pname, numOfTickets);
	}
	
}
