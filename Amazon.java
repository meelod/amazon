import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Amazon {

	public static void main(String args[]) throws FileNotFoundException {
		System.out.println("Meelod Waheed");
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		ArrayList<PrimeCustomer> primeCustomerList = new ArrayList<PrimeCustomer>();
		
		Scanner scan = new Scanner(new File("test2.txt"));
		
		int numberOfPrime = 0;
		int numberOfCustomers = 0;
		
		while (scan.hasNext()) {
			String type = scan.nextLine();
			if (type.equals("P")) {
				String name = scan.nextLine();
				int ID = scan.nextInt();
				String email = scan.next();
				String phoneNumber = scan.nextLine();
				Contact contact = new Contact(phoneNumber, email);
				PrimeCustomer p = new PrimeCustomer(name, contact, ID);
				primeCustomerList.add(p);
				numberOfPrime ++;
						
			} else if (type.equals("C")) {
				String name = scan.nextLine();
				String email = scan.nextLine();
				String phoneNumber = scan.nextLine();
				Contact contact = new Contact(phoneNumber, email);
				Customer c = new Customer(name, contact);
				customerList.add(c);
				numberOfCustomers++;
			}
		}
		scan.close();
		
		System.out.println("There are " + numberOfPrime + " prime customer:");
		for (PrimeCustomer p: primeCustomerList) {
			System.out.println(p.getName() + "Email = " + p.getContact().getEmail());
		}
		
		System.out.println("There are " + numberOfCustomers + " customer:");
		for (Customer c: customerList) {
			System.out.println(c.getName() + ", Phone Number = " + c.getContact().getphoneNumber());
		}
	}
}