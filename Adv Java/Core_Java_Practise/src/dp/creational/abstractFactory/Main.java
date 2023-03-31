package dp.creational.abstractFactory;

public class Main {

	public static void main(String[] args) {
		AbstractFactory ab = AbstractFactoryProduccer.getProfession(false);
		Profession p = ab.getProfession("Engineer");
		p.print();
	}
}
