package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Loader {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Driver Class loading
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Connecting DB connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root123");
		// Obtain statement
		Statement st = con.createStatement();
		// EXecute Query
		ResultSet r = st.executeQuery("select empno,ename,job,sal from emp");
		while (r.next()) {
			System.out.printf("%d %s %s %.1f ", r.getInt(1), r.getString(2), r.getString(3), r.getDouble(4));
			System.out.println();
		}
		con.close();
	}
}
