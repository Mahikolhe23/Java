package endmodule;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number");
		int n = in.nextInt();
		int a = 0;
		int b = 1;
		System.out.print(a + " " + b);
		for (int i = 2; i < n; i++) {
			int c = a + b;
			System.out.print(" " + c + " ");
			a = b;
			b = c;
		}
		in.close();
	}
}
