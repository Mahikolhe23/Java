package day1;

import java.util.Scanner;

public class MenuDrivenOperation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ans, num1, num2, choice;
		do {
			System.out.println("Enter the choice that operation want to perform");
			System.out.println("1:Addition 2:Subtraction 3:Multiplication 4:Division 5:Exit");
			choice = in.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Please Enter Numbers :");
				num1 = in.nextInt();
				num2 = in.nextInt();
				ans = num1 + num2;
				System.out.println("Addition of two Number is = " + ans);
				break;
			case 2:
				System.out.println("Please Enter Numbers :");
				num1 = in.nextInt();
				num2 = in.nextInt();
				ans = num1 - num2;
				System.out.println("Subtraction of two number is = " + ans);
				break;
			case 3:
				System.out.println("Please Enter Numbers :");
				num1 = in.nextInt();
				num2 = in.nextInt();
				ans = num1 * num2;
				System.out.println("Multiplication of two number is = " + ans);
				break;
			case 4:
				System.out.println("Please Enter Numbers :");
				num1 = in.nextInt();
				num2 = in.nextInt();
				ans = num1 / num2;
				System.out.println("Division of Two Number is = " + ans);
				break;
			case 5:
				System.out.println("-----Program End------");
				break;
			default:
				System.out.println("INVALID CHOICE");
			}
		} while (choice != 5);
		in.close();
	}
}
