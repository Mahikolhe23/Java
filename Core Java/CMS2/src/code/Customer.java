package code;

import java.time.LocalDate;

public class Customer {
	private int id;
	private String name;
	private String email;
	private String passward;
	private double regAmount;
	private Plan plan;
	private LocalDate dob;
	private static int counter;
	static {
		counter = 1;
	}

	public Customer(String name, String email, String passward, double regAmount, Plan plan, LocalDate dob) {
		this.id = counter;
		this.name = name;
		this.email = email;
		this.passward = passward;
		this.regAmount = regAmount;
		this.plan = plan;
		this.dob = dob;
		counter++;
	}

	public Customer(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassward() {
		return passward;
	}

	public void setPassward(String passward) {
		this.passward = passward;
	}

	public double getRegAmount() {
		return regAmount;
	}

	public void setRegAmount(double regAmount) {
		this.regAmount = regAmount;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", passward=" + passward + ", regAmount="
				+ regAmount + ", plan=" + plan + ", dob=" + dob + "]";
	}

}
