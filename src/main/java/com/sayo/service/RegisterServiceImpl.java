package com.sayo.service;

import java.sql.SQLException;

import com.sayo.dao.UserDao;
import com.sayo.dao.UserDaoImpl;

public class RegisterServiceImpl implements RegisterService{
	private UserDao userDao = new UserDaoImpl();
	
	@Override
	public boolean insertSingleUser(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		return userDao.insertSingleUser(username, password);
	}

}
