package com.sayo.dao;

import java.sql.SQLException;

import com.sayo.pojo.Good;

public interface GoodDao {
	public Good selectSingleGoodByID(String good_id) throws SQLException;

	public boolean edit(Good good) throws SQLException;
}
