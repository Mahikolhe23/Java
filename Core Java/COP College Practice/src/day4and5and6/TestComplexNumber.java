package day4and5and6;

//Q6 Complex number
public class TestComplexNumber {

	public static void main(String[] args) {
		ComplexNumber CN1 = new ComplexNumber();
		CN1.display();
		System.out.println("--------------------------------------");

		ComplexNumber CN2 = new ComplexNumber(15.45f, -6.532f);
		CN2.display();
		System.out.println("--------------------------------------");

		CN1.setReal(5.5f);
		CN1.display();
		System.out.println("--------------------------------------");

		CN2.setImaginary(-9.655f);
		CN2.display();
		System.out.println("--------------------------------------");
	}
}
