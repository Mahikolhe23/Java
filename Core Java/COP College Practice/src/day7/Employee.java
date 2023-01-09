package day7;

import java.util.Scanner;

//Lab day 7.1 - Q2
public class Employee {
	private int id;
	private String name;
	Date d = new Date();
	Scanner sc = new Scanner(System.in);

	public Employee() {

	}

	public Employee(int id, String name, int dd, int mm, int yy) {
		this.id = id;
		this.name = name;
	}

	public void acceptInfo(int id, String name) {
		System.out.println("Enter Date of Birth of Emp");
		int dd = sc.nextInt();
		int mm = sc.nextInt();
		int yy = sc.nextInt();
		d.acceptInfo(dd, mm, yy);
		this.name = name;
		this.id = id;
	}

	public void display() {
		System.out.println("ID : " + id + "\nName : " + name);
		d.display();
	}
}
