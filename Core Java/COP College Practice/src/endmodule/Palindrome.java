package endmodule;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = in.nextInt();
		int original = n;
		int ans = 0;
		while (n > 0) {
			int rem = n % 10;
			ans = ans * 10 + rem;
			n = n / 10;
		}
		if (ans == original) {
			System.out.println("this is Palindrome number");
		} else
			System.out.println("this is not Palindrome Number");
		in.close();
	}
}
