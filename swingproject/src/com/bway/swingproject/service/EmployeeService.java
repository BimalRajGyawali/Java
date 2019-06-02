package com.bway.swingproject.service;

import java.util.List;

import com.bway.swingproject.model.Employee;

public interface EmployeeService 
{
	
	boolean addEmployee(Employee employee);
	boolean deleteEmployee(int id);
	boolean updateEmployee(Employee employee);
	Employee getByID(int id);
	List<Employee> getAllEmployees();

}
