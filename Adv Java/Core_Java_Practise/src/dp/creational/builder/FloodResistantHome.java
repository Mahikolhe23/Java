package dp.creational.builder;

public class FloodResistantHome implements Builder {
	private Home floorResistantHome = new Home();

	@Override
	public void buildWall() {
		this.floorResistantHome.wall = "Water Resistant wall";
	}

	@Override
	public void buildFloor() {
		this.floorResistantHome.floor = "10 ft above from ground";
	}

	@Override
	public void buildTerrace() {
		this.floorResistantHome.terrace = "Water Resistant leakage";
	}

	@Override
	public Home buildHome() {
		return this.floorResistantHome;
	}
}
