package day1;

import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number M=");
		int num = in.nextInt();
		System.out.println("Enter the Power N=");
		int n = in.nextInt();
		int power = 1;
		for (int i = 0; i < n; i++) {
			power =power*num;
		}
		System.out.println(num + " Raised to power " + n + " is =" + power);
		in.close();
	}
}
