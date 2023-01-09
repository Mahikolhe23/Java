package day2and3;

import java.util.Scanner;

public class ArrayOperation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of Element you want in Array :");
		int num = in.nextInt();
		int[] arr = new int[num];
		System.out.println("Enter the Array Element : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println(
				"1:Print Array 2:Seach Element 3: Reverse Array 4:Even Number from Array 5:sum of Array Element 6:Exit");
		int operation;
		do {
			System.out.println("\nEnter operation want to perform on array:");
			operation = in.nextInt();

			switch (operation) {
			case 1:
				System.out.println("Element of Array are:");
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				break;
			case 2:
				System.out.println("Enter the element want to search:");
				int target = in.nextInt();
				int count = 0;
				int index = 0;
				for (int i = 0; i < arr.length; i++) {
					if (target == arr[i]) {
						count++;
						index = i;
					}
				}
				if (count == 1) {
					System.out.println("Element found at index:" + index);
				} else {
					System.out.println("Element not found in Array");
				}
				break;
			case 3:
				System.out.println("Reverse Array:");
				for (int i = arr.length - 1; i >= 0; i--) {
					System.out.print(arr[i] + " ");
				}
				break;
			case 4:
				System.out.println("Even Numbers in Array are:");
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] % 2 == 0)
						System.out.print(arr[i] + " ");
				}
				break;
			case 5:
				int sum = 0;
				for (int i = 0; i < arr.length; i++) {
					sum = sum + arr[i];
				}
				System.out.println("Sum of Array Element is :" + sum);
				break;
			case 6:
				System.out.println("PROGRAM END");
				break;
			default:
				System.out.println("Invalid Entry");
			}
		} while (operation != 6);
		in.close();
	}
}
