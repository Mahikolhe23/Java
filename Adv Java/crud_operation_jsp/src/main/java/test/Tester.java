package test;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.UserDaoImpl;
import pojos.Department;
import pojos.User;
import utils.DbUtils;

public class Tester {

	public static void main(String[] args) {
		UserDaoImpl u = new UserDaoImpl();
		try (SessionFactory sf = DbUtils.getSF(); Scanner in = new Scanner(System.in)) {
			System.out.println("running");
			System.out.println("Enter the details :firstName, lastName, email, department, salary, dob, isPermanent");
			User user = new User(in.next(), in.next(), in.next(), Department.valueOf(in.next()), in.nextDouble(),
					LocalDate.parse(in.next()), in.nextBoolean());
			System.out.println(u.addUserDetails(user));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
