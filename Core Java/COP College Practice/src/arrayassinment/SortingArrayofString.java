package arrayassinment;

//Q1 - sorting for character array- I used bubble sort
import java.util.Arrays;
import java.util.Scanner;

public class SortingArrayofString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		System.out.println("Enter the size of  Array ");
//		int size = in.nextInt();
		char[] arr = { 'b', 'j', 'k', 'd', 'l' };
//		System.out.println("Enter the Array element");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = in.next();
//		}
		swap(arr);
		System.out.print("Sorted Array : ");
		System.out.print(Arrays.toString(arr));
		in.close();
	}

	public static void swap(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] < arr[j - 1]) {
					char temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
	}

}
