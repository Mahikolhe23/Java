package com.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pojo.User;
import com.utils.DbUtils;

public class UserDalimp implements UserDal {
	private Connection con;
	private PreparedStatement stmt;

	// Constructor for Dal
	public UserDalimp() {
		try {
			con = DbUtils.getCon();
			stmt = con.prepareStatement("select* from user where email=? and password=?");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// validation method
	@Override
	public User validateUser(String email, String password) throws SQLException {
		// set parameter to execute query and get the
		stmt.setString(1, email);
		stmt.setString(2, password);
		ResultSet rset = stmt.executeQuery();
		User user = null;
		while (rset.next()) {
			user = new User(rset.getString("name"), rset.getString("email"), rset.getString("password"),
					rset.getString("city"));
		}
		return user;
	}

	public void cleanUp() throws SQLException {
		if (stmt != null) {
			stmt.close();
		}
	}
}
