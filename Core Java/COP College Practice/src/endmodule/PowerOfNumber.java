package endmodule;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter base ans power number");
			float base = in.nextFloat();
			int power = in.nextInt();
			float sum = 1;
			for (; power != 0; power--) {
				sum = sum * base;
			}
			System.out.println(sum);
		}
	}
}
