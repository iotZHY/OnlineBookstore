package com.hebut.dao;

import com.hebut.model.BookModel;

public interface BookDao {

	boolean update(BookModel book);
	
	boolean delete(String bookId);
	
	boolean add(BookModel book);
	
	BookModel select(BookModel book);
}
