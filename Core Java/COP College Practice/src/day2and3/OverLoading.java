package day2and3;

import java.util.Scanner;

public class OverLoading {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number to perform addition:");

		add(in.nextInt(), in.nextInt());
		add(in.nextInt(), in.nextInt(), in.nextInt());
		add(in.nextInt(), in.nextFloat());
		add(in.nextFloat(), in.nextFloat());
		in.close();
	}

	public static void add(int a, int b) {
		System.out.println("Additon of two numbers is:" + (a + b));
	}

	public static void add(int a, int b, int c) {
		System.out.println(("Addition of three numbers is:" + (a + b + c)));
	}

	public static void add(int a, float b) {
		System.out.println("Addition of two number is : " + ((float) a + b));
	}

	public static void add(float a, float b) {
		System.out.println("Addition of two number is :" + (a + b));
	}
}
