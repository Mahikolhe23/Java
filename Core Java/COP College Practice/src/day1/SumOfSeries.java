package day1;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number till want sum of all number :");
		int num=in.nextInt();
		int ans =0;
		for(int i=0;i<=num;i++) {
			ans+=i;
		}
		System.out.println("Sum of all number is :"+ans);
		in.close();
	}
}
