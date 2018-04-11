
public class Seat {
	private int seatNumber;
	private int hallId;
	private boolean available;
	
	public Seat(int seatNumber, int HallId, boolean available) {
		this.seatNumber = seatNumber;
		this.hallId = hallId;
		this.available = available;
	}
	
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	
	public void setHallId(int hallId) {
		this.hallId = hallId;
	}
	
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	public int getSeatNuber() {
		return seatNumber;
	}
	
	public int getHallId() {
		return hallId;
	}
	
	public boolean getAvailable() {
		return available;
	}
}