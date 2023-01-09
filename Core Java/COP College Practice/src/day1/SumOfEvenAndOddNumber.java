package day1;

import java.util.Scanner;

public class SumOfEvenAndOddNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number for sum of all even and odd:");
		int num = in.nextInt();
		int sumofeven = 0;
		int sumofodd = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				sumofeven = sumofeven + i;
			} else {
				sumofodd += i;
			}
		}
		System.out.println("The sum of all  Even number :" + sumofeven);
		System.out.println("The sum of all odd number :" + sumofodd);
		in.close();
	}
}