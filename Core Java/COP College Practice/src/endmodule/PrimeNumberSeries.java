package endmodule;

import java.util.Scanner;

public class PrimeNumberSeries {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter num");
		int n = in.nextInt();
		for (int i = 2; i <= n; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i);
			}
		}
		in.close();
	}
}
