package com.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class Employee extends BaseEntity {
	@Column(length = 20)
	private String firstName;
	@Column(length = 20)
	private String lastName;
	@Column(length = 20)
	private String email;
	@Column(length = 20, unique = true)
	private String password;
	@Column(length = 20)
	private String joinDate;
	@Column(length = 20)
	private String location;
	@Column(length = 20)
	private String department;
	@Column(length = 20)
	private double salary;

	@Override
	public String toString() {
		return "Employee ID + " + getId() + "[firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", joinDate=" + joinDate + ", location=" + location + ", department=" + department + ", salary="
				+ salary + "]";
	}

	public Employee() {
		this.firstName = "mahi";
		this.lastName = "kolhe";
		this.email = "mkolhe";
		this.password = "pass";
		this.joinDate = "date";
		this.location = "pune";
		this.department = "java";
		this.salary = 1000;
	}

	public Employee(String firstName, String lastName, String email, String password, String joinDate, String location,
			String department, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.joinDate = joinDate;
		this.location = location;
		this.department = department;
		this.salary = salary;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
