package day1;

import java.util.Scanner;

public class PrimeNumerUptoN {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number to print all prime number:");
		int maxNumber = in.nextInt();
		for (int num = 2; num <= maxNumber; num++) {
			boolean isPrime = true;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true)
				System.out.println(num);
			in.close();
		}
	}
}
