package com.hebut.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCUtils {
	
	private final static String USERNAME = "root";
	private final static String PASSWORD = "root";
	private final static String URL = "jdbc:mysql://localhost:3306/hebut?serverTimezone=UTC";
	private final static String DRIVER = "com.mysql.jdbc.Driver";
	
	public static Connection getConnection()
	{
		try {
			Class.forName(DRIVER);
			System.out.println("驱动加载成功！");
			Connection conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			System.out.println("数据库连接成功！");
			return conn;
		} catch (ClassNotFoundException e) {
			System.out.println("驱动加载失败！");
		} catch (SQLException e) {
			System.out.println("数据库连接失败！");
		}
		//连接失败返回null
		return null;
	}
	
	public static void close(Connection conn,PreparedStatement pstate) {
		
		try {
			if(conn!=null){
				conn.close();
			}
			if(pstate != null)
				pstate.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
