package endmodule;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter num");
		int n = in.nextInt();
		int sumofEven = 0;
		int sumofOdd = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				sumofEven = sumofEven + i;
			} else
				sumofOdd = sumofOdd + i;
		}
		System.out.println(sumofEven);
		System.out.println(sumofOdd);
		in.close();
	}
}
