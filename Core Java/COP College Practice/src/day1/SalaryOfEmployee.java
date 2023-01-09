package day1;

import java.util.Scanner;

public class SalaryOfEmployee {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter the basic salary of employee:");
		int basicSalary=in.nextInt();
		int netSalary=0;
		if(basicSalary<150000) {
			netSalary=basicSalary+0;
		}
		else if(basicSalary > 150000 && basicSalary < 300000) {
			netSalary=(int) (basicSalary-0.2*basicSalary);
		}
		else 
			netSalary=(int) (basicSalary-basicSalary*0.3);
		System.out.println("Net Salary of Employee is :"+ netSalary);
		in.close();
	}
}
