package day4and5and6;
//Q3
public class TestDate {

	public static void main(String[] args) {
		Date d1= new Date();
		d1.display();
		Date d2=new Date(21,9,22);
		d2.display();
		int day=d2.getDay();
		System.out.println(day);
		int month=d2.getMonth();
		System.out.println(month);
		int year=d2.getYear();
		System.out.println(year);
		Date d3= new Date();
		d3.setter(23, 05, 96);
		d3.display();

	}

}
