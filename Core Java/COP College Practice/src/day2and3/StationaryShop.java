package day2and3;

import java.util.Scanner;

public class StationaryShop {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("----Menu----");
		System.out.println("1:Pen(10) 2:Pencil(5) 3:NoteBook(20) 4:Bottle(30) 5:ColorBox(50) 6:Exit");
		int qty, choice, total = 0;
		do {
			System.out.println("Enter Choice ");
			choice = in.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Qty of Pens : ");
				qty = in.nextInt();
				total = total + qty * 10;
				break;
			case 2:
				System.out.println("Enter the Qty of Pencils :");
				qty = in.nextInt();
				total = total + qty * 5;
				break;
			case 3:
				System.out.println("Enter the Qty of NoteBooks :");
				qty = in.nextInt();
				total = total + qty * 20;

				break;
			case 4:
				System.out.println("Enter the Qty of Bottles : ");
				qty = in.nextInt();
				total = total + qty * 30;
				break;
			case 5:
				System.out.println("Enter the Qty of Colorbox : ");
				qty = in.nextInt();
				total = total + qty * 50;
				break;
			case 6:
				System.out.println("Total bill : " + total);
			}
		} while (choice != 6);
		in.close();
	}
}
