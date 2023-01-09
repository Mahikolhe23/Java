package day1;

import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number to check prime or not:");
		int num=in.nextInt();
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("This is Prime Number ");
		}
		else 
		{
			System.out.println("This is not Prime Number ");
		}
		in.close();
	}
}
