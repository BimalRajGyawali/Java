package com.view;

import com.model.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;

import java.util.List;
import java.util.Scanner;

public class RunEmployee
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeServiceImpl();
        String choice ;

        do
          {
              Employee employee = new Employee();

              System.out.println("Enter name :");
              employee.setName(scanner.next());

              System.out.println("Enter address :");
              employee.setAddress(scanner.next());

              System.out.println("Enter phone :");
              employee.setPhone(scanner.next());

              employeeService.addEmployee(employee);

              System.out.println("Do you want to continue [y/n]");
              choice = scanner.next();


          } while (choice.equalsIgnoreCase("y"));


         // displaying employees

        List<Employee> employeeList = employeeService.getAllEmployee();

        for (Employee employee : employeeList)
        {
            System.out.println(employee);
        }

        System.out.println("============================================");

        //get employee by name

        Employee employee = employeeService.getEmployeeByName("Ram");

        if(employee != null)
            System.out.println(employee);

        else
            System.out.println("Not Found");

        System.out.println("==============================================");

        // delete employee at any index

        employeeService.deleteEmployee(1);


    }
}
