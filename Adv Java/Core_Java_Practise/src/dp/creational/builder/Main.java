package dp.creational.builder;

public class Main {
	public static void main(String[] args) {
		EarthResistant er = new EarthResistant();
		Director d = new Director(er);
		d.getHomeRequirement();
		Home home = d.getCompleteHome();
		System.out.println(home);
		System.out.println(home.terrace);
	}
}
