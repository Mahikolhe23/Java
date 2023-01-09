package day1;

import java.util.Scanner;

public class CheckForVowel {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter the Character :");
		char ch =in.next().charAt(0);
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Enter character is Vowel");
		break;
		default:
			System.out.println("Enter character is consonant");
		}
		in.close();
	}
}
