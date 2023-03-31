package dp.creational.factory;

public class Main {

	public static void main(String[] args) {
		ProfessionFactory p = new ProfessionFactory();
		Profession p1 = p.getProfession("Engineer");
		p1.print();
	}
}
