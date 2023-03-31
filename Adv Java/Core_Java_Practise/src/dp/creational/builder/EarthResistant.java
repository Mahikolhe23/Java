package dp.creational.builder;

public class EarthResistant implements Builder {
	private Home earthResistantHome = new Home();

	@Override
	public void buildWall() {
		this.earthResistantHome.wall = "Wooden wall";
	}

	@Override
	public void buildFloor() {
		this.earthResistantHome.floor = "Wooden floor";
	}

	@Override
	public void buildTerrace() {
		this.earthResistantHome.terrace = "Wooden Terrace";
	}

	@Override
	public Home buildHome() {
		return this.earthResistantHome;
	}
}
