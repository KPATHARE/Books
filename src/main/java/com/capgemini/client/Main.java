package com.capgemini.client;
import com.capgemini.entities.Book;
import com.capgemini.service.BookService;
import com.capgemini.service.BookServiceImpl;

public class Main {
	public static void main(String[] args) {
		BookService service = new BookServiceImpl();
		Book book = new Book();
		book.setId(1001);
		book.setBook_name("abc");
		book.setAuthor_name("A");
		book.setPrice(100);
		service.addBook(book);
		Book book1 = new Book();
		book1.setId(1002);
		book1.setBook_name("Pqr");
		book1.setAuthor_name("B");
		book1.setPrice(200);
		service.addBook(book);
		
		book = service.findBookById(1001);
		System.out.print("ID:"+book.getId());
		System.out.println(" Name:"+book.getBook_name());
		System.out.println("Author"+book.getAuthor_name());
		System.out.println("Price"+book.getPrice());
		
		book.setBook_name("XYZ");
		service.updateBook(book);
		
		
		book = service.findBookById(1001);
		System.out.print("ID:"+book.getId());
		System.out.println(" Name:"+book.getBook_name());
		System.out.println("Author"+book.getAuthor_name());
		System.out.println("Price"+book.getPrice());
		
		
		service.removeBook(book);
		System.out.println("done");
		
		
		

	}


}
