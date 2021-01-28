package com.capgemini.service;

import com.capgemini.dao.BookDao;
import com.capgemini.dao.BookDaoImpl;
import com.capgemini.entities.Book;

public class BookServiceImpl implements BookService {
	private BookDao dao;

	public BookServiceImpl() {
		dao = new BookDaoImpl();
	}

	public void addBook(Book book) {
		dao.beginTransaction();
		dao.addBook(book);
		dao.commitTransaction();
	}

	public void updateBook(Book book) {
		dao.beginTransaction();
		dao.updateBook(book);
		dao.commitTransaction();
	}

	public void removeBook(Book book) {
		dao.beginTransaction();
		dao.removeBook(book);
		dao.commitTransaction();
	}

	public Book findBookById(int id) {
		Book book = dao.getBookById(id);
		return book;
	}

}