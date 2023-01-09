package day4and5and6;

//Q6 Complex NUmber
public class ComplexNumber {
	private float real;
	private float imaginary;

	public ComplexNumber() {
		real = 3.14f;
		imaginary = -1.41f;
		System.out.println("This is Default contr");
	}

	public ComplexNumber(float real, float imaginary) {
		this.real = real;
		this.imaginary = imaginary;
		System.out.println("This is Parameterised contr");
	}

	public void setReal(float real) {
		this.real = real;
	}

	public void setImaginary(float imaginary) {
		this.imaginary = imaginary;
	}

	public float getReal() {
		return real;
	}

	public float getImaginary() {
		return imaginary;
	}

	public void display() {
		System.out.println("Real Number is:" + real + "\nImaginary Number is" + imaginary);
	}

}
