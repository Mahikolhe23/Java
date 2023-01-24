package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {
	// this class is use to make connection with database

	// 1 create static obj which make it as single tone class
	private static Connection con;

	// 2 connect with data base
	public static void openConnection() throws SQLException, ClassNotFoundException {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3307/java", "root", "root123");
	}

	// 3 getter for this connection
	public static Connection getCon() {
		return con;
	}

	// 4 after operation close this connection
	public static void closeConnection() throws SQLException {
		if (con != null) {
			con.close();
		}
	}
}
