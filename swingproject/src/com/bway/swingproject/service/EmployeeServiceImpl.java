package com.bway.swingproject.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.bway.swingproject.db.DB;
import com.bway.swingproject.model.Employee;


public class EmployeeServiceImpl implements EmployeeService
{
	
	Connection con = null;
	
	public EmployeeServiceImpl() {
		
		con = DB.getDBConnection();
	
	}

	@Override
	public boolean addEmployee(Employee employee) {
		
		String sql = "insert into employee(fname,lname,phone,gender,post,image,dateofbirth,dateofjoining,salary) values(?,?,?,?,?,?,?,?,?)";
		
	   try 
	   {
		   PreparedStatement stmt = con.prepareStatement(sql);
		
		   stmt.setString(1, employee.getFname());
		   stmt.setString(2, employee.getLname());
		   stmt.setString(3, employee.getPhone());
		   stmt.setString(4, employee.getGender());
		   stmt.setString(5, employee.getPost());
		   stmt.setString(6, employee.getImage());
		   stmt.setDate(7,employee.getDateOfBirth());
		   stmt.setDate(8, employee.getDateOfJoining());
		   stmt.setDouble(9, employee.getSalary());
		   
		   stmt.execute();
		   
		   return true;
		
		} 
	   catch (SQLException e) {
		
		      System.out.println(e);
	    }
		
		return false;
	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee getByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
