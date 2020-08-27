package Day4;


public class PersonNotFoundException extends Exception {
private String message;
	
	public PersonNotFoundException(){
		
	}

	public PersonNotFoundException(String message) {
		super(message);
		this.message = message;
	}
	
	public void displayMessage(){
		System.out.println(getMessage());
	}
	
}


