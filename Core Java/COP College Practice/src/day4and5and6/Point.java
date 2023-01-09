package day4and5and6;

//Q5 point x and y
public class Point {
	private int x;
	private int y;

	public Point() {
		x = 0;
		y = 0;
		System.out.println("-----default contr-----");
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("-------Paramterised contr--------");
	}

	public int getPointX() {
		return this.x;
	}

	public int getPointY() {
		return this.y;
	}

	public void setPointX(int x) {
		this.x = x;
	}

	public void setPointY(int y) {
		this.y = y;
	}

	public void display() {
		System.out.println("Point X=" + x + "\nPoint Y=" + y);
	}
}
