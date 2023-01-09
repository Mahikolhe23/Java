package day7;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Employee E1 = new Employee();// Default
		Employee E2 = new Employee();// Parameterised
		System.out.println("Enter ID And name ");
		int id = in.nextInt();
		String name = in.next();
		E2.acceptInfo(id, name);
		E2.display();
		in.close();
	}
}
