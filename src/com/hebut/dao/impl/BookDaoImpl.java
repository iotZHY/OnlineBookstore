//package com.hebut.dao.impl;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//import com.hebut.dao.BookDao;
//import com.hebut.model.BookModel;
//import com.hebut.utils.JDBCUtils;
//
//public class BookDaoImpl implements BookDao {
//
//	public static final String SQL_BOOK_UPDATE = "UPDATE book "
//			+ "SET bookname =?,bookPrice=?,bookCover=?,bookStock=? "
//			+ "WHERE bookId=?";
//	
//	@Override
//	public boolean update(BookModel book) {
//		Connection conn = JDBCUtils.getConnection();
//		PreparedStatement statement = null;
//		try {
//			//创建预编译环境
//			statement = conn.prepareStatement(SQL_BOOK_UPDATE);
//			//设置sql语句参数
//			statement.setString(1, book.getBookName());
//			statement.setDouble(2, book.getBookPrice());
//			statement.setString(3, book.getBookCover());
//			statement.setInt(4, book.getBookStock());
//			//数据库查询
//			int result = statement.executeUpdate();
//			if(result > 0){
//				return true;
//			}
//				
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
//		finally {
////			关闭数据库
//			JDBCUtils.close(conn, statement);
//		}
//	
//		return false;
//	}
//
//	@Override
//	public boolean delete(String bookId) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean add(BookModel book) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public BookModel select(BookModel book) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}
