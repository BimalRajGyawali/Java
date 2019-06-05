package com.bway.swingproject.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

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
		
		String sql = "delete from employee where id = ?";
		
		try {
			   
			
			   PreparedStatement stmt = con.prepareStatement(sql);
			   stmt.setInt(1, id);
		       stmt.execute();
			
			return true;

			
		
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		  
		}
	
		return false;
		
}

	@Override
	public boolean updateEmployee(Employee employee) {
		
	     int id = employee.getId();
	     String fName = employee.getFname();
	     String lName = employee.getLname();
	     String phone = employee.getPhone();
	     Double salary = employee.getSalary();
	     String gender = employee.getGender();
	     String post = employee.getPost();
	     Date dateOfBirth = employee.getDateOfBirth();
	     Date dateOfJoining = employee.getDateOfJoining();
		
		
		String sql = "update employee "
				+ "set "
				+ "fname = ?, lname = ?,phone = ?,salary = ?,gender = ?,"
				+ "post = ?,dateofbirth = ?, dateofjoining = ?"
				+ "where id = ?";
		
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, fName);
			stmt.setString(2, lName);
			stmt.setString(3, phone);
			stmt.setDouble(4, salary);
			stmt.setString(5, gender);
			stmt.setString(6, post);
			stmt.setDate(7, dateOfBirth);
			stmt.setDate(8, dateOfJoining);
			stmt.setInt(9, id);
			
			stmt.execute();
			
			return true;
			
			} 
		
	   catch (SQLException e) 
		{
		
			e.printStackTrace();
		}
		 
	
	return false;
	}

	@Override
	public Employee getByID(int id) {
		
		String sql = "select * from employee where id = ?";
		Employee employee = new Employee();
		
		try {
			    PreparedStatement stmt = con.prepareStatement(sql);
			    stmt.setInt(1, id);
			    ResultSet resultSet = stmt.executeQuery();
			    
			    if(resultSet.next())
			    {
			    	   employee.setId(resultSet.getInt("id"));
			    	   employee.setFname(resultSet.getString("fname"));
			    	   employee.setLname(resultSet.getString("lname"));
			    	   employee.setPhone(resultSet.getString("phone"));
			    	   employee.setSalary(resultSet.getDouble("salary"));
			    	   employee.setPost(resultSet.getString("post"));
			    	   employee.setDateOfBirth(resultSet.getDate("dateofbirth"));
			    	   employee.setDateOfJoining(resultSet.getDate("dateofjoining"));
			    	   employee.setGender(resultSet.getString("gender"));
			    	   
			    	 
			    }
			
			
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() 
	{
	
		List <Employee> employees = new ArrayList<>();
		
		
		String sql = "select * from employee";
		
		try {
			   PreparedStatement stmt = con.prepareStatement(sql);
			
		       ResultSet resultSet = stmt.executeQuery();
		       
		       while(resultSet.next())
		       {
		    	   Employee employee = new Employee();
		    	   employee.setId(resultSet.getInt("id"));
		    	   employee.setFname(resultSet.getString("fname"));
		    	   employee.setLname(resultSet.getString("lname"));
		    	   employee.setPhone(resultSet.getString("phone"));
		    	   employee.setSalary(resultSet.getDouble("salary"));
		    	   employee.setPost(resultSet.getString("post"));
		    	   employee.setDateOfBirth(resultSet.getDate("dateofbirth"));
		    	   employee.setDateOfJoining(resultSet.getDate("dateofjoining"));
		    	   employee.setGender(resultSet.getString("gender"));
		    	   
		    	   employees.add(employee);
		    	   
		       }
			   
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
		
		
		
		return employees;
	}

	@Override
	public boolean doesExist(int id) {
		
		String sql = "select * from employee";
		
		try {
			    PreparedStatement stmt = con.prepareStatement(sql);
			     
			    ResultSet resultSet = stmt.executeQuery();
			    
			    while(resultSet.next())
			    {
			    	if(resultSet.getInt("id") == id )
			    	{
			    		return true;
			    	}
			    }
			
			
			
			
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		
		
		
		
		return false;
	}
	

}
