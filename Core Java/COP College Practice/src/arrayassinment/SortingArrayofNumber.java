package arrayassinment;

//Q1 - sorting of number array - I used bubble sort
import java.util.Arrays;
import java.util.Scanner;

public class SortingArrayofNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of  Array ");
		int size = in.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the Array element");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		swap(arr);
		System.out.print("Sorted Array : ");
		System.out.print(Arrays.toString(arr));
		in.close();
	}

	public static void swap(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
	}

}
