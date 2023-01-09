package day4and5and6;

//Q5 point x and y
public class TestPoint {

	public static void main(String[] args) {
		Point P1 = new Point();
		P1.display();

		Point P2 = new Point(15, 15);
		P2.display();
		System.out.println("-----------------------------");

		P1.setPointX(12);
		P1.display();
		System.out.println("-----------------------------");

		P2.setPointY(16);
		P2.display();
		System.out.println("-----------------------------");

	}

}
