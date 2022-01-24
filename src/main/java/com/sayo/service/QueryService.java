package com.sayo.service;

import java.sql.SQLException;

import com.sayo.pojo.Good;

public interface QueryService {
	public Good exactQuerySingleGoodByGoodId(String good_id) throws SQLException;
}
