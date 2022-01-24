package com.sayo.service;

import java.sql.SQLException;

import com.sayo.dao.UserDao;
import com.sayo.dao.UserDaoImpl;
import com.sayo.pojo.User;

public class LoginServiceImpl implements LoginService {
	private UserDao userDao = new UserDaoImpl();

	@Override
	public User selectSingleUser(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		
		return userDao.selectSingleUser(username, password);
	}

}
