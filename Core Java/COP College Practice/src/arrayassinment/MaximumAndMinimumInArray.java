package arrayassinment;

import java.util.Scanner;

//Q10 - Maximum and Minimum In array
public class MaximumAndMinimumInArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = in.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the element of an array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		int max = 0;
		int min = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Maximum Element : " + max + "Minimum Element : " + min);
		in.close();
	}
}
