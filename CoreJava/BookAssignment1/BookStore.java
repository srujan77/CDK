package Interfaces;

import pojo.Book;

public interface BookStore {

	public Book[] getBooks();
	public Book findBookById(Book books[], long id);
	public Book findBookByName(Book books[], String  name);
	public Book updateBook(Book books[], long Id, double price);
	public void displayAll(Book books[]);
	
}
