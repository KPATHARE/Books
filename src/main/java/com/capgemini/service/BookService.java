package com.capgemini.service;

import com.capgemini.entities.Book;

public interface BookService {
	
	public abstract void addBook(Book book);

	public abstract void updateBook(Book book);

	public abstract void removeBook(Book book);

	public abstract Book findBookById(int id);


}
