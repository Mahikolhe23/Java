package com.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pojo.User;
import com.utils.DbUtils;

public class ImpUserDal implements IUserDal {
	public Connection con;
	public PreparedStatement stmt;
	public ResultSet rt;

	// constructor for DAL layer
	public ImpUserDal() {
		try {
			con = DbUtils.getConnection();
			stmt = con.prepareStatement("select* from user where email=? and password=?");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// validation method
	@Override
	public User userAuth(String email, String password) throws SQLException {
		stmt.setString(1, email);
		stmt.setString(2, password);
		rt = stmt.executeQuery();
		User user = null;
		while (rt.next()) {
			user = new User(rt.getString("name"), rt.getString("email"), rt.getString("password"),
					rt.getString("city"));
		}
		return user;
	}
}
