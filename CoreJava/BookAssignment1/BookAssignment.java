import java.util.Scanner;

import Exception.BookNotFoundException;
import Interfaces.BookStore;
import pojo.Book;

public class BookAssignment implements BookStore{

	@Override
	public Book[] getBooks() {
		Book books[] = new Book[5];
		try(Scanner sc = new Scanner(System.in);)
		{
			for(int i=0;i<1;i++)
			{
				System.out.println("enter book name: ");
				String name=sc.next().trim();
				System.out.println("enter book isbn: ");
				long isbn=sc.nextLong();
				System.out.println("enter book publication: ");
				String publication=sc.next().trim();
				System.out.println("enter book author: ");
				String author=sc.next().trim();
				System.out.println("enter book price: ");
				double price=sc.nextDouble();	
				books[i] =new Book(isbn, name, publication, author, price);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return books;
	}

	@Override
	public Book findBookById(Book[] books, long id) {
		Book mybook = null;
		for (Book book : books) {
			if (book.getIsbn() == id) {
				mybook = book;
				break;
			}
		}

		return mybook;
	}

	@Override
	public Book findBookByName(Book[] books, String name) {
		Book mybook = null;
		for (Book book : books) {
			if (book.getName() == name) {
				mybook = book;
				break;
			}
		}

		return mybook;
	}

	@Override
	public Book updateBook(Book[] books, long Id, double price) {
		Book mybook = null;
		for (Book book : books) {
			if (book.getIsbn() == Id) {
				book.setPrice(price);
				mybook = book;
				break;
			}
		}
		return mybook;
	}

	@Override
	public void displayAll(Book books[]) {
		for(Book book : books)
		{
			System.out.println("Book Name : "+book.getName());
			System.out.println("Book Id : "+book.getIsbn());
			System.out.println("Author : "+book.getAuthor());
			System.out.println("Publication : "+book.getPublication());
			System.out.println("Price : "+book.getPrice());
			System.out.println("-------------------------");
		}
		
	}
	public static void main(String[] args) {
		
		BookAssignment b1 = new BookAssignment();
		Book books[] = b1.getBooks();
		System.out.println("1.Find Book By Id" );
		System.out.println("2.Find Book By Name" );
		System.out.println("3.Update Book By Id" );
		System.out.println("4.Display all books" );
		System.out.println("5.exit" );
		Scanner sc =new Scanner(System.in);
	
		while(true)
		{	System.out.println("hi");
			int option =sc.nextInt();
			if(option==1)
			{
				System.out.println("enter the id of the book :");
				long id=sc.nextLong();
				Book book=b1.findBookById(books, id);
				if(book==null)
				{
					try {
						throw new BookNotFoundException("Book  Not Found ");
					} catch (BookNotFoundException e) {
						e.printStackTrace();
					}
				}
				else{
					System.out.println(book);
				}
				
			}
			else if(option==2)
			{
				System.out.println("enter the Name of the book :");
				String name=sc.next().trim();
				Book book=b1.findBookByName(books, name);
				if(book==null)
				{
					try {
						throw new BookNotFoundException("Book Not Found");
					} catch (BookNotFoundException e) {
						e.printStackTrace();
					}
				}
				else{
					System.out.println(book);
				}
			}
			else if(option==3)
			{
				System.out.println("enter the id of the book :");
				long id=sc.nextLong();
				System.out.println("enter the price of the book :");
				double price=sc.nextDouble();
				Book book=b1.updateBook(books, id, price);
				if(book==null)
				{
					try {
						throw new BookNotFoundException("Book Not Found");
					} catch (BookNotFoundException e) {
						e.printStackTrace();
					}
				}
				else{
					System.out.println(book);
				}
			}
			else if(option==4)
			{
				b1.displayAll(books);
			}
			else if(option==5)
			{
				System.out.println("exiting....");
				break;
			}
			else
			{
				System.out.println("enter a valid option...");
			}
		}
		
	}


}
