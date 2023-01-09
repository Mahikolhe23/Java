package arrayassinment;

import java.util.Scanner;

//Q4 Avg of array element
public class AverageOfArrayElement {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = in.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the Element of array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		int avg = sum / size;
		System.out.println("Average of Array : " + avg);
		in.close();
	}
}
