
public class Customer {
	private String name;
	private Contact contact;

	public Customer(String name, Contact contact) {
		this.name = name;
		this.contact = contact;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Contact getContact() {
		return this.contact;
	}
	
	public void setContact(Contact contact) {
		this.contact = contact;
	}
}
