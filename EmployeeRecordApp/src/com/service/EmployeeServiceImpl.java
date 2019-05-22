package com.service;

import com.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService
{
    static List<Employee> employeeList = new ArrayList<>();

    @Override
    public void addEmployee(Employee employee)
    {
        employeeList.add(employee);
        System.out.println("Employee added successfully : size "+employeeList.size());

    }

    @Override
    public void deleteEmployee(int index)
    {
         employeeList.remove(index);
         System.out.println("Employee Removed Successfully : Size "+employeeList.size());
    }

    @Override
    public List<Employee> getAllEmployee()
    {

        return employeeList;
    }

    @Override
    public Employee getEmployeeByName(String name)
    {
        for(Employee e : employeeList)
        {
            if(e.getName().equals(name))
                return e;
        }

        return null;
    }
}
