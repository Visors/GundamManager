package com.sayo.service;

import java.sql.SQLException;

import com.sayo.dao.GoodDao;
import com.sayo.dao.GoodDaoImpl;
import com.sayo.pojo.Good;

public class QueryServiceImpl implements QueryService {
	private GoodDao goodDao = new GoodDaoImpl();

	@Override
	public Good exactQuerySingleGoodByGoodId(String good_id) throws SQLException {
		// TODO Auto-generated method stub
		return goodDao.selectSingleGoodByGoodId(good_id);
	}

}
