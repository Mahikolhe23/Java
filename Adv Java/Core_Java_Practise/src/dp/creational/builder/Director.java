package dp.creational.builder;

public class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public Home getCompleteHome() {
		return this.builder.buildHome();
	}

	public void getHomeRequirement() {
		this.builder.buildFloor();
		this.builder.buildTerrace();
		this.builder.buildWall();
	}
}
