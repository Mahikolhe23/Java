package day4and5and6;

//Q8 For multiple user base class logic

public class BankAccountBLArray {
	private int accountnumber;
	private String name;
	private int balance;
	private static int counter;
	private static String bankname;
	private String email;
	private String city;

	BankAccountBLArray() {

	}

	BankAccountBLArray(String name, int balance, String city, String email) {
		this.accountnumber = counter;
		this.name = name;
		this.balance = balance;
		this.city = city;
		this.email = email;
		counter++;
	}

	static {
		counter = 1001;
		bankname = "SBI BANK";
	}

	public void displayBal() {
		System.out.println("Current Balance of Account is:" + balance);
	}

	public void displayDetails() {
		System.out.print("\nBank Name : " + bankname + "\nName : " + name + "\nAccount Number : " + accountnumber
				+ "\nBalance : " + balance + "\nCity :" + city + "\nEmail :" + email);
	}

	public void deposit(int depo) {
		balance = balance + depo;
	}

	public void withdraw(int wd) {
		balance = balance - wd;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAcc() {
		return this.accountnumber;
	}

	public String getName() {
		return this.name;
	}
}