package dp.creational.abstractFactory;

public class TraineeProfessionFactory extends AbstractFactory {

	@Override
	Profession getProfession(String prof) {
		if (prof == null) {
			return null;
		}
		if (prof.equals("Engineer")) {
			return new TraineeEngineer();
		}
		if (prof.equals("Teacher")) {
			return new TraineeTeacher();
		}
		return null;
	}
}
