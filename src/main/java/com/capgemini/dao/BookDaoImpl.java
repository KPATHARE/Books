package com.capgemini.dao;

import javax.persistence.EntityManager;

import com.capgemini.entities.Book;

public class BookDaoImpl implements BookDao {
	
	private EntityManager entityManager;

	public BookDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	public Book getBookById(int id) {
		Book book = entityManager.find(Book.class, id);
		return book;
	}

	public void addBook(Book book) {
		entityManager.persist(book);
	}

	public void removeBook(Book book) {
		entityManager.remove(book);
	}

	public void updateBook(Book book) {
		entityManager.merge(book);
	}

	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}
}



