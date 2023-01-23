package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {
	private static Connection con;

	public static void openConnection() throws SQLException {
		System.out.println("'''open Con'''");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "root123");
	}

	public static Connection getConnection() {
		return con;
	}

	public static void clearConnection() throws SQLException {
		if (con != null)
			con.close();
	}
} 