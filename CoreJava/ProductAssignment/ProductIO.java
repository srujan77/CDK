package com.io;

import java.util.Scanner;

import com.pojo.Product;

public class ProductIO {

	public Product getProduct(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the product id :");
		int pId=sc.nextInt();
		System.out.println("enter the product name :");
		String pName = sc.next().trim();
		System.out.println("enter the product price :");
		double price = sc.nextDouble();
		System.out.println("enter the product quantity :");
		int quantity= sc.nextInt();
		System.out.println("enter the product category :");
		String  category=sc.next().trim();
		sc.close();
		return new Product(pId, pName, price, quantity, category);
	}
	public void displayProduct(Product product)
	{
		System.out.println(product);
	}
	
}
