package com.dal;

import java.sql.SQLException;
import java.util.List;

import com.pojo.Topic;

public interface ItopicsDAL {
	public List<Topic> getAlltopics() throws SQLException;
}
