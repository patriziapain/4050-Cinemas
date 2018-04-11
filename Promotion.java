package cinemaApp;
import java.util.Date;

public class Promotion {
	
	//variables
	private int id;
	private Date expDate;
	private String code;
	private int percentCount;
	
	//constructor
	public Promotion(int id, Date expDate, String code, int percentage) {
		this.id = id;
		this.expDate = expDate;
		this.code = code;
		percentCount = percentage;	
	}
	
	//setters
	public void setId(int id) {
		this.id = id;
	}
	
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public void setPercentCount(int percentCount) {
		this.percentCount = percentCount;
	}
	
	//getters
	public int getId() {
		return id;
	}
	
	public Date getExpDate() {
		return expDate;
	}
	
	public String getCode() {
		return code;
	}
	
	public int getPercentCount() {
		return percentCount;
	}
}
