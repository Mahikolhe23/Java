package pojo;

import java.util.ArrayList;
import java.util.List;

public class Utils {
	// sample data
	public static List<Customer> sampleCustomer() {
		List<Customer> list = new ArrayList<>();
		list.add(new Customer("Niku", "kolhe", "nikitapatil@gmail.com", Plans.GOLD));
		list.add(new Customer("Ankita", "Patil", "ankitapatil@gmail.com", Plans.SILVER));
		list.add(new Customer("Mahendra", "Kolhe", "mkolhe23@gmail.com", Plans.PLATINUM));
		return list;
	}

	// email validation
	public static String emailValidation(String email) throws CustomeExcp {
		String regex = "^(.+)@(.+)$";
		if (email.matches(regex))
			return email;
		throw new CustomeExcp("Email syntax not valid");
	}

	// duplicate Email validate
	public static String duplicateEmail(String email, List<Customer> list) throws CustomeExcp {
		emailValidation(email);
		for (Customer customer : list) {
			if (customer.getEmail().equals(email)) {
				throw new CustomeExcp("Duplicate Email found");
			}
		}
		return email;
	}

	// update customer details
	public static String updateDetails(String name, String last, String email, List<Customer> list, int cid)
			throws CustomeExcp {

		for (Customer customer : list) {
			if (customer.getId() == cid) {
				customer.setEmail(duplicateEmail(email, list));
				customer.setFirstName(name);
				customer.setLastName(last);
				return "update success";
			}
		}
		throw new CustomeExcp("Id not Found");
	}
}
