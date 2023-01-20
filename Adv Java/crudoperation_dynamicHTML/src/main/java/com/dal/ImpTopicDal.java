package com.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pojo.Topic;
import com.utils.DbUtils;

public class ImpTopicDal implements ItopicsDAL {
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rt;

	public ImpTopicDal() {
		try {
			con = DbUtils.getConnection();
			stmt = con.prepareStatement("select* from topics");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Topic> getAlltopics() throws SQLException {
		List<Topic> list = new ArrayList<Topic>();
		rt = stmt.executeQuery();
		while (rt.next()) {
			list.add(new Topic(rt.getInt("id"), rt.getString("name")));
		}
		return list;
	}
}
