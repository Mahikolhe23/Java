package endmodule;

import java.util.Scanner;

public class FindinArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Element in Array");
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("enter target to search");
		int target = in.nextInt();
		int c = 0;
		int ind = 0;
		for (int i = 0; i < arr.length; i++) {
			if (target == arr[i]) {
				c++;
				ind = i;
			}
		}
		if (c == 1) {
			System.out.println("Target found at index" + ind);
		}
		in.close();
	}
}
