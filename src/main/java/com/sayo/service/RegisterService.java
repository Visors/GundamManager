package com.sayo.service;

import java.sql.SQLException;

public interface RegisterService {
	boolean insertSingleUser(String username, String password) throws SQLException;
}
