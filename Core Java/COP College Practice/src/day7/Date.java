package day7;

//Lab day 7.1 - Q1
public class Date {
	private int dd;
	private int mm;
	private int yy;

	public Date() {

	}

	public Date(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public void display() {
		System.out.println("Date:" + dd + "-" + mm + "-" + yy);
	}

	public void acceptInfo(int d, int m, int y) {
		this.dd = d;
		this.mm = m;
		this.yy = y;
	}
}
