package com.service;

import com.model.Employee;

import java.util.List;

public interface EmployeeService
{
    void addEmployee(Employee employee);
    void deleteEmployee(int index);
    List<Employee> getAllEmployee();
    Employee getEmployeeByName(String name);

}
