package com.sayo.dao;

import java.sql.SQLException;

import com.sayo.pojo.Good;

public interface GoodDao {
	public Good selectSingleGoodByGoodID(String good_id) throws SQLException;

	public boolean insertSingleGood(Good good) throws SQLException;

	public boolean editGood(Good good) throws SQLException;

	public boolean deleteSingleGoodByGoodId(String good_id) throws SQLException;
}
