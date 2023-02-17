package pojo;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private static int count;
	private Plans plan;
	static {
		count = 1;
	}

	public Customer(String firstName, String lastName, String email, Plans plan) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.id = count;
		this.plan = plan;
		count++;
	}

	public Customer() {

	}

	public Plans getPlan() {
		return plan;
	}

	public void setPlan(Plans plan) {
		this.plan = plan;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [Id = " + getId() + " firstName = " + firstName + ", lastName = " + lastName + ", email = "
				+ email + ", Plan = " + getPlan() + "]";
	}
}
