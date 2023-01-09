package day7;

public class Swap {
	public static void main(String[] args) {
		int[] arr = new int[2];
		arr[0] = 10;
		arr[1] = 20;
		System.out.println("Before Swap : " + arr[0] + " " + arr[1]);
		swap(arr);
		System.out.println("After Swap : " + arr[0] + " " + arr[1]);
	}

	public static void swap(int arr[]) {
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		System.out.println("In Swap : " + arr[0] + " " + arr[1]);
	}
}
