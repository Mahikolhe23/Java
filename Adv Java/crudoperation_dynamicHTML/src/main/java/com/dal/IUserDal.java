package com.dal;

import java.sql.SQLException;

import com.pojo.User;

public interface IUserDal {
	User userAuth(String email, String password) throws SQLException;
}
