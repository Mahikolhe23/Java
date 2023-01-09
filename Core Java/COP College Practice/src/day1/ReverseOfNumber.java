package day1;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number for Reverse of Number :");
		int num = in.nextInt();
		int rem, rev = 0;
		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println("Reverse of given number is :" + rev);
		in.close();
	}
}
