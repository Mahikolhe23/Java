package day2and3;

public class ConcatenationArray {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 5, 6, 7, 8, 9 };
		int[] result = new int[arr1.length + arr2.length];
		int count = 0;
		for (int i : arr1) {
			result[count] = i;
			count++;
		}
		for (int i : arr2) {
			result[count] = i;
			count++;
		}
		System.out.print("Array Element are :");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}
}
