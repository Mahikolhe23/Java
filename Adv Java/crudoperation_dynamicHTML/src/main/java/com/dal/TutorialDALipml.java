package com.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pojo.Tutorial;
import com.utils.DbUtils;

public class TutorialDALipml implements ITutorialsDAL {
	private PreparedStatement pst1;
	private Connection con;

	public TutorialDALipml() {
		try {
			con = DbUtils.getConnection();
			pst1 = con.prepareStatement("select* from tutorials where name=?");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Tutorial getTutorialByName(String name) throws SQLException {
		pst1.setString(1, name);
		try (ResultSet rt = pst1.executeQuery()) {
			if (rt.next())
				return new Tutorial(rt.getInt("id"), rt.getString("name"), rt.getString("author"), rt.getInt("visits"),
						rt.getString("contents"), rt.getInt("topic_id"));
		} catch (Exception e) {
		}
		return null;
	}
}
