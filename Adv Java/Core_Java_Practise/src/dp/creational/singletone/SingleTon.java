package dp.creational.singletone;

public class SingleTon {
	private static SingleTon st = new SingleTon();

	private SingleTon() {
	}

	public static SingleTon getSingleTon() {
		return st;
	}

	public void getHashcode() {
		System.out.println(st);
	}
}
