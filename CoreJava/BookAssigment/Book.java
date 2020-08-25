
public class Book {

	private long isbn;
	private String name, publication, author;
	private double price;

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Book(long isbn, String name, String publication, String author, double price) {
		this.isbn = isbn;
		this.name = name;
		this.publication = publication;
		this.author = author;
		this.price = price;
	}

	public Book() {
		isbn = 0;
		price = 0;
		name = publication = author = "";

	}

	public void display() {
		System.out.println("Book Name : " + name);
		System.out.println("isbn : " + isbn);
		System.out.println("Publication : " + publication);
		System.out.println("Author : " + author);
		System.out.println("Price : " + price);
	}

}
