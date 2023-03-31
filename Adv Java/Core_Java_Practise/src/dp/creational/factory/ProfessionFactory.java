package dp.creational.factory;

public class ProfessionFactory {
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
