package com.io;

import java.util.ArrayList;
import java.util.List;

import com.pojo.Employee;

public class MyEmpOperations implements EmpOperations {

	EmpIOImpl myobj = new EmpIOImpl();
	@Override
	public boolean addEmployee(Employee employee) {
		List<Employee> employees ;
		employees= myobj.readFromFile();
		if(employees==null)
			employees=new ArrayList<Employee>();
		
		employees.add(employee);
		if(myobj.addToFile(employees))
			return true;
		return false;
	}

	@Override
	public Employee updateEmployee(int id, String name) {
		List<Employee> employees ;
		Employee myemployee = null;
		employees= myobj.readFromFile();
		if(employees==null)
			return myemployee;
		for(Employee employee : employees)
		{
			if (employee.getempId()==id)
			{
				employee.setempName(name);
				myemployee=employee;
				break;
			}
		}
		if(myemployee!=null)
		{
			myobj.addToFile(employees);
		}
		return myemployee;
	}

	@Override
	public Employee deleteEmployee(int id) {
		List<Employee> employees ;
		Employee myemployee = null;
		employees= myobj.readFromFile();
		if(employees==null)
			return myemployee;
		for(Employee employee : employees)
		{
			if (employee.getempId()==id)
			{
				myemployee=employee;
				employees.remove(employee);
				break;
			}
		}
		if(myemployee!=null)
		{
			myobj.addToFile(employees);
		}
		return myemployee;
	}

	@Override
	public Employee findEmployeeById(int id) {
		List<Employee> employees ;
		Employee myemployee = null;
		employees= myobj.readFromFile();
		if(employees==null)
			return myemployee;
		for(Employee employee : employees)
		{
			if (employee.getempId()==id)
			{
				myemployee=employee;
				break;
			}
		}
		return myemployee;
	}

	@Override
	public void findAllEmployees() {
		List<Employee> employees ;
		employees= myobj.readFromFile();
		if(employees==null)
			System.out.println("no employees found");
		else{
		for(Employee employee : employees)
		{
			myobj.displayToUser(employee);
		}
		}
	}

}
