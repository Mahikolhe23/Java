package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.LoginRequest;
import com.app.pojo.User;
import com.app.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService service;

	@PostMapping("/register")
	public User registerUser(@RequestBody User user) {
		return service.Register(user);
	}

	@PostMapping("/login")
	public String login(@RequestBody LoginRequest loginRequest) {
		return service.Login(loginRequest);
	}
}
