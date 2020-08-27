package Exception;

public class BookNotFoundException extends Exception {
private String message;
	
	public BookNotFoundException(){
		
	}

	public BookNotFoundException(String message) {
		super(message);
		this.message = message;
	}
	
	public void displayMessage(){
		System.out.println(getMessage());
	}
	
}

