package day1;

import java.util.Scanner;

public class Divisibilityby5and7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number to check divisible or not by 5 and 7 :");
		int num = in.nextInt();
		if (num % 5 == 0 && num % 7 == 0) {
			System.out.println("Entered number is divisible by 5 and 7 both");
		} else
			System.out.println("Entered number is not divisible by 5 and 7");
		in.close();
	}
}
