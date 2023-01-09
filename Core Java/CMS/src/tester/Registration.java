package tester;

import static code.Customer.sdf;
import static code.CustomerDemoDetails.customerlist;
import static code.ValidationRules.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import code.Customer;
import code.CustomerHandlingException;
import code.Type;

public class Registration {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			ArrayList<Customer> customerList = customerlist();
			boolean exit = false;
			while (!exit) {
				System.out.println("1.Customer Registration 2.Display All customer Details 3.Customer Login "
						+ "4.Change Passworrd 5.Un-Subscribe Customer 6.Name of customer borned between specified dates "
						+ "7.Specific plan customer details 8.Exit");
				System.out.println("Enter choice");
				try {
					switch (in.nextInt()) {
					case 1:
						System.out.println("Enter Customer Details: Name,Email,Password,Registraion Amount,"
								+ "Date of Birth,Choose Service Plan From 1.Silver,2.Gold 3.Platinum 4.Diamond ");
						// Checking all customer details and register if valid
						Customer c1 = new Customer(in.next(), emailValidate(in.next(), customerList),
								passwordValidation(in.next()), in.nextDouble(), parsAndDatevalidation(in.next()),
								typeValidation(in.next()));
						customerList.add(c1);
						System.out.println("Customer Registration successfully");
						break;
					case 2:
						System.out.println("All Customer Details");
						// Using Iterator Display customer details
						Iterator<Customer> itr = customerList.iterator();
						while (itr.hasNext()) {
							System.out.println(itr.next());
						}
						break;
					case 3:
						System.out.println("Enter Email");
						String find = in.next();
						for (Customer i : customerList) {
							if (i.getEmail().equals(find)) {
								System.out.println("Enter Password");
								if (i.getPassword().equals(in.next())) {
									System.out.println("Login Successfully");
									break;
								} else
									throw new CustomerHandlingException("Invalid Password");
							} else
								throw new CustomerHandlingException("Invalid Email");
						}
						break;
					case 4:
						System.out.println("Enter Email to change Password");
						find = in.next();
						for (Customer i : customerList) {
							if (i.getEmail().equals(find)) {
								System.out.println("Enter old Password");
								if (i.getPassword().equals(in.next())) {
									System.out.println("Enter new Password");
									i.setPassword(in.next());
									System.out.println("Password Change Successfully");
									break;
								} else
									throw new CustomerHandlingException("Invalid Old Password");
							} else
								throw new CustomerHandlingException("Invalid Email");
						}
						break;
					case 5:
						System.out.println("Enter User Id ");
						int id = in.nextInt();
						Iterator<Customer> itrr = customerList.iterator();
						for (Customer i : customerList) {
							if (i.getId() == id) {
								itrr.next();
								itrr.remove();
							} else
								throw new CustomerHandlingException("User Not Found");
						}
						break;
					case 6:
						System.out.println("Enter Dob of customer");
						Date beginDate = sdf.parse(in.next());
						Date endDate = sdf.parse(in.next());
						for (Customer i : customerList) {
							if (i.getDob().after(beginDate) && i.getDob().before(endDate)) {
								i.getName();
							}
						}
						break;
					case 7:
						System.out.println("Enter Plan Name");
						Type t = Type.valueOf(in.next().toUpperCase());
						for (Customer i : customerList) {
							if (i.getType() == t) {
								i.getName();
							}
						}
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
