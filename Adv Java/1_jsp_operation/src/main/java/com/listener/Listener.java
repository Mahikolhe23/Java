package com.listener;

import java.sql.SQLException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.util.DbUtils;

@WebListener
public class Listener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent sce) {
	}

	public void contextInitialized(ServletContextEvent sce) {
		try {
			DbUtils.openConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
