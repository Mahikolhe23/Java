package com.dal;

import java.sql.SQLException;

import com.pojo.User;

public interface UserDal {
	//abstract method for user dal 
	User validateUser(String email, String password) throws SQLException;
}

