package com.sayo.dao;

import java.sql.SQLException;

import com.sayo.pojo.User;

public interface UserDao {
	public User selectSingleUser(String username) throws SQLException;
	
	public User selectSingleUser(String username, String password) throws SQLException;
	
	public boolean insertSingleUser(String username, String password) throws SQLException;
}
