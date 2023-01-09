package day4and5and6;

//Q7 For single user client code
import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BankAccountBL A1 = new BankAccountBL();
		int choice;
		System.out.println("---Menu--- \n1:Deposit 2:Withdraw 3:Display Balance 4:Display All Details 5:Exit");
		do {
			System.out.println("Enter the choice");
			choice = in.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the Amount want to deposit:");
				A1.deposit(in.nextInt());
				break;
			case 2:
				System.out.println("Enter the Amount want to withdraw:");
				A1.withdraw(in.nextInt());
			case 3:
				A1.displayBal();
				break;
			case 4:
				A1.displayDetails();
				break;
			case 5:
				System.out.println("** Thank You for banking with us **");
				break;
			default:
				System.out.println("Invalid Entry");
			}
		} while (choice != 5);
		in.close();
	}
}
