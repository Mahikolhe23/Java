package com.dao;

import static com.util.DbUtils.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pojo.User;

public class UserDal {
	public Connection con;
	public PreparedStatement st;

	public UserDal() throws SQLException {
		System.out.println("-----user DAL---");
		con = getConnection();
		System.out.println("query before");
		st = con.prepareStatement("select* from user where email=? and password=?");
		System.out.println("query after");
	}

	public User validate(String email, String password) throws SQLException {
		st.setString(1, email);
		st.setString(2, password);
		try (ResultSet rst = st.executeQuery()) {
			System.out.println("query exe");
			if (rst.next()) {
				System.out.println(rst.getInt(1));
				return new User(rst.getInt(1), rst.getString(2), email, password, rst.getString(5), rst.getString(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
