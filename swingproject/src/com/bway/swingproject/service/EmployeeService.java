package com.bway.swingproject.service;

import java.util.List;

import com.bway.swingproject.model.Employee;

public interface EmployeeService 
{
	
	boolean addEmployee(Employee employee);
	boolean deleteEmployee(int id);
	boolean updateEmployee(Employee employee);
	boolean doesExist(int id);
	boolean isUserVerified(String username,String password);
	boolean signUp(String username,String password);
	Employee getByID(int id);
	List<Employee> getAllEmployees();
    List<Employee> searchEmployees(String input);

}
