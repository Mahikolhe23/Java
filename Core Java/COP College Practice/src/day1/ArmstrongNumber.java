package day1;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number to check Armstrong or not :");
		int n = in.nextInt();
		System.out.println(armstrongNumber(n));
		in.close();
	}

	static String armstrongNumber(int n) {
		int originalNumber, remainder, result = 0;
		originalNumber = n;
		while (originalNumber != 0) {
			remainder = originalNumber % 10;
			result += Math.pow(remainder, 3);
			originalNumber /= 10;
		}
		if (result == n)
			return "Yes";
		else
			return "No";
	}
}
