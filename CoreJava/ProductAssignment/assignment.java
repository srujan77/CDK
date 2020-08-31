//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import com.Dao.ProductDAO;
import com.Exception.ProductNotFoundException;
import com.io.ProductIO;
import com.pojo.Product;

public class assignment {
	static Scanner sc = new Scanner (System.in);
	//static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
	
		ProductDAO dao = new ProductDAO();
		ProductIO io = new ProductIO();
//		Scanner sc = new Scanner (System.in);
		System.out.println("1.add product");
		System.out.println("2.update product  price by id");
		System.out.println("3.update product quantity by id");
		System.out.println("4.find product by id");
		System.out.println("5.find product by category");
		System.out.println("6.find all");
		System.out.println("7.exit");
		boolean flag=true;
		while(flag)
		{
			System.out.println("enter the option : ");
			//Scanner s =  new Scanner(System.in);
			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			int option=7;
//			try {
//				option =Integer.parseInt( br.readLine());
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
			int option = Integer.parseInt(sc.next());
			//s.close();
			switch(option)
			{
			case 1:
			{
				int value=dao.addProduct(io.getProduct());
				if (value>0)
				{
					System.out.println("product added...");
				}
				else
				{
					try {
						throw new ProductNotFoundException("product can't be added...");
						}
					catch (ProductNotFoundException e) 
					{
						e.printStackTrace();
					} 
				}
				break;
			}
			case 2:
			{
				System.out.println("enter the id : ");
				int id=sc.nextInt();
				System.out.println("enter the new price : ");
				double price = sc.nextDouble();
				boolean updated=dao.updateProduct(id, price);
				if(updated)
					System.out.println("product price updated...");
				else{
					try {
						throw new ProductNotFoundException("product not found...");
					} catch (ProductNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				}
				break;
			}
			case 3:
			{
				System.out.println("enter the id : ");
				int id=sc.nextInt();
				System.out.println("enter the new quantity : ");
				int quantity = sc.nextInt();
				boolean updated=dao.updateProduct(id, quantity);
				if(updated)
					System.out.println("product quantity updated...");
				else{
					try {
						throw new ProductNotFoundException("product not found...");
					} catch (ProductNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				}
				break;
			}
			case 4:
			{
				System.out.println("enter the id of product to find : ");
				int id = sc.nextInt();
				Product product;
				product=dao.findById(id);
				if(product==null)
				{
					try {
						throw new ProductNotFoundException("product not found...");
					} catch (ProductNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				}
				else
				{
					io.displayProduct(product);
				}
				break;
			}
			case 5:
			{
				System.out.println("enter the category of product to find : ");
				String category=sc.next().trim();
				List<Product> products;
				products=dao.findAllByCategory(category);
				if(products.size()==0)
				{
					try {
						throw new ProductNotFoundException("No products found...");
					} catch (ProductNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				}
				else
				{
					products.forEach(io::displayProduct);
//					for(Product product: products)
//						io.displayProduct(product);
				}
				break;
			}
			case 6 :
			{
				List<Product> products;
				products=dao.findAll();
				if(products.size()==0)
				{
					try {
						throw new ProductNotFoundException("No products found...");
					} catch (ProductNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				}
				else
				{
					products.forEach(io::displayProduct);
//					for(Product product: products)
//						io.displayProduct(product);
				}
				break;
			}
			case 7:
			{
				System.out.println("exiting...");
				flag=false;
				break;
				
			}
			default:
			{
				System.out.println("enter a valid option");
				break;
			}
				
			}
		}
	//	sc.close();
	}

}
