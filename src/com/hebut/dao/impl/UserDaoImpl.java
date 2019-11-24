package com.hebut.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hebut.dao.UserDao;
import com.hebut.model.UserModel;
import com.hebut.utils.JDBCUtils;

public class UserDaoImpl implements UserDao{

	private static final String SQL_USER_LOGIN = "SELECT userId from user WHERE userId=? AND password=?";
	
	@Override
	public int login(String userId, String password) {
		Connection conn = JDBCUtils.getConnection();
		PreparedStatement statement = null;
		ResultSet result = null;
		
		try {
			//创建预编译环境
			statement = conn.prepareStatement(SQL_USER_LOGIN);
			//设置sql语句参数
			statement.setString(1, userId);
			statement.setString(2, password);
			System.out.println(userId+password);
			//数据库查询
			result = statement.executeQuery();
			if(result.next()){
				return 1;
			}
				
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
//			关闭数据库
			JDBCUtils.close(conn, statement);
		}
		return 0;
	}

	@Override
	public boolean insert(UserModel user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(UserModel user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserModel select(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
