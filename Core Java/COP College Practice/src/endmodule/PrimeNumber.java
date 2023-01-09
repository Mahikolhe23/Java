package endmodule;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter number");
		int n = in.nextInt();
		boolean v = false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				v = true;
			}
		}
		if (v == true) {
			System.out.println("not prime number");
		} else
			System.out.println("prime num");
		in.close();
	}
}
