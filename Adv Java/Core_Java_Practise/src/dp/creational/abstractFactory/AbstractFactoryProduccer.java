package dp.creational.abstractFactory;

public class AbstractFactoryProduccer {

	public static AbstractFactory getProfession(boolean isTrainee) {
		if (isTrainee) {
			return new TraineeProfessionFactory();
		} else
			return new ProfessionFactory();
	}
}
