package day2and3;

import java.util.Scanner;

public class MaxandMininArray {
	public static int range(int[] temp, int n) {
		int range = getmax(temp, n) - getmin(temp, n);
		return range;
	}

	public static int getmin(int[] arr, int n) {
		int min = arr[0];
		for (int i = 0; i < n; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int getmax(int[] arr, int n) {
		int max = arr[0];
		for (int i = 0; i < n; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many Element you want to enter in Array: ");
		int No = in.nextInt();
		int[] arr = new int[No];
		System.out.println("Enter the element of Array");
		for (int i = 0; i < No; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println(getmin(arr, No) + getmax(arr, No) + range(arr, No));
	}
}