package com.capgemini.dao;

import com.capgemini.entities.Book;

public interface BookDao {
	public abstract Book getBookById(int id);

	public abstract void addBook(Book book);

	public abstract void removeBook(Book book);

	public abstract void updateBook(Book book);

	public abstract void commitTransaction();

	public abstract void beginTransaction();

}
