package endmodule;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		// Sum of Cube is Equal to number
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number");
		int n = in.nextInt();
		int original = n;
		int digit = String.valueOf(original).length();
		int sum = 0;
//		while (n > 0) {
//			int a = n % 10;
//			digit++;
//			n = n / 10;
//		}
		n = original;
		for (int i = 0; i < digit; i++) {
			int rem = n % 10;
			sum = sum + (int) Math.pow(rem, digit);
			n = n / 10;
		}
		if (original == sum) {
			System.out.println("This is Armstrong");
		} else
			System.out.println("this is not ");
		in.close();
	}
}
