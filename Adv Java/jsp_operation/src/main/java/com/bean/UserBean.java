package com.bean;

import java.sql.SQLException;

import com.dao.UserDal;
import com.pojo.User;

public class UserBean {
	private String email;
	private String password;
	private User user;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassord() {
		return password;
	}

	public void setPassord(String password) {
		this.password = password;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserBean() {
		super();
	}

	public String validate() throws SQLException {
		UserDal userdal = new UserDal();
		user = userdal.validate(email, password);
		System.out.println(user);
		if (user != null) {
			if (user.getRole().equals("admin"))
				return "admin.jsp";
		} else
			return "customer.jsp";
		return "login.jsp";
	}
}
