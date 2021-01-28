package com.capgemini.entities;


import java.io.Serializable;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Books")
public class Book implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	private String book_name;
	private String author_name;
	private int price;
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
