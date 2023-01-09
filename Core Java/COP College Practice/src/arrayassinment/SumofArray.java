package arrayassinment;

import java.util.Scanner;

//Q2 sum of array
public class SumofArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size = in.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the Array Element");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("Sum of Element of array : " + sum(arr));
		in.close();
	}

	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
}
