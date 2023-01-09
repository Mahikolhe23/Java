package day1;

import java.util.Scanner;

public class MenuDrivenPizzaShop {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("----Menu----");
		System.out.println("1:Plane Pizza(100) 2:Cheeze Pizza(120) 3:Margerita(150) 4:Exit");
		int choice, qty, total = 0;
		do {
			System.out.println("Enter choice");
			choice = in.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the Qauntity of Pizza:");
				qty = in.nextInt();
				total = qty * 100;
				break;
			case 2:
				System.out.println("Enter the Qauntity of Pizza:");
				qty = in.nextInt();
				total = total + qty * 120;
				break;
			case 3:
				System.out.println("Enter the Qauntity of Pizza:");
				qty = in.nextInt();
				total = total + qty * 150;
				break;
			case 4:
				System.out.println("Total Bill:" + total);
				break;
			default:
				System.out.println("Invalid Input");
			}
		} while (choice != 4);
		in.close();
	}
}
