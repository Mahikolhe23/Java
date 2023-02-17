package pojo;

import java.util.List;
import java.util.Scanner;

public class Tester {
	public static void main(String[] args) throws CustomeExcp {
		try (Scanner in = new Scanner(System.in)) {
			List<Customer> customers = Utils.sampleCustomer();
			boolean exit = true;
			try {
				while (exit) {
					System.out.println("Enter choice to operation");
					System.out.println(
							"1.Registration 2.Display All customers 3.Find Customer by ID 4.Delete Customer by ID 5."
									+ "Update Customer by Id 6.Exit");
					switch (in.nextInt()) {
					case 1:
						System.out.println("Enter FN , LN , Mail,Plans(SILVER, GOLD, PLATINUM, DIAMOND)");
						customers.add(new Customer(in.next(), in.next(), Utils.duplicateEmail(in.next(), customers),
								Plans.valueOf(in.next().toUpperCase())));
						System.out.println("success");
						break;
					case 2:
						System.out.println("Details of all customers : ");
						for (Customer customer : customers) {
							System.out.println(customer);
						}
						break;
					case 3:
						System.out.println("Enter Your ID to display details");
						int id = in.nextInt();
						for (Customer customer : customers) {
							if (customer.getId() == id) {
								System.out.println(customer);
							}
						}
						break;
					case 4:
						System.out.println("Enter Id to delete Details");
						int did = in.nextInt();
						for (Customer customer : customers) {
							if (customer.getId() == did) {
								customers.remove(did);
								System.out.println("Deleted");
							}
						}
						System.out.println("Id not found");
						break;
					case 5:
						System.out.println("Enter Id to update details");
						int cid = in.nextInt();
						System.out.println("Enter New Details : FN , LN , Email");
						Utils.updateDetails(in.next(), in.next(), in.next(), customers, cid);
						break;
					case 6:
						exit = false;
						break;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				in.nextLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
