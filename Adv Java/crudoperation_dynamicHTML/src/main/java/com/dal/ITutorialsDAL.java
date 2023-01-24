package com.dal;

import java.sql.SQLException;

import com.pojo.Tutorial;

public interface ITutorialsDAL {
	Tutorial getTutorialByName(String name) throws SQLException;
}
