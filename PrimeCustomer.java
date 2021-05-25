
public class PrimeCustomer extends Customer {
	private int variableID;
	private String name;

	public PrimeCustomer(String name, Contact contact, int variableID) {
		super(name, contact);
		this.variableID = variableID;
		this.name = name;
	}
	
	public int getVariableID() {
		return this.variableID;
	}
	
	public void setVariableID(int ID) {
		this.variableID = ID;
	}
	
	@Override
	public String getName() {
		return "ID #" + this.variableID + " = " + this.name + ", ";
	}
}
