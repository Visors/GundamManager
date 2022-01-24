package com.sayo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sayo.pojo.User;
import com.sayo.utils.DBUtil;

public class UserDaoImpl implements UserDao {
	@Override
	public User selectSingleUser(String username) throws SQLException {
		// TODO Auto-generated method stub
		DBUtil dbUtil = new DBUtil();
		String sql = "select * from users where username=?;";
		PreparedStatement preparedStatement = dbUtil.getPreparedStatement(sql);
		User user = new User();
		try {
			preparedStatement.setString(1, username);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				user.setUsername(resultSet.getString("username"));
				user.setPassword(resultSet.getString("password"));
				System.out.println(user);
				return user;
			}
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
//		System.out.println("Not found!");
		return null;
	}

	@Override
	public User selectSingleUser(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		User user = selectSingleUser(username);
//		System.out.println(username + ' ' + password);
//		System.out.println(user);
//		System.out.println(password.equals(user.getPassword()));
		if (user != null && password.equals(user.getPassword()))
			return user;
//		System.out.println("Not found!");
		return null;
	}

	@Override
	public boolean insertSingleUser(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		if (selectSingleUser(username) != null)
			return false;
		System.out.println("Not found!");
		DBUtil dbUtil = new DBUtil();
		String sql = "insert into users (id, username, password) values (id, ?, ?);";
		PreparedStatement preparedStatement = dbUtil.getPreparedStatement(sql);
		try {
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			System.out.println(preparedStatement.toString());
			preparedStatement.executeUpdate();
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		return true;
	}

}
