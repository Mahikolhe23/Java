package day7;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		// int[] arr = { -1, 0, 2, 5, 4, 1, 6, 65, 7, 8 };
		int[] arr2 = { 'b', 's', 'y', 'z', 'e', 't', 'y' };
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 1; j < arr2.length - i; j++) {
				if (arr2[j] < arr2[j - 1]) {
					int temp = arr2[j];
					arr2[j] = arr2[j - 1];
					arr2[j - 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr2));

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 1; j < arr.length - i; j++) {
//				if (arr[j] < arr[j - 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j - 1];
//					arr[j - 1] = temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
	}
}
