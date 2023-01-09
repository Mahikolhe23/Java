package code;

import static code.ValidationRules.parsAndDatevalidation;

import java.text.ParseException;
import java.util.ArrayList;

public class CustomerDemoDetails {
	public static ArrayList<Customer> customerlist() throws CustomerHandlingException, ParseException {
		ArrayList<Customer> customers = new ArrayList<Customer>(100);
		customers.add(new Customer("Mahendra", "mkolhe23@gmail.com", "Mahi@23", 2500,
				parsAndDatevalidation("01-05-1994"), Type.GOLD));
		customers.add(new Customer("Mahi", "mahikolhe23@gmail.com", "Mahi@123", 2700,
				parsAndDatevalidation("23-07-1992"), Type.DIAMOND));
		customers.add(new Customer("MK", "mahi23@gmail.com", "Mahi@1234", 3000, parsAndDatevalidation("11-09-1990"),
				Type.PLATINUM));
		return customers;
	}
}
