package day2and3;

import java.util.Scanner;

public class ArrayofString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String element in Array");
		String[] arr = new String[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.next();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println((arr[i]));
		}
		in.close();
	}
}
