package day1;

import java.util.Scanner;

public class MaximumOfThreeNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Three number one by one:");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		if (num1 > num2 && num1 > num3) {
			System.out.println("Number 1 is Maximum Number among three");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("Number 2 is Maximum Number among three");
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("Number 3 is Maximum Number among three");
		}in.close();
	}
}
