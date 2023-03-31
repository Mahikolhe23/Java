package dp.creational.abstractFactory;

public class ProfessionFactory extends AbstractFactory {
	public Profession getProfession(String prof) {
		if (prof == null) {
			return null;
		}
		if (prof.equals("Teacher")) {
			return new Teacher();
		}
		if (prof.equals("Engineer")) {
			return new Engineer();
		}
		return null;
	}
}
