package com.sayo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sayo.pojo.Good;
import com.sayo.utils.DBUtil;

public class GoodDaoImpl implements GoodDao {
	@Override
	public Good selectSingleGoodByID(String good_id) throws SQLException {
		// TODO Auto-generated method stub
		DBUtil dbUtil = new DBUtil();
		String sql = "select * from goods where good_id=?;";
		PreparedStatement preparedStatement = dbUtil.getPreparedStatement(sql);
		Good good = new Good();
		try {
			preparedStatement.setString(1, good_id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				good.setGood_id(resultSet.getString("good_id"));
				good.setType(resultSet.getString("type"));
				good.setName(resultSet.getString("name"));
				good.setPrice(resultSet.getString("price"));
				good.setSource(resultSet.getString("source"));
				good.setLast_date(resultSet.getDate("last_date"));
				good.setNext_date(resultSet.getDate("next_date"));
				return good;
			}
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean edit(Good good) throws SQLException {
		// TODO Auto-generated method stub
		DBUtil dbUtil = new DBUtil();
		String sql = "update goods set type=?,name=?,price=?,source=?,last_date=?,next_date=? where good_id=?;";
		PreparedStatement preparedStatement = dbUtil.getPreparedStatement(sql);
		try {
			System.out.println(good);
			preparedStatement.setString(1, good.getType());
			preparedStatement.setString(2, good.getName());
			preparedStatement.setString(3, good.getPrice());
			preparedStatement.setString(4, good.getSource());
			preparedStatement.setDate(5, (java.sql.Date) good.getLast_date());
			preparedStatement.setDate(6, (java.sql.Date) good.getNext_date());
			preparedStatement.setString(7, good.getGood_id());
			int rs = preparedStatement.executeUpdate();
			if (rs == 1)
				return true;
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		return false;
	}
}
