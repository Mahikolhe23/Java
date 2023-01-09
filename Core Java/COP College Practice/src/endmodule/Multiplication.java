package endmodule;

public class Multiplication {

	public static void main(String[] args) {
		multi(12.5f, 12.5f);
		multi(12.5f, 12);
		multi(12, 12.5f);
		multi(12, 12);
	}

	static void multi(float a, float b) {
		System.out.println("This is Float * Float and ANS=" + (a * b));
	}

	static void multi(float a, int b) {
		System.out.println("This is Float * int and ANS=" + (a * b));
	}

	static void multi(int a, float b) {
		System.out.println("This is int * Float and ANS=" + (a * b));
	}

	static void multi(int a, int b) {
		System.out.println("This is int * int and ANS=" + (a * b));
	}
}
