package day2and3;

import java.util.Scanner;

public class Addition2DArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of row for 1st 2D Array: ");
		int row1 = in.nextInt();
		System.out.println("Enter the number of column for 1st 2D Array: ");
		int col1 = in.nextInt();
		System.out.println("Enter the number of row for 2nd 2D Array: ");
		int row2 = in.nextInt();
		System.out.println("Enter the number of column for 2nd 2D Array: ");
		int col2 = in.nextInt();
		int[][] arr = new int[row1][col1];
		int[][] arr2 = new int[row2][col2];
		int[][] arr3 = new int[row1][col1];

		System.out.println("Enter the elements of an First Array: ");

		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		System.out.println("Enter the elements of an Second Array: ");
		for (int i = 0; i < row2; i++) {
			for (int j = 0; j < col2; j++) {
				arr2[i][j] = in.nextInt();
			}
		}
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				arr3[i][j] = arr[i][j] + arr2[i][j];
			}
		}
		System.out.println("Sum of two 2D Array :");
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
			in.close();
		}
	}
}
