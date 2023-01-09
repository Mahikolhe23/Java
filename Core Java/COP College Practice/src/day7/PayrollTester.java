package day7;

import java.util.Scanner;

//Q3 payroll tester;
public class PayrollTester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Following Details of employee");
		System.out.println("Name , Employee ID , Basic Salary");
		String name = in.next();
		int id = in.nextInt();
		double salary = in.nextDouble();
		Payroll E1 = new Payroll(name, id, salary);
		E1.display();
		in.close();
	}
}
