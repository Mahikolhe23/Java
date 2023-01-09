package endmodule;

public class CloseToZero {

	public static void main(String[] args) {
		int[] A = { -99, 99, -98, 98, -97, -50, 50 };
		int min = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] < 0 && A[i + 1] > 0) {
				min = A[i + 1];
			}
		}
		System.out.println(min);

	}
}
