package com.Exception;

public class ProductNotFoundException extends Exception {
private String message;
	
	public ProductNotFoundException(){
		
	}

	public ProductNotFoundException(String message) {
		super(message);
		this.message = message;
	}
	
	public void displayMessage(){
		System.out.println(getMessage());
	}

}
