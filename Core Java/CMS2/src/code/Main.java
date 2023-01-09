package code;

import static code.UtilityClass.addCustomer;
import static java.time.LocalDate.parse;
import static code.UtilityClass.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			ArrayList<Customer> customers = populateCustomer();
			boolean exit = false;
			while (!exit) {
				System.out.println("Enter choice");
				System.out.println("1.Customer Reg 2.Display All Customer Details 3.Customer Login");
				try {
					switch (in.nextInt()) {
					case 1:
						System.out.println("Enter Details :Name,Email,Password,Reg_Amt, Plan,DOB");
						Customer c = addCustomer(in.next(), in.next(), in.next(), in.nextDouble(), parse(in.next()),
								in.next().toUpperCase(), customers);
						customers.add(c);
						System.out.println("Success");
						break;
					case 2:
						for (Customer customer : customers) {
							System.out.println(customer);
						}
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					in.nextLine();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
