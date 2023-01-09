package endmodule;

import java.util.Scanner;

public class MinAndMax {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Element in Array");
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Min=" + min + "Max=" + max);
		in.close();
	}
}
