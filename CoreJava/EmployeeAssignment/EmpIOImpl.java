package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pojo.Address;
import com.pojo.Employee;


public class EmpIOImpl implements EmpIO {
	Path path = Paths.get("my data.txt");

	@Override
	public boolean addToFile(List<Employee> employees) {
		boolean flag=false;
		try (FileOutputStream fo = new FileOutputStream("my data.txt");
				ObjectOutputStream oo = new ObjectOutputStream(fo);) 
		{
	//		oo.writeObject(employees);
			for(Employee employee : employees){
				oo.writeObject(employee);}
			flag=true;
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public List<Employee> readFromFile() {
		List<Employee> employees;
		if(Files.exists(path)){
		employees = new ArrayList<Employee>();
		try(FileInputStream fi = new FileInputStream("my data.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);)
		{
		Object o =null;
		while(fi.available()!=0)
		{
			o=oi.readObject();
			Employee employee =(Employee) o;
			employees.add(employee);
		}
//		while ((o = oi.readObject()) != null) {
//			Employee employee =(Employee) o;
//			employees.add(employee);
//		}
		}
		catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		}
		else{
			employees=null;
		}
		return employees;
	}

	@Override
	public Employee readFromUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee id :");
		int id=sc.nextInt();
		System.out.println("enter employe ename :");
		String name= sc.next().trim();
		System.out.println("enter city_name : ");
		String city_name=sc.next().trim();
		System.out.println("enter pincode : ");
		String pincode=sc.next().trim();
		System.out.println("enter state:");
		String state=sc.next().trim();
		sc.close();
		return new Employee(id, name, new Address(city_name, pincode, state) );
	}

	@Override
	public void displayToUser(Employee emp) {
		System.out.println(emp);
	}

}
