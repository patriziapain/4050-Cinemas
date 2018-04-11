import java.util.Date;

public class OrderHistory {
	private Date showtime;
	private String movieTitle;
	private float totalPrice;
	private int adultTickets;
	private int childTickets;
	private int seniorTickets;
	
	public Date getShowtime() {
		return showtime;
	}
	public void setShowtime(Date showtime) {
		this.showtime = showtime;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getAdultTickets() {
		return adultTickets;
	}
	public void setAdultTickets(int adultTickets) {
		this.adultTickets = adultTickets;
	}
	public int getChildTickets() {
		return childTickets;
	}
	public void setChildTickets(int childTickets) {
		this.childTickets = childTickets;
	}
	public int getSeniorTickets() {
		return seniorTickets;
	}
	public void setSeniorTickets(int seniorTickets) {
		this.seniorTickets = seniorTickets;
	}
}
