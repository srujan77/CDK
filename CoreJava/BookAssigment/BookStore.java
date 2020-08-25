
public class BookStore {

	public Book[] getBooks() {
		Book books[] = new Book[5];
		books[0] = new Book(1287, "The Light", "Scientific publishers", "Krishna", 2999);
		books[1] = new Book(2231, "Pokemon", "Niantic publishers", "Ash", 1999);
		books[2] = new Book(3167, "Energy", "Edison publishers", "Edison", 1599);
		books[3] = new Book(2212, "Mr.Bean", "Cartoons publishers", "Jean", 999);
		books[4] = new Book(1111, "Forms of Energy", "Edison publishers", "Edison", 1320);

		return books;
	}

	public Book findBookById(Book books[], long Id) {
		Book mybook = null;
		for (Book book : books) {
			if (book.getIsbn() == Id) {
				mybook = book;
				break;
			}
		}

		return mybook;
	}

	public Book updateBook(Book books[], long Id, double price) {
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
}
