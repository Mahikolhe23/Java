package day1;

import java.util.Scanner;

public class AngleIsValid {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the all Angle of Triangle :");
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int a3 = in.nextInt();
		int angle = a1 + a2 + a3;
		if (angle == 180) {
			System.out.println("This is a valid Triangle");
		} else
			System.out.println("This is not valid Triangle");
		in.close();
	}
}
