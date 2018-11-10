package com.config;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.model.User;

public class UserDataRowMapper implements RowMapper<User> {

	// 进入此方法前已经执行了rs.next()
	public User mapRow(ResultSet rs, int index) throws SQLException {
		User user = new User();
		user.setUserId(rs.getString("userId"));
		user.setUserName(rs.getString("userName"));
		return user;
	}
}
