package day1;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number to check Palindrome or not:");
		int num = in.nextInt();
		int original = num;
		int rev = 0, rem;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (rev == original) {
			System.out.println("This is Palindrome Number");
		} else {
			System.out.println("This is not Palindrome");
			in.close();
		}
	}
}
