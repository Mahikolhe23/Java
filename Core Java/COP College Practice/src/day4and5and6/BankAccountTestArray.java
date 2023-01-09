package day4and5and6;

//Q8 For multiple user base class logic
import java.util.Scanner;

public class BankAccountTestArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How Many Account You want to create:");
		int totalA = in.nextInt();
		BankAccountBLArray[] B = new BankAccountBLArray[totalA];
		System.out.println("Enter the Details =  Name , Balance , Email , City");

		for (int i = 0; i < B.length; i++) {
			B[i] = new BankAccountBLArray(in.next(), in.nextInt(), in.next(), in.next());
		}

		System.out.println("First Account Number is:" + B[0].getAcc());
		int choice;
		do {
			System.out.println("\nEnter the choice for Main Menu :");
			System.out.println("**** Menu ****");
			System.out.println(
					"1:Deposit 2:WithDraw 3:Display Balance 4:Display All Details 5:Money Transfer 6:Update Detail 7:Exit");
			choice = in.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the Account number to deposit");
				int acc = in.nextInt();
				int count = 0;
				int index = 0;
				for (int i = 0; i < B.length; i++) {
					int adf = B[i].getAcc();
					if (acc == adf) {
						count++;
						index = i;
					}
				}
				if (count == 1) {
					System.out.println("Enter the Amount");
					B[index].deposit(in.nextInt());
					B[index].displayBal();
				} else {
					System.out.println("Account not found ");
				}
				break;
			case 2:
				System.out.println("Enter the Account number to withdraw");
				acc = in.nextInt();
				count = 0;
				index = 0;
				for (int i = 0; i < B.length; i++) {
					if (acc == B[i].getAcc()) {
						count++;
						index = i;
					}
				}
				if (count == 1) {
					System.out.println("Enter the Amount");
					B[index].withdraw(in.nextInt());
					B[index].displayBal();
				} else {
					System.out.println("Account not found ");
				}
				break;
			case 3:
				System.out.println("Enter the Account to display Balance");
				acc = in.nextInt();
				count = 0;
				index = 0;
				for (int i = 0; i < B.length; i++) {
					if (acc == B[i].getAcc()) {
						count++;
						index = i;
					}
				}
				if (count == 1) {
					B[index].displayBal();
					;
				} else {
					System.out.println("Account not found ");
				}
				break;
			case 4:
				System.out.println("Enter the Account to display All details");
				acc = in.nextInt();
				count = 0;
				index = 0;
				for (int i = 0; i < B.length; i++) {
					if (acc == B[i].getAcc()) {
						count++;
						index = i;
					}
				}
				if (count == 1) {
					B[index].displayDetails();
					;
				} else {
					System.out.println("Account not found ");
				}
				break;
			case 5:
				System.out.println("Enter the Account numbber from you want to send Money:");
				int sender = in.nextInt();
				count = 0;
				int senderindex = 0;
				int receiverindex = 0;
				for (int i = 0; i < B.length; i++) {
					if (sender == B[i].getAcc()) {
						count++;
						senderindex = i;
					}
				}
				if (count == 1) {
					System.out.println("Enter the account number to send money");
					int receiver = in.nextInt();
					for (int i = 0; i < B.length; i++) {
						if (receiver == B[i].getAcc()) {
							count++;
							receiverindex = i;
						}
					}
					if (count == 2) {
						System.out.println("Enter Money you want to tranfer:");
						int money = in.nextInt();
						B[senderindex].withdraw(money);
						B[receiverindex].deposit(money);
					} else {
						System.out.println("Receiver account not found");
					}
				} else {
					System.out.println("Sender Account Not found");
				}
				break;
			case 6:
				System.out.println("Enter the Account Number to Update Details:");
				int accNoUP = in.nextInt();
				count = 0;
				index = 0;
				for (int i = 0; i < B.length; i++) {
					if (accNoUP == B[i].getAcc()) {
						count++;
						index = i;
					}
				}
				if (count == 1) {
					System.out.println("Enter the Choice for updating Info. 1:Name 2:Email 3:city ");
					int ch = in.nextInt();
					switch (ch) {
					case 1:
						System.out.println("Enter New Name:");
						B[index].setName(in.next());
						break;
					case 2:
						System.out.println("Enter New Email :");
						B[index].setEmail(in.next());
						break;
					case 3:
						System.out.println("Enter New City :");
						B[index].setCity(in.next());
						break;
					default:
						System.out.println("Invalid Entry");
					}

				} else {
					System.out.println("Account not found ");
				}
				break;
			case 7:
				System.out.println("Thank You for banking with Us");
				break;
			default:
				System.out.println("Invalid Entry");
			}
		} while (choice != 7);
		in.close();
	}
}
