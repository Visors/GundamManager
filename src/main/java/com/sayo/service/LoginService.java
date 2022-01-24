package com.sayo.service;

import java.sql.SQLException;

import com.sayo.pojo.User;

public interface LoginService {
	User selectSingleUser(String username, String password) throws SQLException;
}
