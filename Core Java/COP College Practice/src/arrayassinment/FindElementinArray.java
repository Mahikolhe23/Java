package arrayassinment;

import java.util.Scanner;

//Q5 and Q6 - finding target in array
public class FindElementinArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int size = in.nextInt();
		System.out.println("Enter the array element");
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("Enter the target element you want to search : ");
		int target = in.nextInt();
		search(arr, target);
		in.close();
	}

	public static void search(int[] arr, int target) {
		int count = 0;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (target == arr[i]) {
				count++;
				index = i;
			}
		}
		if (count == 1) {
			System.out.println("Target Element is found at Index : " + index);
		} else {
			System.out.println("Target is not found");
		}
	}
}
