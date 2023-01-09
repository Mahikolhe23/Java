package day1;

import java.util.Scanner;

public class Additon {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the value of number 1:");
		int num1  = input.nextInt();
		System.out.println("Please Enter the value of number 2:");
		int num2 = input.nextInt();
		int ans= num1+num2;
		System.out.println("Addition of Entered Number is = "+ ans);
		input.close();
	}
}
