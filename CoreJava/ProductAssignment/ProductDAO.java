package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//import java.sql.Statement;
//import java.util.Scanner;
import java.util.List;

import com.pojo.Product;

public class ProductDAO {

	public int addProduct(Product product)
	{
		int value=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott1","tiger1");
			//System.out.println("got the connection");
			String insertdata="insert into product values(?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(insertdata);
			ps.setInt(1, product.getpId());
			ps.setString(2, product.getpName());
			ps.setDouble(3, product.getPrice());
			ps.setInt(4,product.getQuantity());
			ps.setString(5, product.getCategory());
			int row_inserted=ps.executeUpdate();
			value=row_inserted;
		}
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}
	public boolean updateProduct(int pId, double price){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott1", "tiger1");
			//System.out.println("got connected");
			String updatedata = "update product set price= ? where pId = ?  ";
			PreparedStatement ps = con.prepareStatement(updatedata);
			ps.setDouble(1, price);
			ps.setInt(2, pId);
			int updated= ps.executeUpdate();
			if (updated>0)
				return true;
		}
		 catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		return false;
	}
	
	public boolean updateProduct(int pId, int quantity){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott1", "tiger1");
			//System.out.println("got connected");
			String updatedata = "update product set quantity= ? where pId = ?  ";
			PreparedStatement ps = con.prepareStatement(updatedata);
			ps.setInt(1, quantity);
			ps.setInt(2, pId);
			int updated= ps.executeUpdate();
			if (updated>0)
				return true;
		}
		 catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		return false;
		
	}
	
	public Product findById(int pId){
		Product product = null;
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott1", "tiger1");
		//System.out.println("got connected");
		String finddata = "select * from Product where pId= ?";
		PreparedStatement ps = con.prepareStatement(finddata);
		ps.setInt(1, pId);
		ResultSet set = ps.executeQuery();
		while(set.next())
		{
			int pid = set.getInt(1);
			String pName=set.getString(2);
			double price=set.getDouble(3);
			int quantity=set.getInt(4);
			String category = set.getString(5);
			product = new Product(pid, pName, price, quantity, category);
			return product;	
		}
		
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return product;
	}
	
	public List<Product> findAllByCategory(String category){
		List<Product> products = new ArrayList<>();
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott1", "tiger1");
		//System.out.println("got connected");
		String finddata = "select * from Product where category= ?";
		PreparedStatement ps = con.prepareStatement(finddata);
		ps.setString(1, category);
		ResultSet set = ps.executeQuery();
		while(set.next())
		{
			int pid = set.getInt(1);
			String pName=set.getString(2);
			double price=set.getDouble(3);
			int quantity=set.getInt(4);
			String mycategory = set.getString(5);
			Product product = new Product(pid, pName, price, quantity, mycategory);
			products.add(product);	
		}
		
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return products;
		
	}
	
	public List<Product> findAll(){
		List<Product> products = new ArrayList<>();
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott1", "tiger1");
		//System.out.println("got connected");
		String finddata = "select * from Product ";
		PreparedStatement ps = con.prepareStatement(finddata);
		ResultSet set = ps.executeQuery();
		while(set.next())
		{
			int pid = set.getInt(1);
			String pName=set.getString(2);
			double price=set.getDouble(3);
			int quantity=set.getInt(4);
			String mycategory = set.getString(5);
			Product product = new Product(pid, pName, price, quantity, mycategory);
			products.add(product);	
		}
		
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return products;
		
		
	}

	
	
}
