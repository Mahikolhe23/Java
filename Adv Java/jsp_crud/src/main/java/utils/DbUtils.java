package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DbUtils {
	private static SessionFactory sf;
	static {
		// singleton session factory
		System.out.println("in sf ");
		sf = new Configuration().configure().buildSessionFactory();
	}

	public static SessionFactory getSF() {
		return sf;
	}
}
