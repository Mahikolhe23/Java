package day1;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Please Enter the Number 1:");
		int num1=in.nextInt();
		System.out.println("Please Enter the Number 2:");
		int num2 =in.nextInt();
		System.out.println("Before Swapping Numbe are num1:"+num1+ " and num2:"+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After Swapping Number are num1:"+num1+ " and num2:"+num2);
		in.close();
	}
}
