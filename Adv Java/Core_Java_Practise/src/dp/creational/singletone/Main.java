package dp.creational.singletone;

public class Main {

	public static void main(String[] args) {
		SingleTon st = SingleTon.getSingleTon();
		SingleTon st2 = SingleTon.getSingleTon();
		st.getHashcode();
		st2.getHashcode();
		System.out.println(st);
		System.out.println(st2);
	}
}
