package code;

import static code.Customer.sdf;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ValidationRules {
	// Email Validation Method
	public static String emailValidation(String email) throws CustomerHandlingException {
		String pattern = "^[\\w-\\.]+@([\\w-]+\\.)+(com|org)$";
		// Customer newM = new Customer(email);
		if (email.matches(pattern)) {
			return email;
		} else {
			throw new CustomerHandlingException("Enter valid Email");
		}
	}

	public static String emailValidate(String email, List<Customer> listN) throws CustomerHandlingException {
		Customer newM = new Customer(email);
		emailValidation(email);
		if (listN.contains(newM)) {
			throw new CustomerHandlingException("Customer Already Exist!!!!!!!");
		}
		return email;
	}

	// Password Validation method
	public static String passwordValidation(String password) throws CustomerHandlingException {
		String regex = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[#@$*%]).{5,20}";
		if (!password.matches(regex)) {
			throw new CustomerHandlingException("Enter valid Password");
		}
		return password;

	}

	// Type validation method
	public static Type typeValidation(String type) throws CustomerHandlingException {
		try {
			return Type.valueOf(type.toUpperCase());
		} catch (IllegalArgumentException e) {
			StringBuilder sb = new StringBuilder("Select Valid Types");
			sb.append(Arrays.toString(Type.values()));
			throw new CustomerHandlingException(sb.toString());
		}
	}

	// Dob validation method
	public static Date parsAndDatevalidation(String date) throws ParseException, CustomerHandlingException {
		Date dob = sdf.parse(date);
		if (dob.after(sdf.parse("01-01-1995"))) {
			throw new CustomerHandlingException("Dob Must before 01-01-1995");
		}
		return dob;
	}
//	public static Customer customerValidation(String name, String email, String pwd, double amount, String dob,
//			String type, List<Customer> list) {
//		emailValidate(email, list);
//		passwordValidation(pwd);
//		Date d1 = parsAndDatevalidation(dob);
//		
//
//		return customer;
//	}

}
