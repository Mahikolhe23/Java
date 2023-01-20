package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {
	// 1 connection obj
	private static Connection con;

	// 2 Connect to DB
	public static void OpenConnection() throws SQLException, ClassNotFoundException {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3307/java", "root", "root123");
	}

	// 3 getter for connection
	public static Connection getConnection() {
		return con;
	}

	// 4 close connection
	public void closeConnection() throws SQLException {
		if (con != null) {
			con.close();
		}
	}
}
