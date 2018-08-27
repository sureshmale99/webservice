package com.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.domain.Book;

public class ProductServiceImpl {

	public List<String> getProducts() {
		   List<String> result = new ArrayList<String>();
		   result.add("books");
		   result.add("pens");
		   return result;
	   }
	
	public List<Book> getBooks() {
		   List<Book> result = new ArrayList<Book>();
		   Book book = new Book();
		   book.setAuthor("Suresh");
		   book.setStore("abc");
		   book.setTitle("Game");
		   result.add(book);
		   Book book1 = new Book();
		   book1.setAuthor("Suresh");
		   book1.setStore("abc");
		   book1.setTitle("Game");
		   result.add(book1);
		   return result;
	   }
	
}
