
public class Assignment1 {

	public static void main(String args[]) {
		BookStore mybookstore = new BookStore();
		Book books[] = mybookstore.getBooks();
		Book mybook;
		for (Book book : books) {
			book.display();
			System.out.println("------------------");
		}
		long id = 128;
		System.out.println("information of book with id " + id);
		mybook=mybookstore.findBookById(books, id);
		if(mybook==null)
		{
			System.out.println("book with id "+ id + " not found");
		}
		else
		{
			mybook.display();
			System.out.println("--------------------");
			System.out.println("information of book with id " + id + " after updating price is :");
			mybookstore.updateBook(books, id, 999).display();
		}
	}

}
