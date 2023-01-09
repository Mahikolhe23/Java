package day2and3;

import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Information of student - ");
		System.out.println("Enter the Roll Number of student : ");
		int rollNo=in.nextInt();
		System.out.println("Enter Name of student :");
		String name= in.next();
		System.out.println("Enter the marks of student in 5 subject out of 100 mark:");
		int m1=in.nextInt();
		int m2=in.nextInt();
		int m3=in.nextInt();
		int m4=in.nextInt();
		int m5=in.nextInt();
		int total=m1+m2+m3+m4+m5;
		float perc=total/5;
		if(perc>75) {
			System.out.println("Name : "+ name + "\nRoll Number : "+rollNo);
			System.out.println("Percentage : " +perc +"\nGrade : A");
		}
		else if(perc>60&&perc<74) {
			System.out.println("Name : "+name + "\nRoll Number : "+rollNo);
			System.out.println("Percentage  : " +perc +"\nGrade : B" );
		}else {
			System.out.println("Name : "+name+ "\nRoll Number : "+rollNo);
			System.out.println("Percentage :"+perc + "Grade : c");
			in.close();
		}		
	}
}
