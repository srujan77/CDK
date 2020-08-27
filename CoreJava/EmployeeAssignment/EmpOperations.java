package com.io;

import com.pojo.Employee;

public interface EmpOperations {

	boolean addEmployee(Employee employee);
	Employee updateEmployee(int id, String name);
	Employee deleteEmployee(int id);
	Employee findEmployeeById(int id);
	void findAllEmployees();
}
