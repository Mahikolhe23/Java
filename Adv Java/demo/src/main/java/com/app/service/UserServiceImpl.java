package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.UsersRepo;
import com.app.dto.LoginRequest;
import com.app.pojo.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UsersRepo userRepo;

	@Override
	public User Register(User user) {
		return userRepo.save(user);
	}

	@Override
	public String Login(LoginRequest loginRequest) {
		List<User> list = userRepo.findAll();
		for (User user : list) {
			if (user.getEmail().equals(loginRequest.getEmail())
					&& user.getPassword().equals(loginRequest.getPassword()))
				return "Login success";
		}
		return "Login Fail";
	}
}
