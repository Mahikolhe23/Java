package code;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer implements Comparable<Customer> {
	private int id;
	private String name;
	private String email;
	private String password;
	private double registrationAmount;
	private Date dob;
	private Type type;
	private static int counter;
	public static SimpleDateFormat sdf;

	public Customer(String name, String email, String password, double registrationAmount, Date dob, Type type) {
		this.id = counter;
		this.name = name;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.type = type;
		counter++;
	}

	public Customer(String email) {
		this.email = email;
	}

	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
		counter = 1;
	}

	@Override
	public boolean equals(Object anathorCust) {
		if (anathorCust instanceof Customer) {
			return this.email.equals(((Customer) anathorCust).email);
		}
		return false;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", registrationAmount=" + registrationAmount + ", dob=" + sdf.format(dob) + ", type=" + type + "]";
	}

	// Natural Ordering
	@Override
	public int compareTo(Customer o) {
		System.out.println("in cust: compareTo");
		return this.email.compareTo(o.email);
	}

	public String getEmail() {
		return email;
	}

	public int getId() {
		return id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public Type getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public static SimpleDateFormat getSdf() {
		return sdf;
	}

	public static void setSdf(SimpleDateFormat sdf) {
		Customer.sdf = sdf;
	}

	public Date getDob() {
		return dob;
	}
}
