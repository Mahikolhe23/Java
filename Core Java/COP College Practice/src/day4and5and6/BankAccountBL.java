package day4and5and6;

//Q7 For single user base class logic
public class BankAccountBL {
	public int accountnumber;
	private String name;
	private int balance;

	BankAccountBL() {
		accountnumber = 1111;
		name = "SBIAccount";
		balance = 5000;
	}

	BankAccountBL(int accountnumber, String name, int balance) {
		this.accountnumber = accountnumber;
		this.name = name;
		this.balance = balance;
	}

	public void displayBal() {
		System.out.println("Current Balance of Account is:" + balance);
	}

	public void displayDetails() {
		System.out.println("Name:" + name + "\nAccount Number:" + accountnumber + "\nBalance" + balance);
	}

	public void deposit(int depo) {
		balance = balance + depo;
	}

	public void withdraw(int wd) {
		balance = balance - wd;
	}
}