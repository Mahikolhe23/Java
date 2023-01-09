package day2and3;

import java.util.Scanner;

public class Array2DAccept {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row = in.nextInt();
		System.out.println("Enter the number of columns");
		int col = in.nextInt();
		int[][] arr = new int[row][col];
		System.out.println("Enter Elements of an Array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		System.out.println("Elements of array are:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
			in.close();
		}
	}
}
