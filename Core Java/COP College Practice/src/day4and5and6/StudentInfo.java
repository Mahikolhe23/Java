package day4and5and6;
//Q1 student info
import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int total;
		float perc;
		System.out.println("Enter the roll number and  Marks of Student:");
		int rollNo = in.nextInt(), mark1 = in.nextInt(), mark2 = in.nextInt(), mark3 = in.nextInt();
		total = mark1 + mark2 + mark3;
		perc = total / 3;
		System.out.println("Roll Number:" + rollNo);
		display(total, perc);
		in.close();
	}
	public static void display(int totalM, float perC) {
		System.out.println("Total Marks of Student :" + totalM + "Percentage of student is :" + perC);
	}
}
