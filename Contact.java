
public class Contact {
	private String phoneNumber;
	private String email;

	public Contact(String phoneNumber, String email) {
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public String getphoneNumber() {
		return this.phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
