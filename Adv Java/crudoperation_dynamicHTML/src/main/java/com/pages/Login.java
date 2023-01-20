package com.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dal.ImpTopicDal;
import com.dal.ImpUserDal;
import com.pojo.Topic;
import com.pojo.User;
import com.utils.DbUtils;

@WebServlet("/login")
public class Login extends HttpServlet {
	ImpUserDal userDAL;
	ImpTopicDal topicDAL;

	public void init(ServletConfig config) throws ServletException {
		try {
			DbUtils.OpenConnection();
			userDAL = new ImpUserDal();
			topicDAL = new ImpTopicDal();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text.html");
		List<Topic> list = new ArrayList<Topic>();
		try (PrintWriter pw = response.getWriter()) {
			User user = userDAL.userAuth(request.getParameter("email"), request.getParameter("password"));
			if (user != null) {
				pw.write("<h1>Welcome to Portal " + user.getName() + "</h1>");
				pw.write("<h2>" + user + "</h2>");
				pw.write("<h2>List of Topics</h2>");
				list = topicDAL.getAlltopics();
				pw.write("<h3>" + list.toString() + "</h3>");
				
			} else {
				pw.write("<h1>Invalid User</h1>");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void destroy() {

	}
}
