package com.app.service;

import com.app.dto.LoginRequest;
import com.app.pojo.User;

public interface UserService {
	User Register(User user);

	String Login(LoginRequest loginRequest);
}
