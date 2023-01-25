package tester;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import dao.EmployeeDaoImpl;
import pojos.Department;
import pojos.Employee;

public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		EmployeeDaoImpl newEmp = new EmployeeDaoImpl();

		// 1 add emp
//		System.out.println("Enter emp:firstName, lastName, dept, salary, dob, isPermanent");
//		Employee emp = new Employee(in.next(), in.next(), Department.valueOf(in.next()), in.nextDouble(),
//				LocalDate.parse(in.next()), in.nextBoolean());
//		System.out.println(newEmp.addEmpDetails(emp));

		// 2 list of emp by dept and salary
//		System.out.println("Enter dept and sal");
//		List<Employee> list = newEmp.getEmpsByDeptAndSalary(Department.valueOf(in.next()), in.nextDouble());
//		list.forEach(System.out::println);

		// 3 list with specific details
//		List<Employee> list = newEmp.getEmpWithSpecificDetails();
//		list.forEach(System.out::println);

		// 4 Transfer emp to a new department n salary raise, having specified first
		// name n last name
		// System.out.println(newEmp.transferAndRaise(in.next(), in.next(),
		// Department.valueOf(in.next()), in.nextDouble()));

		// 5 delete all temp emp
//		System.out.println("Enter dept to delete all emp");
//		System.out.println(newEmp.deleteAllTempEmp(Department.valueOf(in.next())));
	}
}