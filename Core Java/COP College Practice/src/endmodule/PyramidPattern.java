package endmodule;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Num");
		int n = in.nextInt();
		for (int i = 0; i < 2 * n; i++) {
			int col = i > n ? 2 * n - i : i;
			for (int j = 0; j < col; j++) {
				System.out.print("* ");
			}
			System.out.println();
			in.close();
		}
	}
}
