
public class Hall {
	private int hallId;
	private int availableSeats;
	
	public Hall(int hallId, int availableSeats) {
		this.hallId = hallId;
		this.availableSeats = availableSeats;
	}
	
	public void setHallId(int hallId) {
		this.hallId = hallId;
	}
	
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	
	public int getHallId() {
		return hallId;
	}
	
	public int getAvailableSeats() {
		return availableSeats;
	}
}
