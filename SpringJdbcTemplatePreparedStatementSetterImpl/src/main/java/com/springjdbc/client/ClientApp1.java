package com.springjdbc.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.EmployeeDAO;
import com.springjdbc.dto.Employee;

public class ClientApp1 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/config/myBeans.xml");
    	EmployeeDAO employeeDAO = context.getBean("empDao",EmployeeDAO.class);
    	
    	Employee employee = new Employee();
    	employee.setEmployeeId(63);
    	employee.setEmployeeName("Siva");
    	employee.setSalary(75000);
    	
    	int count = employeeDAO.registerEmployee(employee);
    	
    	System.out.println("Employee Registered Successfully :: "+ count);
    	
    }
}
