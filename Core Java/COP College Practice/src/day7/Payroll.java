package day7;
//Q3.Payroll
public class Payroll {
	private int empId;
	private String empName;
	private double baseSal;
	private double hra;
	private int Medical;
	private double pf;
	private double pt = 200;
	private double grosSal;
	private double netSal;

	public Payroll() {

	}

	public Payroll(String empName, int empId, double baseSal) {
		this.empId = empId;
		this.empName = empName;
		this.baseSal = baseSal;
	}

	public void display() {
		hra = 0.5 * baseSal;
		Medical = 1000;
		pf = 0.12 * baseSal;
		pt = 200;
		grosSal = (baseSal + hra + Medical);
		netSal = (grosSal - (pt + pf));
		System.out.println(
				"Name: " + empName + "\nId: " + empId + "\nGross Salary: " + grosSal + "\nNet salary: " + netSal);
	}

}
