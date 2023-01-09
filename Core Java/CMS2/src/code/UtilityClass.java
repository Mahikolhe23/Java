package code;

import java.time.LocalDate;
import java.util.ArrayList;
import static java.time.LocalDate.parse;
import static code.Plan.*;

public class UtilityClass {

	// Validate Email
	public static String validateEmail(String email) throws CustomException {
		String pattern = "^[\\w-\\.]+@([\\w-]+\\.)+(com|org)$";
		if (email.matches(pattern))
			return email;
		throw new CustomException("Invalid Email");
	}

	// check if customer already exist
	public static String checkEmail(String email, ArrayList<Customer> list) throws CustomException {
		Customer c = new Customer(email);
		validateEmail(email);
		if (list.contains(c))
			throw new CustomException("Customer Already Exist");
		return email;
	}

	// validate password
	public static String passwordValidate(String password) throws CustomException {
		String pass = "(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[#@$*%]).{4,10}";
		if (!password.matches(pass))
			throw new CustomException("Invalid Password");
		return password;
	}

	// DOB validation
	public static LocalDate validateDate(LocalDate d) throws CustomException {
		LocalDate dd = LocalDate.parse("1995-01-01");
		if (d.isBefore(dd))
			return d;
		throw new CustomException("Invalid DOB");
	}

	// Plan validation
	public static Plan planValidation(String plan) throws CustomException {
		try {
			return Plan.valueOf(plan.toUpperCase());
		} catch (Exception e) {
			e.printStackTrace();
			throw new CustomException("Invalid Plan Details");
		}
	}

	// validate customer details and invokes all validation method
	public static Customer addCustomer(String name, String email, String password, double regamt, LocalDate d,
			String plan, ArrayList<Customer> list) throws CustomException {
		checkEmail(email, list);
		passwordValidate(password);
		validateDate(d);
		planValidation(plan);
		return new Customer(name, email, password, regamt, Plan.valueOf(plan), d);
	}

	// Samples Customer Details
	public static ArrayList<Customer> populateCustomer() {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer("abc1", "abcd11@gmail.com", "Abcd@11", 1100, valueOf("GOLD"), parse("1991-06-01")));
		customers
				.add(new Customer("abc2", "abcd12@gmail.com", "Abcd@12", 1200, valueOf("SILVER"), parse("1990-11-15")));
		customers.add(
				new Customer("abc3", "abcd13@gmail.com", "Abcd@13", 1300, valueOf("PLATINUM"), parse("1992-01-26")));
		customers.add(
				new Customer("abc4", "abcd14@gmail.com", "Abcd@14", 1400, valueOf("DIAMOND"), parse("1993-05-05")));
		customers.add(new Customer("abc5", "abcd15@gmail.com", "Abcd@15", 1500, valueOf("GOLD"), parse("1994-05-05")));
		return customers;
	}
}