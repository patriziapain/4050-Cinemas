package cinemaApp;

public class CreditCard {
	 
	// variables 
	private int cardNum;
	private int expDate;
	private String nameOnCard;
	private int CCV;
	private String billingAddress;
	
	//constructor
	public CreditCard (int cardNum, int expDate, String nameOnCard, int CCV, String billAdd) {
		this.cardNum = cardNum;
		this.expDate = expDate;
		this.nameOnCard = nameOnCard;
		this.CCV = CCV;
		billingAddress = billAdd;
	}
	
	//setters
	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
	
	public void setExpDate(int expDate) {
		this.expDate = expDate;
	}
	
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	
	public void setCCV(int CCV) {
		this.CCV = CCV;
	}
	
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	
	//getters
	public int getCardNum() {
		return cardNum;
	}
	
	public int expDate() {
		return expDate;
	}
	
	public String getNameOnCard() {
		return nameOnCard;
	}
	
	public int getCCV() {
		return CCV;
	}
	
	public String getBillingAddress() {
		return billingAddress;
	}
}