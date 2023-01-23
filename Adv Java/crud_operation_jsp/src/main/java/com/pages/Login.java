package com.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dal.UserDalimp;
import com.pojo.User;
import com.utils.DbUtils;

@WebServlet("/login")
public class Login extends HttpServlet {
	UserDalimp userDao;

	public void init(ServletConfig config) throws ServletException {
		try {
			DbUtils.openConnection();
			userDao = new UserDalimp();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void destroy() {
		try {
			userDao.cleanUp();
			DbUtils.closeConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try (PrintWriter pw = response.getWriter();) {
			pw.write("<h1>Login Validation Page</h1>");
			String user = request.getParameter("email");
			String pass = request.getParameter("password");
			User userobj = userDao.validateUser(user, pass);
			if (userobj != null) {
				pw.write("<h1>welcome to portal</h1>");
				System.out.println();
				pw.write("<h1>" + userobj.toString() + "</h1>");
				pw.write("<h1>Below is list of products</h1>");
			} else {
				pw.write("<h1>Invalid user</h1>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
