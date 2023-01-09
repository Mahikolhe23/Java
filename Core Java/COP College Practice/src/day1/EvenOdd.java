	package day1;
	
	import java.util.Scanner;
	
	public class EvenOdd {
	
		public static void main(String[] args) {
			System.out.println("Please Enter the number want to check Even or odd:");
			Scanner in = new Scanner(System.in);
			int num = in.nextInt();
			if (num % 2 == 0) {
				System.out.println("Entered Number is Even");
			} else
				System.out.println("Entered Numbe is odd");
			in.close();
		}
	}
