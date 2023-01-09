package endmodule;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number ");
		int n = in.nextInt();
		int sum = 1;
		for (int i = 1; i < n; i++) {
			sum = sum + sum * i;
		}
		System.out.println(sum);
		in.close();
	}
}
