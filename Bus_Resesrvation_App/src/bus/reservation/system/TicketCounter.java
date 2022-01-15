package bus.reservation.system;

public class TicketCounter {
	
	private int availableSeats = 3;
	
	public  void bookTicket(String pname, int numberOfSeats) {
		if(availableSeats >= numberOfSeats && numberOfSeats > 0) {
			System.out.println("Hi, " + pname + " : " + numberOfSeats + " seats booked Sucessfully..");
			availableSeats = availableSeats - numberOfSeats;
			System.out.println("after " + Thread.currentThread().getName() + " : " + "availableSeats : " + availableSeats);
		}
		else {
			System.out.println("Hi, " + pname + " : seats not available");
		}
	}
}
