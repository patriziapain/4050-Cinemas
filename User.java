
public class User {

	private int id;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	private int rank;
	
	public User(int id, String email, String password, String firstName, String lastName, String phoneNumber, String address, int rank) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.rank = rank;
		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getId() {
		return id;
	}
	
	public String getEmail() {
		
		return email;
	}
	
	public String getPassword() {
		
		return password;
	}
	
	public String getFirstName() {
		
		return firstName;
	}
	
	public String getLastName() {
		
		return lastName;
	}
	
	public String getPhoneNumber() {
		
		return phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getRank() {
		return rank;
	}

}
